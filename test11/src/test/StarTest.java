package test;

import main.Agent;
import main.Fans;
import main.Star;
import main.Company;
public class StarTest {
public static void main(String[] args){
	Agent agent=new Agent();
	agent.setMyStar(new Star("�ܽ���"));
	agent.setMyFans(new Fans("��˿̷����"));
	agent.setMyCompany(new Company("���ֹ�˾"));
	agent.meeting();
	agent.business();
	

}
}
