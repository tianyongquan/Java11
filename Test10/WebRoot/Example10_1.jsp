<%@ page contentType="text/html;charset=GB2312" %>
<html>
<body bgcolor=cyan>
<font size=5>
<p>这是一个简单的JSP页面
<%int i,sum=0;
for(i=1;i<=100;i++){
sum=sum+i;
}
%>
<p>1到100的连续和是：
<br>
<%=sum %>
</font>
</body>
</html>