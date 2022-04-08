package databaseTest;

import javax.naming.*;
import javax.sql.*;

import java.sql.*;
import java.util.Hashtable;
public class DatabaseConnectTest {
	public static void main(String[] args){
		DataSource ds = null;
		Context ctx=null;
		Connection myConn = null ;
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL, "t3://localhost:7001");
		try{
			ctx = new InitialContext(ht);
			ds = (javax.sql.DataSource)ctx.lookup("huaruan");
		}catch(Exception e){
			e.printStackTrace();
		}
		if(ds == null){
			System.out.println("Eorror !");
		}
		else{
			System.out.println("Connection is OK !");
		}
		Statement myStatement = null;
		ResultSet mySet = null;
		try{
			myConn = ds.getConnection();
			myStatement = myConn.createStatement();
			mySet = myStatement.executeQuery("select * from users");
			while(mySet.next()){
				System.out.println(mySet.getString("username")+" "+mySet.getString("password"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
