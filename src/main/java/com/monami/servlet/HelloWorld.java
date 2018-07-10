package com.monami.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() throws ServletException
	{
		ServletContext con=this.getServletContext();
		ServletConfig config=this.getServletConfig();
				System.out.println("config params"+config.getInitParameterNames()+"  "+config.getInitParameter("iparam1")+"  "+config.getInitParameter("iparam2"));
		System.out.println("context params"+con.getInitParameterNames()+"  "+con.getInitParameter("cparam1")+"  "+con.getInitParameter("cparam2"));
		
	}
    public HelloWorld() {
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

}
