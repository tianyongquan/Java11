<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import ="java.util.*" %>
<html>
<head>
<title>JSP��ʹ��</title>
</head>
<body>
<% int localvar=0; %>
<%! int count=0; %>
<% localvar++;
 count++;
 %>
 �ֲ����� localvar=<%=localvar %><br>
 ʵ������ count=<%=count %>
 <%Calendar calendar=new GregorianCalendar();
 int year=calendar.get(Calendar.YEAR);
 int month=calendar.get(Calendar.MONTH)+1;
 int day=calendar.get(Calendar.DAY_OF_MONTH);
 int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
 String weekDay=null;
 switch(dayOfWeek){
 case 1:
 weekDay="������";
 break;
 case 2:
 weekDay="����һ";
 break;
 case 3:
 weekDay="���ڶ�";
 break;
 case 4:
 weekDay="������";
 break;
 case 5:
 weekDay="������";
 break;
 case 6:
 weekDay="������";
 break;
 case 7:
 weekDay="������";
 break;
 }
  %>
  <p>�����ǣ�<%=year %>��<%=month %>��<%=day %>��
  <%=weekDay %>
  <H4>
  ��ӡ�žű������ǣ�
  </H4>
  <%
  for(int i=1;i<=9;i++){
  for (int j=1;j<=i;j++){
   %>
   <%=i %>*<%=j %>=<%if(i*j<=9) %>&nbsp;&nbsp;
   <%
   if(j==i){
    %><br>
    <%}
    }}
     %>
</body>
</html>