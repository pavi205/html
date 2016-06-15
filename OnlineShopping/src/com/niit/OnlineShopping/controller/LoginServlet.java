package com.niit.OnlineShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.OnlineShopping.dao.UserDAO;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		
		String UserID=(String) request.getAttribute("userID");
		
		UserDAO userDAO= new UserDAO();
		String password=request.getParameter("password");
		String userID=request.getParameter("userID");
		
		if(userDAO.checkUser(userID, password))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
	            rs.forward(request, response);
	        }
	        else
	        {
	           PrintWriter out = null;
			out.println("Username or Password incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("home.jsp");
	           rs.include(request, response);
	        }
	}
	
	
	

}
