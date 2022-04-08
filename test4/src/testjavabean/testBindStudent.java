package testjavabean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class testBindStudent {
public testBindStudent(){
	
}
public static void main(String[] args){
	bindStudent st=new bindStudent();
	System.out.println("初始信息：");
	st.toString();
	st.addPropertyChangeListener(new PropertyChangeListener(){
		public void propertyChange(PropertyChangeEvent e){
			System.out.println("University Changed"+e.getNewValue());}
	});
	st.setUniversity("BPU");
	System.out.println("最后信息：");
	st.toString();
}
}
