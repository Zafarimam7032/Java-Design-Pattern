package AbstractFactory.factory;

import AbstractFactory.Car.Car;
import AbstractFactory.bike.Bike;

public interface VahicleFacotry {
	public Bike createBike();
	public Car createCar();
}
