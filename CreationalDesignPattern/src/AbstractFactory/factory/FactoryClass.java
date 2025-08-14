package AbstractFactory.factory;

import AbstractFactory.Car.Car;
import AbstractFactory.bike.Bike;

public class FactoryClass {
	
 
	public static VahicleFacotry getinstance(String cartype) {
		if(cartype.equalsIgnoreCase("ElectricVahicle")) {
			return new ElectricVahicle();
		}else if(cartype.equalsIgnoreCase("PetrolVahicle")) {
			return new PetrolVahicle();
		}else {
			throw new RuntimeException("unable to create object");
		}
	}
	
	public static void main(String[] args) {
		VahicleFacotry petrolVahicle =  FactoryClass.getinstance("PetrolVahicle");
		VahicleFacotry electricVahicle =  FactoryClass.getinstance("ElectricVahicle");
		
		Bike petrolBike = petrolVahicle.createBike();
		Car petrolCar = petrolVahicle.createCar();
		
		petrolBike.drive();
		petrolCar.drive();
		
		Bike electricBike = electricVahicle.createBike();
		Car electricCar = electricVahicle.createCar();
		electricBike.drive();
		electricCar.drive();

		

	}

}
