<%@ page contentType = "text/html; charset=GBK"%>
<html>
  <head><title>check_jsp</title>
  </head>
  <%-- ��дjspInit() --%>
 <%!
 String str=null;
 public void jspInit(){
 ServletConfig sc=getServletConfig();
 str=sc.getInitParameter("secret");
 }
  %> 
  <body bgcolor="#ffffff">
  <h1>������</h1>
<%
if(!str.equals(request.getParameter("pass"))){
RequestDispatcher view=request.getRequestDispatcher("error.jsp");
view.forward(request,response);
}
%>
<form method="POST" action="cal.jsp">
��������ʽ<input type="text" name="expr">
<input type="submit" value="����">
</form>
</body>
</html>
