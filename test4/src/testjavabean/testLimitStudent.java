package testjavabean;


import java.beans.PropertyVetoException;

public class testLimitStudent {
public testLimitStudent(){
	
}
public static void main(String[] args){
	limitStudent st=new limitStudent();
	System.out.println("初始信息：");
	st.toString();
	st.addvetoableChangeLiatener(new VectorChangeListener(){
		public void vetoableChange(PropertyChangeEvent e)throws PropertyVetoExecption{
			if(Integer.parseInt((e.getNewVaule()).toString())<=20)
				throw (new PropertyVetoException("年龄太小"+e.getNewVaule(),e));
		}
	});
	st.setAge(19);
	System.out.println("最后信息:");
	st.toString();
}
}
