package designpatterns.factorymethodlogistics;

public class Train extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Train Deliver");
		
	}

	@Override
	public Transport createTransport() {
		return new Train();
	}

	public void notifyCustomer() {
		// TODO Auto-generated method stub
		
	}



}
