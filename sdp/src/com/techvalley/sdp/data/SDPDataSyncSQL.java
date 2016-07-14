package com.techvalley.sdp.data;

import java.sql.CallableStatement;

import com.techvalley.sdp.dbcon.SDPDataSyncConnection;

public class SDPDataSyncSQL {
	
	SDPDataSyncConnection DataSyncCon = new SDPDataSyncConnection();
	
	CallableStatement SDPDataSyncCallableStatement = null;
	String SDPDataSyncCall = "{ call sp_sdpdatasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1880DataSyncCallableStatement = null;
	String SDP1880DataSyncCall = "{ call sp_sdp1880datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1881DataSyncCallableStatement = null;
	String SDP1881DataSyncCall = "{ call sp_sdp1881datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1882DataSyncCallableStatement = null;
	String SDP1882DataSyncCall = "{ call sp_sdp1882datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1883DataSyncCallableStatement = null;
	String SDP1883DataSyncCall = "{ call sp_sdp1883datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1884DataSyncCallableStatement = null;
	String SDP1884DataSyncCall = "{ call sp_sdp1884datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1885DataSyncCallableStatement = null;
	String SDP1885DataSyncCall = "{ call sp_sdp1885datasync(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";	
	
	
	public void SDPDataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, String serviceList, 
			String updateType, String updateTime, String updateDesc, String effectiveTime, String expiryTime,
			String Starttime, String keyWord, String cycleEndTime, String operatorID, String transactionID, 
			String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDPDataSyncCallableStatement = DataSyncCon.DataSyncConnection().prepareCall(SDPDataSyncCall);
			SDPDataSyncCallableStatement.setString(1, msisdn);
			SDPDataSyncCallableStatement.setString(2, spID);
			SDPDataSyncCallableStatement.setString(3, productID);
			SDPDataSyncCallableStatement.setString(4, serviceID);
			SDPDataSyncCallableStatement.setString(5, serviceList);
			SDPDataSyncCallableStatement.setString(6, updateType);
			SDPDataSyncCallableStatement.setString(7, updateTime);
			SDPDataSyncCallableStatement.setString(8, updateDesc);
			SDPDataSyncCallableStatement.setString(9, effectiveTime);
			SDPDataSyncCallableStatement.setString(10, expiryTime);
			
			SDPDataSyncCallableStatement.setString(11, Starttime);
			SDPDataSyncCallableStatement.setString(12, keyWord);
			SDPDataSyncCallableStatement.setString(13, cycleEndTime);
			SDPDataSyncCallableStatement.setString(14, operatorID);
			SDPDataSyncCallableStatement.setString(15, transactionID);
			SDPDataSyncCallableStatement.setString(16, orderKey);
			SDPDataSyncCallableStatement.setString(17, channelID);
			
			SDPDataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDPDataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			cleanConnection();
		}
		
	}
	
	
	public void SDP1880DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1880DataSyncCallableStatement = DataSyncCon.SDP1880DataSyncConnection().prepareCall(SDP1880DataSyncCall);
			SDP1880DataSyncCallableStatement.setString(1, msisdn);
			SDP1880DataSyncCallableStatement.setString(2, spID);
			SDP1880DataSyncCallableStatement.setString(3, productID);
			SDP1880DataSyncCallableStatement.setString(4, serviceID);
			SDP1880DataSyncCallableStatement.setString(5, serviceList);
			SDP1880DataSyncCallableStatement.setString(6, updateType);
			SDP1880DataSyncCallableStatement.setString(7, updateTime);
			SDP1880DataSyncCallableStatement.setString(8, updateDesc);
			SDP1880DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1880DataSyncCallableStatement.setString(10, expiryTime);	
			
			SDP1880DataSyncCallableStatement.setString(11, Starttime);
			SDP1880DataSyncCallableStatement.setString(12, keyWord);
			SDP1880DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1880DataSyncCallableStatement.setString(14, operatorID);
			SDP1880DataSyncCallableStatement.setString(15, transactionID);
			SDP1880DataSyncCallableStatement.setString(16, orderKey);
			SDP1880DataSyncCallableStatement.setString(17, channelID);
			
			SDP1880DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1880DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1880Connection();
		}
		
	}
	
	
	public void SDP1881DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1881DataSyncCallableStatement = DataSyncCon.SDP1881DataSyncConnection().prepareCall(SDP1881DataSyncCall);
			SDP1881DataSyncCallableStatement.setString(1, msisdn);
			SDP1881DataSyncCallableStatement.setString(2, spID);
			SDP1881DataSyncCallableStatement.setString(3, productID);
			SDP1881DataSyncCallableStatement.setString(4, serviceID);
			SDP1881DataSyncCallableStatement.setString(5, serviceList);
			SDP1881DataSyncCallableStatement.setString(6, updateType);
			SDP1881DataSyncCallableStatement.setString(7, updateTime);
			SDP1881DataSyncCallableStatement.setString(8, updateDesc);
			SDP1881DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1881DataSyncCallableStatement.setString(10, expiryTime);
			
			SDP1881DataSyncCallableStatement.setString(11, Starttime);
			SDP1881DataSyncCallableStatement.setString(12, keyWord);
			SDP1881DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1881DataSyncCallableStatement.setString(14, operatorID);
			SDP1881DataSyncCallableStatement.setString(15, transactionID);
			SDP1881DataSyncCallableStatement.setString(16, orderKey);
			SDP1881DataSyncCallableStatement.setString(17, channelID);
			
			SDP1881DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1881DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1881Connection();
		}
		
	}
	
	public void SDP1882DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1882DataSyncCallableStatement = DataSyncCon.SDP1882DataSyncConnection().prepareCall(SDP1882DataSyncCall);
			SDP1882DataSyncCallableStatement.setString(1, msisdn);
			SDP1882DataSyncCallableStatement.setString(2, spID);
			SDP1882DataSyncCallableStatement.setString(3, productID);
			SDP1882DataSyncCallableStatement.setString(4, serviceID);
			SDP1882DataSyncCallableStatement.setString(5, serviceList);
			SDP1882DataSyncCallableStatement.setString(6, updateType);
			SDP1882DataSyncCallableStatement.setString(7, updateTime);
			SDP1882DataSyncCallableStatement.setString(8, updateDesc);
			SDP1882DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1882DataSyncCallableStatement.setString(10, expiryTime);
			
			SDP1882DataSyncCallableStatement.setString(11, Starttime);
			SDP1882DataSyncCallableStatement.setString(12, keyWord);
			SDP1882DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1882DataSyncCallableStatement.setString(14, operatorID);
			SDP1882DataSyncCallableStatement.setString(15, transactionID);
			SDP1882DataSyncCallableStatement.setString(16, orderKey);
			SDP1882DataSyncCallableStatement.setString(17, channelID);			
			
			SDP1882DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1882DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1882Connection();
		}
		
	}
	
	public void SDP1883DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1883DataSyncCallableStatement = DataSyncCon.SDP1883DataSyncConnection().prepareCall(SDP1883DataSyncCall);
			SDP1883DataSyncCallableStatement.setString(1, msisdn);
			SDP1883DataSyncCallableStatement.setString(2, spID);
			SDP1883DataSyncCallableStatement.setString(3, productID);
			SDP1883DataSyncCallableStatement.setString(4, serviceID);
			SDP1883DataSyncCallableStatement.setString(5, serviceList);
			SDP1883DataSyncCallableStatement.setString(6, updateType);
			SDP1883DataSyncCallableStatement.setString(7, updateTime);
			SDP1883DataSyncCallableStatement.setString(8, updateDesc);
			SDP1883DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1883DataSyncCallableStatement.setString(10, expiryTime);
			
			SDP1883DataSyncCallableStatement.setString(11, Starttime);
			SDP1883DataSyncCallableStatement.setString(12, keyWord);
			SDP1883DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1883DataSyncCallableStatement.setString(14, operatorID);
			SDP1883DataSyncCallableStatement.setString(15, transactionID);
			SDP1883DataSyncCallableStatement.setString(16, orderKey);
			SDP1883DataSyncCallableStatement.setString(17, channelID);	
			
			SDP1883DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1883DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1883Connection();
		}
		
	}
	
	public void SDP1884DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1884DataSyncCallableStatement = DataSyncCon.SDP1884DataSyncConnection().prepareCall(SDP1884DataSyncCall);
			SDP1884DataSyncCallableStatement.setString(1, msisdn);
			SDP1884DataSyncCallableStatement.setString(2, spID);
			SDP1884DataSyncCallableStatement.setString(3, productID);
			SDP1884DataSyncCallableStatement.setString(4, serviceID);
			SDP1884DataSyncCallableStatement.setString(5, serviceList);
			SDP1884DataSyncCallableStatement.setString(6, updateType);
			SDP1884DataSyncCallableStatement.setString(7, updateTime);
			SDP1884DataSyncCallableStatement.setString(8, updateDesc);
			SDP1884DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1884DataSyncCallableStatement.setString(10, expiryTime);
			
			SDP1884DataSyncCallableStatement.setString(11, Starttime);
			SDP1884DataSyncCallableStatement.setString(12, keyWord);
			SDP1884DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1884DataSyncCallableStatement.setString(14, operatorID);
			SDP1884DataSyncCallableStatement.setString(15, transactionID);
			SDP1884DataSyncCallableStatement.setString(16, orderKey);
			SDP1884DataSyncCallableStatement.setString(17, channelID);	
			
			SDP1884DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1884DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1884Connection();
		}
		
	}
	
	public void SDP1885DataSyncSQLObject( String msisdn, String spID, String productID, String serviceID, 
			String serviceList, String updateType, String updateTime, String updateDesc, String effectiveTime, 
			String expiryTime, String Starttime, String keyWord, String cycleEndTime, String operatorID, 
			String transactionID, String orderKey, String channelID, String TraceUniqueID ){
		
		try{
			SDP1885DataSyncCallableStatement = DataSyncCon.SDP1885DataSyncConnection().prepareCall(SDP1885DataSyncCall);
			SDP1885DataSyncCallableStatement.setString(1, msisdn);
			SDP1885DataSyncCallableStatement.setString(2, spID);
			SDP1885DataSyncCallableStatement.setString(3, productID);
			SDP1885DataSyncCallableStatement.setString(4, serviceID);
			SDP1885DataSyncCallableStatement.setString(5, serviceList);
			SDP1885DataSyncCallableStatement.setString(6, updateType);
			SDP1885DataSyncCallableStatement.setString(7, updateTime);
			SDP1885DataSyncCallableStatement.setString(8, updateDesc);
			SDP1885DataSyncCallableStatement.setString(9, effectiveTime);
			SDP1885DataSyncCallableStatement.setString(10, expiryTime);
			
			SDP1885DataSyncCallableStatement.setString(11, Starttime);
			SDP1885DataSyncCallableStatement.setString(12, keyWord);
			SDP1885DataSyncCallableStatement.setString(13, cycleEndTime);
			SDP1885DataSyncCallableStatement.setString(14, operatorID);
			SDP1885DataSyncCallableStatement.setString(15, transactionID);
			SDP1885DataSyncCallableStatement.setString(16, orderKey);
			SDP1885DataSyncCallableStatement.setString(17, channelID);	
			
			SDP1885DataSyncCallableStatement.setString(18, TraceUniqueID);
			
			SDP1885DataSyncCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			clean1885Connection();
		}
		
	}
	
	
	
	private void cleanConnection() {

		try{
		
	        if (DataSyncCon.DataSyncConnection() != null) {
	        	DataSyncCon.DataSyncConnection().close();
	        }
	
	         if (SDPDataSyncCallableStatement != null){
	        	 SDPDataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1880Connection() {

		try{
		
	        if (DataSyncCon.SDP1880DataSyncConnection() != null) {
	        	DataSyncCon.SDP1880DataSyncConnection().close();
	        }
	
	         if (SDP1880DataSyncCallableStatement != null){
	        	 SDP1880DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1881Connection() {

		try{
		
	        if (DataSyncCon.SDP1881DataSyncConnection() != null) {
	        	DataSyncCon.SDP1881DataSyncConnection().close();
	        }
	
	         if (SDP1881DataSyncCallableStatement != null){
	        	 SDP1881DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1882Connection() {

		try{
		
	        if (DataSyncCon.SDP1882DataSyncConnection() != null) {
	        	DataSyncCon.SDP1882DataSyncConnection().close();
	        }
	
	         if (SDP1882DataSyncCallableStatement != null){
	        	 SDP1882DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1883Connection() {

		try{
		
	        if (DataSyncCon.SDP1883DataSyncConnection() != null) {
	        	DataSyncCon.SDP1883DataSyncConnection().close();
	        }
	
	         if (SDP1883DataSyncCallableStatement != null){
	        	 SDP1883DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1884Connection() {

		try{
		
	        if (DataSyncCon.SDP1884DataSyncConnection() != null) {
	        	DataSyncCon.SDP1884DataSyncConnection().close();
	        }
	
	         if (SDP1884DataSyncCallableStatement != null){
	        	 SDP1884DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1885Connection() {

		try{
		
	        if (DataSyncCon.SDP1885DataSyncConnection() != null) {
	        	DataSyncCon.SDP1885DataSyncConnection().close();
	        }
	
	         if (SDP1885DataSyncCallableStatement != null){
	        	 SDP1885DataSyncCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	

}
