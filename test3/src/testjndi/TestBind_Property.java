package testjndi;

import javax.naming.*;
import java.io.*;
import java.util.*;


public class TestBind_Property {
	public static void main(String[] args) {
		try{
			Properties props = new Properties();
			props.load(new FileInputStream(".\\bin\\testjndi\\TextBind_Property.properties"));
			InitialContext ctx = new InitialContext(props);
			String str = "Hello Enterprise java !";
			ctx.bind("hello", str);
			System.out.println("Object Bound !");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
