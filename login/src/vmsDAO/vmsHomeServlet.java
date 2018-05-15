package vmsDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vmsHomeServlet
 */
@WebServlet("/vmsHomeServlet")
public class vmsHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vmsHomeServlet() {
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
		
		String position = request.getParameter("position");
		String location = request.getParameter("location");
		String jobType = request.getParameter("jobType");
		String client = request.getParameter("client");
		Float billRate = Float.parseFloat(request.getParameter("billrate"));
		Float payRate = Float.parseFloat(request.getParameter("payrate"));
		String skills = request.getParameter("skills");
		String jobDescription = request.getParameter("description"); 
		String refPerson = request.getParameter("ref");
		String refEmail = request.getParameter("refEmail");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
		String remark = request.getParameter("remark");
		String status = request.getParameter("status");
		String preReq = request.getParameter("preReq");
		
		VmsDAO vm = new VmsDAO();
		vm.vmsDAO(position, location, jobType, client, billRate, payRate, skills, jobDescription, refPerson, refEmail, phoneNumber, remark, status, preReq);
	}

}
