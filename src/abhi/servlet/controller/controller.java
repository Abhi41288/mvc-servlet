package abhi.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abhi.servlet.service.*;


/**
 * Servlet implementation class ServletExamp
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		//request.getParameter("name");
//		//response.getWriter().append(request.getParameter("name"));
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		//response.getWriter().append(request.getParameter("name"));
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		System.out.println("name="+name+" pass="+pass);
		services service=new services();
		String msg=service.validate(name,pass);
		if(msg=="unsuccess"){
		response.getWriter().append(msg);
		}
		else{
		request.setAttribute("user", service.getUser(name, pass));
		RequestDispatcher dispacther=request.getRequestDispatcher("view.jsp");
		dispacther.forward(request, response);
		}
		
		
	}

}