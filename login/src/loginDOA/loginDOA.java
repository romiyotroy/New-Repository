package loginDOA;

import java.sql.*;

import com.compacademy.connectivity.DBConnectivity;
//import com.mysql.jdbc.Connection;

public class loginDOA {
	public void loginDOA1(String uname, String pword)
	{
		Connection conn = null;
		DBConnectivity dbConn = new DBConnectivity();
		conn = dbConn.dbConnection();
		System.out.println("part1");
		String query = "INSERT INTO `ExampleDB`.`rom1` (`username`, `password`) values(?,?)";
		try {
		PreparedStatement pstmt = conn.prepareStatement(query);
		System.out.println("part2");
		pstmt.setString(1,""+ uname +"");
		pstmt.setString(2,""+ pword +"");
		System.out.println("part3");
		int result=pstmt.executeUpdate();
		System.out.println("part4");
		if(result==1) 
			System.out.println("insertion successful");
		else
			System.out.println("insertion fail");
		
		conn.close();
		}
		catch(Exception e) {
			System.out.println("err::"+e.getMessage());
		}
		}
	}

