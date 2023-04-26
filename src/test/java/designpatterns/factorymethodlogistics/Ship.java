package designpatterns.factorymethodlogistics;

public class Ship extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Ship Deliver");
		
	}

	@Override
	public Transport createTransport() {
		return new Ship();
	}

	public void notifyCustomer() {
		// TODO Auto-generated method stub
		
	}





}
