package AbstractFactory.factory;

import AbstractFactory.Car.Car;
import AbstractFactory.Car.ElectricCar;
import AbstractFactory.bike.Bike;
import AbstractFactory.bike.ElectrincBike;

public class ElectricVahicle implements VahicleFacotry{

	@Override
	public Bike createBike() {
		return new ElectrincBike();
	}

	@Override
	public Car createCar() {
		return new ElectricCar();
	}

}
