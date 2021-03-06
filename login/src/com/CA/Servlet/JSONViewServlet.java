package com.CA.Servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.CA.BA.JSONViewBA;

/**
 * Servlet implementation class JSONViewServlet
 */
@WebServlet("/JSONViewServlet")
public class JSONViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("in serc");
		JSONViewBA viewba= new JSONViewBA();
		JSONObject obj=viewba.JSONView();
		/*System.out.println("JSON"+obj.get(0));
		System.out.println("mbngj");
		System.out.println("context:::0"+request.getContextPath());
		*/
		String path = this.getClass().getClassLoader().getResource("").getPath();
		String fullPath = URLDecoder.decode(path, "UTF-8");
		String pathArr[] = fullPath.split("/WEB-INF/classes/");
		System.out.println(fullPath);
		System.out.println(pathArr[0]);
		fullPath = pathArr[0];
		String reponsePath = "";
		// to read a file from webcontent
		reponsePath = new File(fullPath).getPath() + File.separatorChar + "JSON\\test.json";
		System.out.println("resoo pth::"+reponsePath);
		 try {  

	            // Writing to a file  
	            File file=new File(reponsePath);
	            file.createNewFile();  
	           // String helper = file.getAbsolutePath();
	           // System.out.println("cureeb fol::"+helper);
	            FileWriter fileWriter = new FileWriter(file);  
	            System.out.println("Writing JSON object to file");  
	            System.out.println("-----------------------");  
	            //System.out.print(countryObj);  

	            fileWriter.write(obj.toJSONString());  
	            fileWriter.flush();  
	            fileWriter.close();  

	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
		 PrintWriter out=response.getWriter();
			//out.println("hello");
			out.write(obj.toJSONString());
	}

}
