package vmsConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class VmsConnectivity {
	public Connection dbConnection() {
		Connection connection = null;
		String DRIVER = "com.mysql.jdbc.Driver";
	//	String URL = "jdbc:mysql://comacademy.cnxhkbauy6wb.us-east-2.rds.amazonaws.com:3306/ExampleDB";
		String URL = "jdbc:mysql://enteprisevms.cnxhkbauy6wb.us-east-2.rds.amazonaws.com:3306/vms";
		String USER = "vms";
		String PASS = "Vendor123";
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASS);
		}catch(Exception e) {
			
		}
		System.out.println("connected");
		return connection;
	}

}
