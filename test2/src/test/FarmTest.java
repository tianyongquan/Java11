package test;


import main.Animal;
import main.Farm;
import main.Plant;

public class FarmTest {
public static void main(String[] args){
	Farm farm;
		Animal animal;
		Plant plant;
	farm=(Farm)ReadXML.getObject();
	animal=farm.newAnimal();
	plant=farm.newPlant();
	animal.show();
	plant.show();
}
}
