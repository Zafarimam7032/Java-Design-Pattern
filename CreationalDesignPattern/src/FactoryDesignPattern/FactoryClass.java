package FactoryDesignPattern;

public class FactoryClass {
	
 
	public static Car getinstance(String cartype) {
		if(cartype.equalsIgnoreCase("ElectricCar")) {
			return new ElectricCar();
		}else if(cartype.equalsIgnoreCase("PetrolCar")) {
			return new PetrolCar();
		}else {
			throw new RuntimeException("unable to create object");
		}
	}
	
	public static void main(String[] args) {
		Car instance =  FactoryClass.getinstance("PetrolCar");
		Car electricCar =  FactoryClass.getinstance("ElectricCar");
		
		instance.drive();
		electricCar.drive();

	}

}
