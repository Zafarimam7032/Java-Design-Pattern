package AbstractFactory.factory;

import AbstractFactory.Car.Car;
import AbstractFactory.Car.ElectricCar;
import AbstractFactory.Car.PetrolCar;
import AbstractFactory.bike.Bike;
import AbstractFactory.bike.PetrolBike;

public class PetrolVahicle implements VahicleFacotry {

	@Override
	public Bike createBike() {
		return new PetrolBike();
	}

	@Override
	public Car createCar() {
		return new PetrolCar();
	}

}
