package main;

public class Agent {
private Star myStar;
private Fans myFans;
private Company myCompany;

public void setMyStar(Star myStar) {
	this.myStar = myStar;
}

public void setMyFans(Fans myFans) {
	this.myFans = myFans;
}

public void setMyCompany(Company myCompany) {
	this.myCompany = myCompany;
}
public void meeting(){
	System.out.println(myFans.getName()+"������"+myStar.getName()+"�����ˡ�");
}
public void business(){
	System.out.println(myCompany.getName()+"������"+myStar.getName()+"Ǣ̸ҵ��");
}
}
