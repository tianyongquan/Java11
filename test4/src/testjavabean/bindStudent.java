package testjavabean;

import java.beans.PropertyChangeListener;

public class bindStudent {
String name;
int age;
String university;
public String getName(){
	return name;
}
public void setAge(int i){
	age=i;
}
public int getAge(){
	return age;
}
public void setUniversity(String s1){
	String old=university;
		university=s1;
	pcs.firePropertyChange("university",old,s1);	
}
public String getUniversity(){
	return university;
}
public void addPropertyChangeListener(PropertyChangeListener pc1){
	pcs.addPropertyChangeListener(pc1);
}
public void removePropertyChangeListener(PropertyChangeListener pc1){
	psc.removePropertyChangeListener(pc1);
}
}
