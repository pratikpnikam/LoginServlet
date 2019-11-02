package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String uname=request.getParameter("uname");
				String upass= request.getParameter("upass");
		
		if(uname.equals("pratik") && upass.equals("nikam")) {
			HttpSession session=request.getSession();
			session.setAttribute("username",uname );
			
			
			response.sendRedirect("Welcome.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}
		
	}

}
