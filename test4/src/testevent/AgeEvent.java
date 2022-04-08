package testevent;

import java.util.EventObject;

public class AgeEvent extends EventObject{
	String msg;
	public AgeEvent(Object source,String msg){
		super(source);
		setMsg(msg);
	}
public void setMsg(String s){
	msg=s;

}
public String getMsg(){
	return msg;
}

}
