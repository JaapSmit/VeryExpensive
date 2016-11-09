package nl.youngcapital.tsa;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Time
 */
@WebServlet("/Time")
public class Time extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static int counter;   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalTime lc = LocalTime.now();
		response.getWriter()
		.append("<!DOCTYPE html><html><head>" + 
				"<title>ExpensiveApp</title>" +
				"</head><body><h1>" + lc + "</h1>" +
				"Counter: " + ++counter + 
				"<br>" +
				"KLIK <a href=\"Reset\"> hier" + " to reset" +
				"</body></html>");
	}



}
