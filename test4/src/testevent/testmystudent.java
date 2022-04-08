package testevent;

public class testmystudent {
public testmystudent(){
	
}
public static void main(String[] args){
	mystudent st=new mystudent();
	System.out.println("初始信息");
	st.toString();
	st.addAgeListener(new AgeListener(){
		public void ageCheck(AgeEvent e){
			System.out.println(e.getMsg());
			
			
		}
	});
	st.setAge(39);
	System.out.println("最后信息：");
	st.toString();
}
}
