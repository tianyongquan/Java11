package test;

import main.YadiFactory;

public class CarTest {
public static void main(String[] args){
	YadiFactory yadi=new YadiFactory();
	System.out.println("��������"+yadi.getClass().getName());
	yadi.createcar().car();
}
}
