<%@ page contentType="text/html;charset=GB2312" %>
<html>
<body bgcolor=cyan>
<font size=5>
<p>����һ���򵥵�JSPҳ��
<%int i,sum=0;
for(i=1;i<=100;i++){
sum=sum+i;
}
%>
<p>1��100���������ǣ�
<br>
<%=sum %>
</font>
</body>
</html>