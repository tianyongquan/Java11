package testevent;

public class testmystudent {
public testmystudent(){
	
}
public static void main(String[] args){
	mystudent st=new mystudent();
	System.out.println("��ʼ��Ϣ");
	st.toString();
	st.addAgeListener(new AgeListener(){
		public void ageCheck(AgeEvent e){
			System.out.println(e.getMsg());
			
			
		}
	});
	st.setAge(39);
	System.out.println("�����Ϣ��");
	st.toString();
}
}
