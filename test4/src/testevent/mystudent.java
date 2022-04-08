package testevent;

import java.util.Vector;

public class mystudent {
String university;
Vector listeners;
public String getUniversity(){
	return university;
}
public void setListeners(Vector V){
	listeners=V;
}
public Vector getListeners(){
	return listeners;
}
public void addAgeListener(AgeListener al){
	if(al!=null) getListeners().add(al);
}
public void removeAgeListener(AgeListener al){
	if(al!=null) getListeners().remove(al);
}
public void setAge(int i) {
	// TODO Auto-generated method stub
	
}
}