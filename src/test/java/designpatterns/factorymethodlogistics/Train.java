package designpatterns.factorymethodlogistics;

public class Train extends Logistics implements Transport {

	public void deliver() {
		System.out.println("Train Deliver");
	}


	public Logistics createTransport() {
		return new Train();
	}
}
