package com.techvalley.sdp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.techvalley.sdp.data.SDPDataSyncSQL;
import com.techvalley.sdp.data.SDPMORequestSQL;

/**
 * Servlet implementation class SDP1880DataSync
 */
@WebServlet("/sdpeightydatasync")
public class SDP1880DataSync extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SDPDataSyncSQL sdpDataSyncSQL = new SDPDataSyncSQL();
	SDPMORequestSQL sdpMORequestSQL = new SDPMORequestSQL();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;
		try {
			  builder = factory.newDocumentBuilder();
			  Document xmlDoc = builder.parse(new InputSource(request.getInputStream())); 
			  xmlDoc.getDocumentElement().normalize();	
			 
			  Element rootElement = xmlDoc.getDocumentElement();
			  			  
			  String msisdn = rootElement.getElementsByTagName("ID").item(0).getTextContent();
			  String spID =  rootElement.getElementsByTagName("ns1:spID").item(0).getTextContent();
			  String productID =  rootElement.getElementsByTagName("ns1:productID").item(0).getTextContent();
			  String serviceID =  rootElement.getElementsByTagName("ns1:serviceID").item(0).getTextContent();
			  String serviceList = rootElement.getElementsByTagName("ns1:serviceList").item(0).getTextContent(); 
			  String updateType = rootElement.getElementsByTagName("ns1:updateType").item(0).getTextContent();
			  String updateTime = rootElement.getElementsByTagName("ns1:updateTime").item(0).getTextContent(); 
			  String updateDesc = rootElement.getElementsByTagName("ns1:updateDesc").item(0).getTextContent();
			  String effectiveTime = rootElement.getElementsByTagName("ns1:effectiveTime").item(0).getTextContent(); 
			  String expiryTime = rootElement.getElementsByTagName("ns1:expiryTime").item(0).getTextContent(); 
			  
			  String Starttime = rootElement.getElementsByTagName("value").item(16).getTextContent();
			  String keyWord = rootElement.getElementsByTagName("value").item(13).getTextContent();
			  String cycleEndTime = rootElement.getElementsByTagName("value").item(15).getTextContent();
			  String operatorID = rootElement.getElementsByTagName("value").item(3).getTextContent();
			  String transactionID = rootElement.getElementsByTagName("value").item(5).getTextContent();
			  String orderKey = rootElement.getElementsByTagName("value").item(6).getTextContent();
			  String channelID = rootElement.getElementsByTagName("value").item(17).getTextContent();			  
			  String TraceUniqueID = rootElement.getElementsByTagName("value").item(19).getTextContent();
			  
			  
			  // Subscribtion information
			  String message = keyWord;
			  String eventDateTime = updateTime;	
			  String linkid = transactionID;
			  String correlator = transactionID;
			  String smsServiceActivationNumber = operatorID;
			  
			  		  			   
			   sdpDataSyncSQL.SDP1880DataSyncSQLObject( msisdn, spID, productID, serviceID, serviceList, updateType, updateTime, 
					   updateDesc, effectiveTime, expiryTime, Starttime, keyWord, cycleEndTime, operatorID, transactionID, 
					   orderKey, channelID, TraceUniqueID ); 
			  
			  System.out.println("-------SDP 1880 DataSync Information---------");			  
			  System.out.println("DataSync Details : " + msisdn + " " +  spID + " " + productID + " " + serviceID + " " + serviceList 
					  + " " + updateType + " " + updateTime + " " + updateDesc + " " + effectiveTime + " " + expiryTime + " " 
					  + TraceUniqueID + " End Of DataSync Details");
			  
			  System.out.println("User info :" + message + " " + eventDateTime + " " + linkid + " " + correlator + " " + Starttime
					  + " " + cycleEndTime + " " + smsServiceActivationNumber + " " + orderKey + " " + channelID + " End of User info."); 
			  System.out.println("-------END 1880 DataSync Information---------");
			  
			 
			  if(xmlDoc != null){
			    	
			    	response.setContentType("text/xml; charset=UTF-8");
					response.getWriter().print(dataSyncResponseXML());
			    	
			  }
			  
			  			  
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {			
			
			
		}       
		
	}
	
	
	private String dataSyncResponseXML()
    {
        StringBuilder sb = new StringBuilder("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:loc=\"http://www.csapi.org/schema/parlayx/data/sync/v1_0/local\">");
        sb.append(" <soapenv:Header/>")
          .append("   <soapenv:Body>")
          .append("     <loc:syncOrderRelationResponse>")
          .append("        <loc:result>0</loc:result>")
          .append("        <loc:resultDescription>OK</loc:resultDescription>")
          .append("     </loc:syncOrderRelationResponse>")
          .append("  </soapenv:Body>")
          .append("</soapenv:Envelope>");

        return sb.toString(); 
    }
	

}
