package designpatterns.factorymethodlogistics;

public class FactorMethodMainLogistic {

	public static Logistics create(LogisticType logisticType) {
		
		Logistics logistics = null;
		
		if (logisticType == LogisticType.SHIP)
			logistics = new Ship();
		else if (logisticType == LogisticType.TRUCK)
			logistics = new Truck();
		else if (logisticType == LogisticType.TRAIN)
			logistics = new Train();

		return logistics;
	}

	public static void main(String[] args) {

			
		Logistics logistics = create(LogisticType.TRUCK);

		logistics.planDelivery();

		logistics = create(LogisticType.SHIP);

		logistics.planDelivery();
		
		logistics = create(LogisticType.TRAIN);

		logistics.planDelivery();


	}

}
