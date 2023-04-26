package designpatterns.factorymethod;

public class Ship extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Ship Deliver");
	}


	public Logistics createTransport() {
		return new Ship();
	}

}
