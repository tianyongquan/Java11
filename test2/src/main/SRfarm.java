package main;

public class SRfarm implements Farm{

	@Override
	public Animal newAnimal() {
		// TODO Auto-generated method stub
		System.out.println("��ţ����");
		return new Cattle();
	}

	@Override
	public Plant newPlant() {
		// TODO Auto-generated method stub
		System.out.println("�߲˳���");
		return new Vegetables();
	}

}
