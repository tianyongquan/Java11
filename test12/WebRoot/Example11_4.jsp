<%@page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
<title>A.jsp</title>
<script language="javascript" type="text/javascript">
function CheckMyForm(){
var txt=document.myform.pass;
if(!checkNumber(txt)){
return false;
}
return true;
}
function checkNumber(obj){
var reg=/^[0-9]+$/;
if(!reg.test(obj.value)){
alert('只能输入数字！');
obj.value="";
obj.focus();
return false;
}
return false;
}
</script>
</head>
<h1>请登录系统</h1>
<body>
<FORM action="B.jsp" method="post" name="myfrom" onsubmit="return CheckMyFrom()">
<INPUT type="password" name="pass">
<INPUT TYPE="submit" value="登录" name=submit>
</FORM>
</body>
</html>