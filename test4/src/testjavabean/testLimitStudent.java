package testjavabean;


import java.beans.PropertyVetoException;

public class testLimitStudent {
public testLimitStudent(){
	
}
public static void main(String[] args){
	limitStudent st=new limitStudent();
	System.out.println("��ʼ��Ϣ��");
	st.toString();
	st.addvetoableChangeLiatener(new VectorChangeListener(){
		public void vetoableChange(PropertyChangeEvent e)throws PropertyVetoExecption{
			if(Integer.parseInt((e.getNewVaule()).toString())<=20)
				throw (new PropertyVetoException("����̫С"+e.getNewVaule(),e));
		}
	});
	st.setAge(19);
	System.out.println("�����Ϣ:");
	st.toString();
}
}
