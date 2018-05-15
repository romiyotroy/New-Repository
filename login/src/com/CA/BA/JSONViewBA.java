package com.CA.BA;

import org.json.JSONArray;
import org.json.simple.JSONObject;

import com.CA.DAO.JSONViewDAO;

public class JSONViewBA {
	
	public JSONObject JSONView() {
	JSONViewDAO viewdaoobj=new JSONViewDAO();
	JSONObject jsonobj=viewdaoobj.JSONDAO();
	return jsonobj;
	}
}
