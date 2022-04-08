package main;

public class AmaFactory implements Factory{

	@Override
	public Product createcar() {
		// TODO Auto-generated method stub
		return new Amacar();
	}

}
