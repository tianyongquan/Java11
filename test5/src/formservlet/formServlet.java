package formservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class formServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException
	{
		response.setContentType("text/html;charset=GBK");
		PrintWriter out=response.getWriter();
		out.println("<html");
		out.println("<HEAD><TITLE> A Servlet</TITLE>");
		out.println("<body>");
		out.println("<p>Please input a form </P>");
		out.println("<from method='post' action='/ServletExample/servlet/responseservlet'>");
		out.println("用户名<int type='text' name='username'/><br>");
		out.println("密码&nbsp;&nbsp;<input type='password'/><br>");
		out.println("<input type='Submit' value='提交'/><br>");
		out.println("</from>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		doGet(request,response);
	}
}
