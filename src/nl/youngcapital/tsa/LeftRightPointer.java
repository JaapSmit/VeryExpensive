package nl.youngcapital.tsa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;
/**
 * Servlet implementation class LeftRightPointer
 */
@WebServlet("/LeftRightPointer")
public class LeftRightPointer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random r = new Random();
		String path = "ArrowLeft.png";
		if(r.nextInt(2) < 1) path = "ArrowRight.png";
		
		response.getWriter().
		append("<!DOCTYPE html><html><head>" + 
				"<title>ExpensiveApp</title>" +
				"</head><body><img src=\"" +path+ "\">" +
				"</body></html>");
	}

}
