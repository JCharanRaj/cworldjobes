package event;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class registerpage extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String name=req.getParameter("name");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		String phone=req.getParameter("phone");
		
		System.out.println("Full name"  + name);
		System.out.println("lastname   "+ lname);
		System.out.println("email     " + email);
		System.out.println("password"   + pwd);
		System.out.println("phone"      + phone);
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("<body bgcolor=orange> <h1> WELCOME!!! Now save your data any where </h1>");
		out.println("<h2> <U> PERSONAL DETAILS</U> </h2>");
		out.println("<h3> full name   :    "+name);
		out.println("<h3> Last name   :    "+lname);
		out.println("<h3> Email id    :    "+email);
		//out.println("<h3> password	")
		out.println("<h3> Contact     :    "+phone);
	}

}