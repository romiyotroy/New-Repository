package com.compacademy.connectivity;

import java.sql.DriverManager;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;

public class DBConnectivity {
	public Connection dbConnection() {
		Connection connection = null;
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://comacademy.cnxhkbauy6wb.us-east-2.rds.amazonaws.com:3306/ExampleDB";
		String USER = "example";
		String PASS = "sreyo123";
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASS);
		}catch(Exception e) {
			
		}
		System.out.println("connected");
		return connection;
				
	}

}
