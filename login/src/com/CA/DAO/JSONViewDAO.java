package com.CA.DAO;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.compacademy.connectivity.DBConnectivity;

public class JSONViewDAO {
	public JSONObject JSONDAO() {
		int result=0;
		ResultSet resultset = null;
        Statement statement = null;
        DBConnectivity dbCon= new DBConnectivity();
        Connection conn=dbCon.dbConnection();
        ResultSet rs=null;
        JSONArray jsonArray=new JSONArray();
        JSONObject json=new JSONObject();
        String QUERY ="select * from `vms`.`Requirements`";
        System.out.println("Query::"+QUERY);
		/*String QUERY = "SELECT * FROM Authentication WHERE username = '"+
	            username+"'          AND password = '"+password+"' ";
		try {
		 statement=conn.createStatement();	
         resultset = statement.executeQuery(QUERY);
         while (resultset.next()) {
             username = resultset.getString("username");
             password = resultset.getString("password");
            System.out.println(username+" is valid");
            result=1;
         }
		}catch(Exception e) {
			
		}*/
        try {
        	statement=conn.createStatement();	
            rs= statement.executeQuery(QUERY);
            int i=1;
            JSONObject item=null;
            while(rs.next()) {
            	//json.add(i++, rs.getInt(1));
            	item=new JSONObject();
            	item.put("reqid", rs.getInt(1));
            	item.put("position", rs.getString(2));
            	jsonArray.add(item);
            	//System.out.println("jsaar::"+jsonArray.get(i++));
            }
            json.put("data", jsonArray);
            System.out.println("reqrt"+json.get("data"));
            
        }catch(Exception e) {
        	
        }
		return json;
		
	}

}
