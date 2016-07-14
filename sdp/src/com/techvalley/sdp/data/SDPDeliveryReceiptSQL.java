package com.techvalley.sdp.data;

import java.sql.CallableStatement;

import com.techvalley.sdp.dbcon.SDPDeliveryConnection;

public class SDPDeliveryReceiptSQL {
	
	SDPDeliveryConnection DeliveryConn = new SDPDeliveryConnection();
	
	CallableStatement SDPDeliveryReceiptCallableStatement = null;
	String SDPDeliveryReceiptCall = "{ call sp_sdpdeliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1880DeliveryReceiptCallableStatement = null;
	String SDP1880DeliveryReceiptCall = "{ call sp_1880deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1881DeliveryReceiptCallableStatement = null;
	String SDP1881DeliveryReceiptCall = "{ call sp_1881deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1882DeliveryReceiptCallableStatement = null;
	String SDP1882DeliveryReceiptCall = "{ call sp_1882deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1883DeliveryReceiptCallableStatement = null;
	String SDP1883DeliveryReceiptCall = "{ call sp_1883deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1884DeliveryReceiptCallableStatement = null;
	String SDP1884DeliveryReceiptCall = "{ call sp_1884deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	CallableStatement SDP1885DeliveryReceiptCallableStatement = null;
	String SDP1885DeliveryReceiptCall = "{ call sp_1885deliveryreceipt(?, ?, ?, ?, ?, ?, ?) }";
	
	public void SDPDeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDPDeliveryReceiptCallableStatement = DeliveryConn.SDPDeliveryReceiptConnection().prepareCall(SDPDeliveryReceiptCall);
			SDPDeliveryReceiptCallableStatement.setString(1, spId);
			SDPDeliveryReceiptCallableStatement.setString(2, serviceId);
			SDPDeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDPDeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDPDeliveryReceiptCallableStatement.setString(5, correlator);
			SDPDeliveryReceiptCallableStatement.setString(6, msisdn);
			SDPDeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDPDeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			cleanConnection();
		}		
		
	}
	
	
	public void SDP1880DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1880DeliveryReceiptCallableStatement = DeliveryConn.SDP1880DeliveryReceiptConnection().prepareCall(SDP1880DeliveryReceiptCall);
			SDP1880DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1880DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1880DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1880DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1880DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1880DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1880DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1880DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1880Connection();
		}		
		
	}
	
	public void SDP1881DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1881DeliveryReceiptCallableStatement = DeliveryConn.SDP1881DeliveryReceiptConnection().prepareCall(SDP1881DeliveryReceiptCall);
			SDP1881DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1881DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1881DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1881DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1881DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1881DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1881DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1881DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1881Connection();
		}		
		
	}
	
	public void SDP1882DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1882DeliveryReceiptCallableStatement = DeliveryConn.SDP1882DeliveryReceiptConnection().prepareCall(SDP1882DeliveryReceiptCall);
			SDP1882DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1882DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1882DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1882DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1882DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1882DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1882DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1882DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1882Connection();
		}		
		
	}
	
	public void SDP1883DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1883DeliveryReceiptCallableStatement = DeliveryConn.SDP1883DeliveryReceiptConnection().prepareCall(SDP1883DeliveryReceiptCall);
			SDP1883DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1883DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1883DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1883DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1883DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1883DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1883DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1883DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1883Connection();
		}		
		
	}
	
	public void SDP1884DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1884DeliveryReceiptCallableStatement = DeliveryConn.SDP1884DeliveryReceiptConnection().prepareCall(SDP1884DeliveryReceiptCall);
			SDP1884DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1884DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1884DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1884DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1884DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1884DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1884DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1884DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1884Connection();
		}		
		
	}
	
	public void SDP1885DeliveryReceiptSQLObject(String spId, String serviceId, String traceUniqueID, 
            String OperatorID, String correlator, String msisdn, String deliveryStatus){
				
		try{
			
			SDP1885DeliveryReceiptCallableStatement = DeliveryConn.SDP1885DeliveryReceiptConnection().prepareCall(SDP1885DeliveryReceiptCall);
			SDP1885DeliveryReceiptCallableStatement.setString(1, spId);
			SDP1885DeliveryReceiptCallableStatement.setString(2, serviceId);
			SDP1885DeliveryReceiptCallableStatement.setString(3, traceUniqueID);
			SDP1885DeliveryReceiptCallableStatement.setString(4, OperatorID);
			SDP1885DeliveryReceiptCallableStatement.setString(5, correlator);
			SDP1885DeliveryReceiptCallableStatement.setString(6, msisdn);
			SDP1885DeliveryReceiptCallableStatement.setString(7, deliveryStatus);
			
			SDP1885DeliveryReceiptCallableStatement.executeQuery();
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			clean1885Connection();
		}		
		
	}
	
	
	private void cleanConnection() {

		try{
		
	        if (DeliveryConn.SDPDeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDPDeliveryReceiptConnection().close();
	        }
	
	         if (SDPDeliveryReceiptCallableStatement != null){
	        	 SDPDeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1880Connection() {

		try{
		
	        if (DeliveryConn.SDP1880DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1880DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1880DeliveryReceiptCallableStatement != null){
	        	 SDP1880DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }	
	
	private void clean1881Connection() {

		try{
		
	        if (DeliveryConn.SDP1881DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1881DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1881DeliveryReceiptCallableStatement != null){
	        	 SDP1881DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }	
	
	private void clean1882Connection() {

		try{
		
	        if (DeliveryConn.SDP1882DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1882DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1882DeliveryReceiptCallableStatement != null){
	        	 SDP1882DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }	
	
	
	private void clean1883Connection() {

		try{
		
	        if (DeliveryConn.SDP1883DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1883DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1883DeliveryReceiptCallableStatement != null){
	        	 SDP1883DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }	
	
	private void clean1884Connection() {

		try{
		
	        if (DeliveryConn.SDP1884DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1884DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1884DeliveryReceiptCallableStatement != null){
	        	 SDP1884DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }
	
	private void clean1885Connection() {

		try{
		
	        if (DeliveryConn.SDP1885DeliveryReceiptConnection() != null) {
	        	DeliveryConn.SDP1885DeliveryReceiptConnection().close();
	        }
	
	         if (SDP1885DeliveryReceiptCallableStatement != null){
	        	 SDP1885DeliveryReceiptCallableStatement.close();
	        }
		} catch(Exception ex){
			ex.printStackTrace();
		}
    }	

}
