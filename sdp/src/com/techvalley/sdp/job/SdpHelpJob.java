package com.techvalley.sdp.job;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.techvalley.sdp.dbcon.databaseConnection;
import com.techvalley.sdp.sender.SdpHelpSender;

public class SdpHelpJob implements Job {

	databaseConnection databaseConn = new databaseConnection();
	SdpHelpSender sdpHelpSender = new SdpHelpSender();
	
	CallableStatement SDPHelpSenderCallableStatement = null;
    ResultSet SDPHelpSenderResult = null;
	String SDPHelpSmsSender = "{ call sp_HelpSmsSender() }";
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		try{
			
			SDPHelpSenderCallableStatement = databaseConn.mtnDBConnection().prepareCall(SDPHelpSmsSender);	
			SDPHelpSenderResult = SDPHelpSenderCallableStatement.executeQuery();
		           
			while(SDPHelpSenderResult.next()) {
            	
            	sdpHelpSender.HelpSmsSender(SDPHelpSenderResult.getString("spId"), SDPHelpSenderResult.getString("spPassword"), 
            			SDPHelpSenderResult.getString("serviceId"), SDPHelpSenderResult.getString("timeStamp"), SDPHelpSenderResult.getString("linkid"), 
            			SDPHelpSenderResult.getString("msisdn"), SDPHelpSenderResult.getString("shortCode"), SDPHelpSenderResult.getString("message"), 
            			SDPHelpSenderResult.getString("correlator"));

		   }  
			
			SDPHelpSenderResult.close();
					
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			cleanConnection();
		}	
						
	}
	
	private void cleanConnection() {

		try{
		
	        if (databaseConn.mtnDBConnection() != null) {
	        	databaseConn.mtnDBConnection().close();
	        }
	
	         if (SDPHelpSenderCallableStatement != null){
	        	 SDPHelpSenderCallableStatement.close();
	        }
	         
	         if(SDPHelpSenderResult != null){
	        	 SDPHelpSenderResult.close();
	         }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }

}
