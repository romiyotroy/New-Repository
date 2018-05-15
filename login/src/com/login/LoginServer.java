package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginBA.loginBA;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/LoginServer")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServer() {
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
		//System.out.println("in login servlet");
		String firstName=request.getParameter("fullname");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		String password=request.getParameter("password");
		String ConfirmPassword=request.getParameter("confirmPassword");
		
		loginBA lBA= new loginBA();
		lBA.loginBA1(firstName, password);
		
		
		if(password==ConfirmPassword)
			System.out.println("password accepted");
		else System.out.println("password not match");
		
		if(firstName.isEmpty())
			System.out.println("Enter you name.");
		else System.out.println("User Name : "+firstName);
	
		if(email.isEmpty())
			System.out.println("Enter your email.");
		else System.out.println("E-Mail : "+email);
		if(gender==null)
			System.out.println("Select your gender.");
		else System.out.println("Sex : "+gender);
		if(course==null)
			System.out.println("Select a course.");
		else
			System.out.println("Courses Selected : "+course);
		
		PrintWriter writer=response.getWriter();
				writer.println("<html><head></head>");
				writer.println("<body>"+firstName+" is logged in. </body>");
		
	}

}
