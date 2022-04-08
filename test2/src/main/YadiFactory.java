package main;

public class YadiFactory implements Factory{

	@Override
	public Product createcar() {
		// TODO Auto-generated method stub
		return new Yadicar();
	}

}
