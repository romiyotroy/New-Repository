package vmsDAO;
import java.sql.*;
import vmsConnectivity.VmsConnectivity;

public class VmsDAO{
	public void vmsDAO(String position, String location, String jobType, String client,
						Float billRate, Float payRate, String skills, String jobDescription, 
						String refPerson, String refEmail, int phoneNumber, String remark,
						String status, String preReq)
	{
		
		Connection conn = null;
		VmsConnectivity vmsdbConn = new VmsConnectivity();
		conn = vmsdbConn.dbConnection();
	//	System.out.println("part1");
		String query = "INSERT INTO `vms`.`Requirements` (`position`,`location`,"
				+ "`jobtype`,`client`,`billrate`,`payrate`,`skills`,`jd`,`refperson`,"
				+ "`refemail`,`phonenumber`,`remark`,`status`,`prereq`)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
		PreparedStatement pstmt = conn.prepareStatement(query);
	//	System.out.println("part2");
		pstmt.setString(1,""+ position +"");
		pstmt.setString(2,""+ location +"");
		pstmt.setString(3,""+ jobType +"");
		pstmt.setString(4,""+ client +"");
		pstmt.setFloat(5, billRate);
		pstmt.setFloat(6, payRate);
		pstmt.setString(7,""+ skills +"");
		pstmt.setString(8,""+ jobDescription +"");
		pstmt.setString(9,""+ refPerson +"");
		pstmt.setString(10,""+ refEmail +"");
		pstmt.setInt(11, phoneNumber);
		pstmt.setString(12,""+ remark +"");
		pstmt.setString(13,""+ status +"");
		pstmt.setString(14,""+ preReq +"");

	//	System.out.println("part3");
		int result=pstmt.executeUpdate();
	//	System.out.println("part4");
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
