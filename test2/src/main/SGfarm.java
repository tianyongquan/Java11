package main;

public class SGfarm implements Farm{

	@Override
	public Animal newAnimal() {
		// TODO Auto-generated method stub
		System.out.println("�������");
		return new Horse();
	}

	@Override
	public Plant newPlant() {
		// TODO Auto-generated method stub
		System.out.println("ˮ������");
		return new Fruitage();
	}

}
