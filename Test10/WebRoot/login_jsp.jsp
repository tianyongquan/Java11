<%@ page contentType="text/html; charset=GBK" %>
<html>
  <head><title>login_jsp</title>
    <script language="javascript" type="text/javascript">
	function CheckMyForm()
	{
	var txt=myform.pass.value;
	if(!checknumber(txt))
	{ 
	  alert("ֻ�����������֣�");
	  return false;
	}
	return true;
	}
function checknumber(String)
{ var Letters="1234567890";
  var i;
  var c;
  for( i=0;i < String.length; i++)
  { c=String.charAt(i);
    if (Letters.indexOf(c)==-1)
    {
     return false;
    } 
  }
  return true;
}
</script>  
  </head> 
  <body bgcolor="#ffffff">
    <h1>
    ���¼ϵͳ...
    </h1>
  </body>
  <form name="myform" method="post" action="check_jsp.jsp" onsubmit="return CheckMyFrom()">
  ����������<input type="password" name="pass">
  <input type="submit" value="��½">  
  </form>
</html>