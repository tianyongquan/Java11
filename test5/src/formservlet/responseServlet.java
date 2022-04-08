package formservlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
out.println("td>"+vc.elementAt(0)+"</td>");
out.println("<td>"+vc.elementAt(1)+"</td>");

public class responseServlet extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	response.setConntentType("text/html;charset=GBK");
	PrintWriter out=response.getWriter();
	request.setCharacterEncoding("GBK");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	out.println("<html>");
	out.println("<head><title>responseServlet</title></head>");
	out.println("<body bycolor=\"#ffffff\">");
	out.println("<p>”√ªß√˚:"+username);
	out.println("<p>√‹¬Î:"+password);
	out.println("</body>");
	out.println("</html>");
	out.flush();
	out.close();
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	doGet(request,response);
}
}
