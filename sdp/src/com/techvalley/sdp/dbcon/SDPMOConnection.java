package com.techvalley.sdp.dbcon;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SDPMOConnection {
	
	public Connection SDPMORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
	public Connection SDP1880MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}

	public Connection SDP1881MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
	public Connection SDP1882MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
	public Connection SDP1883MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
	public Connection SDP1884MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
	public Connection SDP1885MORequestConnection() throws Exception{
		
		Context initCtx = new InitialContext();
        DataSource ds = (DataSource) initCtx.lookup("java:/comp/env/jdbc/MtnDB");
       
        return ds.getConnection();
	}
	
}
