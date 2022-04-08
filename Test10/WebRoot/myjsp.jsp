<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import ="java.util.*" %>
<html>
<head>
<title>JSP简单使用</title>
</head>
<body>
<% int localvar=0; %>
<%! int count=0; %>
<% localvar++;
 count++;
 %>
 局部变量 localvar=<%=localvar %><br>
 实例变量 count=<%=count %>
 <%Calendar calendar=new GregorianCalendar();
 int year=calendar.get(Calendar.YEAR);
 int month=calendar.get(Calendar.MONTH)+1;
 int day=calendar.get(Calendar.DAY_OF_MONTH);
 int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
 String weekDay=null;
 switch(dayOfWeek){
 case 1:
 weekDay="星期日";
 break;
 case 2:
 weekDay="星期一";
 break;
 case 3:
 weekDay="星期二";
 break;
 case 4:
 weekDay="星期三";
 break;
 case 5:
 weekDay="星期四";
 break;
 case 6:
 weekDay="星期五";
 break;
 case 7:
 weekDay="星期六";
 break;
 }
  %>
  <p>今天是：<%=year %>年<%=month %>月<%=day %>日
  <%=weekDay %>
  <H4>
  打印九九表（下三角）
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