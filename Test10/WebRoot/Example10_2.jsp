<%@page contentType="text/html;charset=GB2312" %>
<%@page import="java.util.*" %>
<html>
<body bgcolor=cyan>
<font size=3>
<p>�����������ε������ߵĳ��ȣ�����������ö��ŷָ���</p>
</font>
<br>
<form action="" method=post name=form>
<input type="text" name="boy">
<input type="submit" value="�ͳ�" name=submit>
 
 </form>
 <%! double a[] =new double[3] ;
  String answer=null;
 %>
 <%int i=0;
  boolean b=true;
  String s=null;
  double result=0;
  double a[]=new double[3];
  String answer=null;
  s=request.getParameter("boy");
  if(s!=null){
 StringTokenizer fenxi=new StringTokenizer(s,",��");
 while(fenxi.hasMoreTokens()){
 String temp=fenxi.nextToken();
 try{
 a[i]=Double.valueOf(temp).doubleValue();
 i++;
 }catch(NumberFormatException e){
 out.print("<br>"+"�����������ַ�");
 }
 }
  if(a[0]+a[1]>a[2]&&a[0]+a[2]>a[1]&&a[1]+a[2]>a[0]&&b==true){
  double p=(a[0]+a[1]+a[2])/2;
  result=Math.sqrt(p*(p-a[0])*(p-a[1])*(p-a[2]));
  out.print("�����"+result);
  }
  else{
  answer="����������߲��ܹ���һ��������";
  out.print("<br>"+answer);
  }
  }
   %>
   <p>������������ǣ�</p>
<br>
<%=a[0] %>
<br>
<%=a[1] %>
<br>
<%=a[2] %>
</body>
</html>