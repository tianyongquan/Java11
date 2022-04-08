package test;

import main.Agent;
import main.Fans;
import main.Star;
import main.Company;
public class StarTest {
public static void main(String[] args){
	Agent agent=new Agent();
	agent.setMyStar(new Star("ÖÜ½ÜÂ×"));
	agent.setMyFans(new Fans("·ÛË¿Ì·ÎÄÍş"));
	agent.setMyCompany(new Company("ÒôÀÖ¹«Ë¾"));
	agent.meeting();
	agent.business();
	

}
}
