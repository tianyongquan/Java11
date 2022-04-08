<%@ page language="java" contenetType="text/html;charsret=GBK"%>
<%! 
final String separator="-";
public String getBirthday(String identify){
String birthday="";
birthday=identify.substring(6,10)+separator+identify.substring(10,12)+separator+identify.substring(12,14);
return birthday;
}
%>
<%
String identify1="010020198810092211";
String birthday1=getBirthday(identify1);
String identify2="0100201990090302211";
String birthday2=getBirthday(identify2);
 %>
 <html>
 <head>
 <title>计算生日</title>
 </head>
 <body bgcolor="#ffffff">
 <h4 align="center">根据身份证自动计算生日</h4>
 <table width="400" border="1" align="center">
 <tr>
 <td>
 <div align="center">身份证</div>
 </td>
 <td>
 <div align="center">生日</div>
 </td>
 </tr>
 <tr>
 <td>&nbsp;<%=identify1 %></td>
 <td>&nbsp;<%=birthday1 %></td>
 </tr>
 <tr>
 <td>&nbsp;<%=identify2 %></td>
 <td>&nbsp;<%=birthday2 %></td>
 </tr>
 </table>
 <h4 align="center">&nbsp;</h4>
 <br/>
 
 </body>
 </html>

