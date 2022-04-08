package myservlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.sql.DataSourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentServlet extends HttpServlet{
	private static final String CONTENT_TYPE="text/html;charset=gbk";
	int count=0;
	public void init() throws ServeltException{
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse reponse)throws
	ServletException,IOException{
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>StudentServlet</title></head>");
		out.println("<body bycolor=\"#ffffff\">");
		if((request.getParameter("studentName"))== null||
		(request.getParameter("studentName")).equals("Input number")){
			out.println("<From method='post' action='/HelloWebModule/studentservlet'>" );
			out.println("学生学号<input type='text' name='studentName' value='Input number'/>");
			out.println("<input type='Submit' value='查询'/><br>");
			out.println("</from>");
		}
		else if(!(request.getParameter("studnetName")).equals("Input number")){
			Vector<E> vc =new Vector();
			out.println("<Form method='post' action='/HelloWebModule/studentservlet'>");
			out.println("学生学号<input type='text' name='studentName'/>");
			out.println("<input type='Submit' value='查询'/><br>");
			out.println("</form>");
			out.println("<hr>");
			out.println("<table border='1'><tr>");
			out.println("<th>学号</th><th>姓名</th><th>语文</th><th>数学</th></tr>");
		
			try{
				if(vc=accessDB(Integer.parseInt(request.getParameter("studentName"))))!=null) {
					out.println("<tr>");
					out.println("td>"+vc.elementAt(0)+"</td>");
					out.println("<td>"+vc.elementAt(1)+"</td>");
					out.println("td>"+vc.elementAt(2)+"</td>");
					out.println("<td>"+vc.elementAt(3)+"</td>");
					out.println("</tr>");
				}
				else{
					out.println("<tr>");
					out.println("<td>没有记录</td>");
					out.println("</tr>");
					
				}
				while(rs.next()){
					vc.add(Integer.toString(rs.getInt("sno")));
					vc.add(rs.getString("sname"));
					vc.add(Integer.toString(rs.getInt("chinese")));
					vc.add(Integer.toString(rs.getInt("math")));
				}
				rs.close();
				stmt.close();
				conn.close();
				return vc;
				}catch(Exception e){
					e.printStackTrace();
					
				}
			return null;
			}
	}
}

