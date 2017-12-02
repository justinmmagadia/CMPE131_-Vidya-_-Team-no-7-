package vidya;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReviewedServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strUsername=request.getParameter("username");
		String strUserpass = request.getParameter("review");
		out.print(strUserpass + "'s review is created successfully");
		out.println(request.getParameter("review"));
		out.println("Click here to return to the login page");
		out.close();
	}

}