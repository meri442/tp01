package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class coffee
 */
@WebServlet("/coffee")
public class coffee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typeremarque = request.getParameter("typeremarque");
		String texteremarque = request.getParameter("textarea");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Coffee Shop</title></head>");
		out.println("<body> <img src='b.jpg' border=0' height='200'");
		out.println("<p>Merci de nous avoir fait parvenir la remarque suivante concernant ");
		out.println("<b>"+typeremarque+"</b>");
		out.println("<b>"+texteremarque+"</b>");
		out.println("</body></html>");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
