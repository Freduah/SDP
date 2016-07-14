package com.techvalley.sdp.data;

import java.sql.CallableStatement;

import com.techvalley.sdp.dbcon.SDPMOConnection;

public class SDPMORequestSQL {
	
	SDPMOConnection sdpMOConn = new SDPMOConnection();
	
	CallableStatement SDPMORequestCallableStatement = null;
	String SDPMORequestCall = "{ call sp_sdpmorequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	
	CallableStatement SD1880PMORequestCallableStatement = null;
	String SDP1880MORequestCall = "{ call sp_sdp1880morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SD1881PMORequestCallableStatement = null;
	String SDP1881MORequestCall = "{ call sp_sdp1881morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

	CallableStatement SD1882PMORequestCallableStatement = null;
	String SDP1882MORequestCall = "{ call sp_sdp1882morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

	CallableStatement SD1883PMORequestCallableStatement = null;
	String SDP1883MORequestCall = "{ call sp_sdp1883morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

	CallableStatement SD1884PMORequestCallableStatement = null;
	String SDP1884MORequestCall = "{ call sp_sdp1884morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

	CallableStatement SD1885PMORequestCallableStatement = null;
	String SDP1885MORequestCall = "{ call sp_sdp1885morequest(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

	
	public void SDPMORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SDPMORequestCallableStatement = sdpMOConn.SDPMORequestConnection().prepareCall(SDPMORequestCall);
			SDPMORequestCallableStatement.setString(1, spId);
			SDPMORequestCallableStatement.setString(2, serviceId);
			SDPMORequestCallableStatement.setString(3, linkid);
			SDPMORequestCallableStatement.setString(4, traceUniqueID);
			SDPMORequestCallableStatement.setString(5, OperatorID);
			SDPMORequestCallableStatement.setString(6, correlator);
			SDPMORequestCallableStatement.setString(7, message);
			SDPMORequestCallableStatement.setString(8, msisdn);
			SDPMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SDPMORequestCallableStatement.setString(10, eventDateTime);
			
			SDPMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			cleanConnection();
		}
		
	}
	
	
	public void SDP1880MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1880PMORequestCallableStatement = sdpMOConn.SDP1880MORequestConnection().prepareCall(SDP1880MORequestCall);
			SD1880PMORequestCallableStatement.setString(1, spId);
			SD1880PMORequestCallableStatement.setString(2, serviceId);
			SD1880PMORequestCallableStatement.setString(3, linkid);
			SD1880PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1880PMORequestCallableStatement.setString(5, OperatorID);
			SD1880PMORequestCallableStatement.setString(6, correlator);
			SD1880PMORequestCallableStatement.setString(7, message);
			SD1880PMORequestCallableStatement.setString(8, msisdn);
			SD1880PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1880PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1880PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1880Connection();
		}
		
	}
	
	public void SDP1881MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1881PMORequestCallableStatement = sdpMOConn.SDP1881MORequestConnection().prepareCall(SDP1881MORequestCall);
			SD1881PMORequestCallableStatement.setString(1, spId);
			SD1881PMORequestCallableStatement.setString(2, serviceId);
			SD1881PMORequestCallableStatement.setString(3, linkid);
			SD1881PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1881PMORequestCallableStatement.setString(5, OperatorID);
			SD1881PMORequestCallableStatement.setString(6, correlator);
			SD1881PMORequestCallableStatement.setString(7, message);
			SD1881PMORequestCallableStatement.setString(8, msisdn);
			SD1881PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1881PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1881PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1881Connection();
		}
		
	}
	
	public void SDP1882MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1882PMORequestCallableStatement = sdpMOConn.SDP1882MORequestConnection().prepareCall(SDP1882MORequestCall);
			SD1882PMORequestCallableStatement.setString(1, spId);
			SD1882PMORequestCallableStatement.setString(2, serviceId);
			SD1882PMORequestCallableStatement.setString(3, linkid);
			SD1882PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1882PMORequestCallableStatement.setString(5, OperatorID);
			SD1882PMORequestCallableStatement.setString(6, correlator);
			SD1882PMORequestCallableStatement.setString(7, message);
			SD1882PMORequestCallableStatement.setString(8, msisdn);
			SD1882PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1882PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1882PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1882Connection();
		}
		
	}
	
	public void SDP1883MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1883PMORequestCallableStatement = sdpMOConn.SDP1883MORequestConnection().prepareCall(SDP1883MORequestCall);
			SD1883PMORequestCallableStatement.setString(1, spId);
			SD1883PMORequestCallableStatement.setString(2, serviceId);
			SD1883PMORequestCallableStatement.setString(3, linkid);
			SD1883PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1883PMORequestCallableStatement.setString(5, OperatorID);
			SD1883PMORequestCallableStatement.setString(6, correlator);
			SD1883PMORequestCallableStatement.setString(7, message);
			SD1883PMORequestCallableStatement.setString(8, msisdn);
			SD1883PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1883PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1883PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1883Connection();
		}
		
	}
	
	public void SDP1884MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1884PMORequestCallableStatement = sdpMOConn.SDP1884MORequestConnection().prepareCall(SDP1884MORequestCall);
			SD1884PMORequestCallableStatement.setString(1, spId);
			SD1884PMORequestCallableStatement.setString(2, serviceId);
			SD1884PMORequestCallableStatement.setString(3, linkid);
			SD1884PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1884PMORequestCallableStatement.setString(5, OperatorID);
			SD1884PMORequestCallableStatement.setString(6, correlator);
			SD1884PMORequestCallableStatement.setString(7, message);
			SD1884PMORequestCallableStatement.setString(8, msisdn);
			SD1884PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1884PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1884PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1884Connection();
		}
		
	}
	
	public void SDP1885MORequestSQLObject(String spId, String serviceId, String linkid, String traceUniqueID, 
			String OperatorID, String correlator, String message, String msisdn, 
			String smsServiceActivationNumber, String eventDateTime){
		
		try{
			
			SD1885PMORequestCallableStatement = sdpMOConn.SDP1885MORequestConnection().prepareCall(SDP1885MORequestCall);
			SD1885PMORequestCallableStatement.setString(1, spId);
			SD1885PMORequestCallableStatement.setString(2, serviceId);
			SD1885PMORequestCallableStatement.setString(3, linkid);
			SD1885PMORequestCallableStatement.setString(4, traceUniqueID);
			SD1885PMORequestCallableStatement.setString(5, OperatorID);
			SD1885PMORequestCallableStatement.setString(6, correlator);
			SD1885PMORequestCallableStatement.setString(7, message);
			SD1885PMORequestCallableStatement.setString(8, msisdn);
			SD1885PMORequestCallableStatement.setString(9, smsServiceActivationNumber);
			SD1885PMORequestCallableStatement.setString(10, eventDateTime);
			
			SD1885PMORequestCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			clean1885Connection();
		}
		
	}
	
	
	private void cleanConnection() {

		try{
		
	        if (sdpMOConn.SDPMORequestConnection() != null) {
	        	sdpMOConn.SDPMORequestConnection().close();
	        }
	        
	        if (SDPMORequestCallableStatement != null){
	        	 SDPMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1880Connection() {

		try{
		
	        if (sdpMOConn.SDP1880MORequestConnection() != null) {
	        	sdpMOConn.SDP1880MORequestConnection().close();
	        }
	        
	        if (SD1880PMORequestCallableStatement != null){
	        	SD1880PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1881Connection() {

		try{
		
	        if (sdpMOConn.SDP1881MORequestConnection() != null) {
	        	sdpMOConn.SDP1881MORequestConnection().close();
	        }
	        
	        if (SD1881PMORequestCallableStatement != null){
	        	SD1881PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1882Connection() {

		try{
		
	        if (sdpMOConn.SDP1882MORequestConnection() != null) {
	        	sdpMOConn.SDP1882MORequestConnection().close();
	        }
	        
	        if (SD1882PMORequestCallableStatement != null){
	        	SD1882PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1883Connection() {

		try{
		
	        if (sdpMOConn.SDP1883MORequestConnection() != null) {
	        	sdpMOConn.SDP1883MORequestConnection().close();
	        }
	        
	        if (SD1883PMORequestCallableStatement != null){
	        	SD1883PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1884Connection() {

		try{
		
	        if (sdpMOConn.SDP1884MORequestConnection() != null) {
	        	sdpMOConn.SDP1884MORequestConnection().close();
	        }
	        
	        if (SD1884PMORequestCallableStatement != null){
	        	SD1884PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1885Connection() {

		try{
		
	        if (sdpMOConn.SDP1885MORequestConnection() != null) {
	        	sdpMOConn.SDP1885MORequestConnection().close();
	        }
	        
	        if (SD1885PMORequestCallableStatement != null){
	        	SD1885PMORequestCallableStatement.close();
	        }
	         
	         
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	

}
