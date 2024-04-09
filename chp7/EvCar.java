public class EvCar extends Car {
	int charge = 100;
	
	EvCar() {
	super(2024, "Tesla", "Model x");
	}
	
	int getCharge() {
		return this.charge;
	}
	void charge() {
		this.charge = 200;
		System.out.println("You charged your car.");
	}
	
	// Car함수 오버라이딩
	void drive() {
		this.charge -= 10;
		this.km += 100;
		
		System.out.println("You drove " +
				this.km + "km, and have " +
				this.charge + "%battery.");
	}
}
