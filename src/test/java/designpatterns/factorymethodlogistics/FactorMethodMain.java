package designpatterns.factorymethodlogistics;

public class FactorMethodMain {

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

		///////////////////////////////////////////////////////////////////
		// Client Input
		LogisticType logisticType = LogisticType.TRUCK;

		///////////////////////////////////////////////////////////////////
		Logistics logistics = null;

		///////////////////////////////////////////////////////////////////
		// Configuration
		logistics = create(logisticType);

		///////////////////////////////////////////////////////////////////
		// Business
		logistics.deliver();

		logisticType = LogisticType.SHIP;

		logistics = create(logisticType);

		///////////////////////////////////////////////////////////////////

		for (int i = 0; i < 5; i++) {
			logistics = logistics.createTransport();
			logistics.deliver();
		}

		logisticType = LogisticType.TRAIN;

		logistics = create(logisticType);

		for (int i = 0; i < 5; i++) {
			logistics = logistics.createTransport();
			logistics.deliver();
		}

	}

}
