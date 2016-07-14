package com.techvalley.sdp.job;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.techvalley.sdp.dbcon.databaseConnection;
import com.techvalley.sdp.sender.SdpUnsubscriptionSender;

public class SDPUnsubscriptionJob implements Job {
	
	databaseConnection databaseConn = new databaseConnection();
	SdpUnsubscriptionSender sdpUnsubscriptionSender = new SdpUnsubscriptionSender();

	CallableStatement SDPUnsubscribeSenderCallableStatement = null;
    ResultSet SDPUnsubscribeSenderResult = null;
	String SDPUnsubscribeSmsSender = "{ call sp_unsubscriptionSmsSender() }";
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		try{
			
			SDPUnsubscribeSenderCallableStatement = databaseConn.sdpUnsubDBConnection().prepareCall(SDPUnsubscribeSmsSender);
			SDPUnsubscribeSenderResult  = SDPUnsubscribeSenderCallableStatement.executeQuery();
			
			while(SDPUnsubscribeSenderResult.next()) {
				
				sdpUnsubscriptionSender.unsubscribeSender(SDPUnsubscribeSenderResult.getString("spId"), SDPUnsubscribeSenderResult.getString("password"), 
						SDPUnsubscribeSenderResult.getString("timeStamp"), SDPUnsubscribeSenderResult.getString("msisdn"), SDPUnsubscribeSenderResult.getString("productId"),
						Boolean.parseBoolean(SDPUnsubscribeSenderResult.getString("isAutoExtend")), SDPUnsubscribeSenderResult.getString("channelId"));
				// SELECT `Id`, `spId`, `password`, `timeStamp`, `msisdn`, `productId`, `isAutoExtend`, `channelId` FROM `tbl_subscription` WHERE isSent = 0 LIMIT 3;
				
			}
			
			SDPUnsubscribeSenderResult.close();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			cleanConnection();
		}
		
		
	}
	
	private void cleanConnection() {

		try{
		
	        if (databaseConn.sdpUnsubDBConnection() != null) {
	        	databaseConn.sdpUnsubDBConnection().close();
	        }
	
	         if (SDPUnsubscribeSenderCallableStatement != null){
	        	 SDPUnsubscribeSenderCallableStatement.close();
	        }
	         
	         if(SDPUnsubscribeSenderResult != null){
	        	 SDPUnsubscribeSenderResult.close();
	         }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	

}
