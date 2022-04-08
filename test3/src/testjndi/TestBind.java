package testjndi;
import javax.naming.*;
import java.util.*;


//将对象绑定到weblogic server的名字服务中
public class TestBind {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
		try{
			InitialContext ctx = new InitialContext(ht);
			String str = "Hello world !";
			ctx.bind("hello", str);
			System.out.println("Object Bound !");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
