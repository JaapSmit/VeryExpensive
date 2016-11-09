package nl.youngcapital.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
/**
 * Servlet implementation class HeaderReader
 */
@WebServlet("/HeaderReader")
public class HeaderReader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Enumeration<String> e = request.getHeaderNames();
		StringBuilder headers = new StringBuilder();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			headers.append(s);
			Enumeration<String> infoheader = request.getHeaders(s);
			headers.append(", <br>");
			while(infoheader.hasMoreElements()) {
				String stringHeader = infoheader.nextElement();
				headers.append(stringHeader);
			}
			headers.append("<br><br>");
		}
		
		response.getWriter()
		.append("<!DOCTYPE html><html><head>" + 
				"<title>URL</title>" +
				"</head><body>" +
				headers +
				"</body></html>");
	}

}
