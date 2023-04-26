package designpatterns.factorymethodlogistics;

public class Logistics implements Transport {
		
	public Logistics createTransport() {
		return null;
	}

	public void deliver() {
		System.out.println("Logistic Deliver");
	}

	
}
