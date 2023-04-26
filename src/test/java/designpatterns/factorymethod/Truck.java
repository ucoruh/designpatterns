package designpatterns.factorymethod;

public class Truck extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Truck Deliver");

	}

	public Logistics createTransport() {
		return new Truck();
	}

}
