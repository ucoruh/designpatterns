package designpatterns.factorymethodlogistics;

public class Truck extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Truck Deliver");
	}

	@Override
	public Transport createTransport() {
		return new Truck();
	}

	public void notifyCustomer() {
		// TODO Auto-generated method stub
		
	}



}
