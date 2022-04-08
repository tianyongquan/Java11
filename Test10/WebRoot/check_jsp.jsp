<%@ page contentType = "text/html; charset=GBK"%>
<html>
  <head><title>check_jsp</title>
  </head>
  <%-- 重写jspInit() --%>
 <%!
 String str=null;
 public void jspInit(){
 ServletConfig sc=getServletConfig();
 str=sc.getInitParameter("secret");
 }
  %> 
  <body bgcolor="#ffffff">
  <h1>计算器</h1>
<%
if(!str.equals(request.getParameter("pass"))){
RequestDispatcher view=request.getRequestDispatcher("error.jsp");
view.forward(request,response);
}
%>
<form method="POST" action="cal.jsp">
请输入表达式<input type="text" name="expr">
<input type="submit" value="计算">
</form>
</body>
</html>
