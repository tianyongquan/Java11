package main;

public class SGfarm implements Farm{

	@Override
	public Animal newAnimal() {
		// TODO Auto-generated method stub
		System.out.println("新马出生");
		return new Horse();
	}

	@Override
	public Plant newPlant() {
		// TODO Auto-generated method stub
		System.out.println("水果成熟");
		return new Fruitage();
	}

}
