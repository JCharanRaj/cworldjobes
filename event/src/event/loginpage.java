package event;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class loginpage extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String name=req.getParameter("name");
		String pass=req.getParameter("password");
		String msg="";
		
		if(name.equals(pass))
		{
			msg=" <body bgcolor=pink> <h1>login successfully  :)  <br/>";
		}
		else
		{
			msg="<body bgcolor=pink> <h1>login not successfully   :(  <br/>";
		}
		Writer out=res.getWriter();
		out.write(msg);
	}
}
