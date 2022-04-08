package testjndi;

import javax.naming.*;
import java.util.*;

//通过JNDI查找指定的对象
public class TestLookup {
	public static void main(String[] args) {
		System.out.println("Object Binding...");
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
		try{
			InitialContext ctx = new InitialContext(ht);
			String result;
			result = (String)ctx.lookup("hello");
			System.out.println("Result is "+result);
			System.out.println("Lookup end !");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
