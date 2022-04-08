package main;

public class SRfarm implements Farm{

	@Override
	public Animal newAnimal() {
		// TODO Auto-generated method stub
		System.out.println("新牛出生");
		return new Cattle();
	}

	@Override
	public Plant newPlant() {
		// TODO Auto-generated method stub
		System.out.println("蔬菜成熟");
		return new Vegetables();
	}

}
