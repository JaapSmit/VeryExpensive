package nl.youngcapital.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlGet
 */
@WebServlet("/url/*")
public class UrlGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getRequestURL().toString();
		response.getWriter()
		.append("<!DOCTYPE html><html><head>" + 
				"<title>URL</title>" +
				"</head><body><h1>" + url + "</h1>" +
				"</body></html>");
	}

}
