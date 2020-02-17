package com.cts.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection conn;
	
	public static Connection createConnection(){
		
		if(conn == null){
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url="jdbc:mysql://localhost:3306/ratandb";
			
			try {
				conn=DriverManager.getConnection(url,"root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
		return conn;
	}

}
