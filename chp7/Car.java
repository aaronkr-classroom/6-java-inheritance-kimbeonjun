public class Car {
	String company = "Hyundai";
	String model = "Santa Fe";
	int year = 2024;
	
	int tank = 80;
	int km = 0;
			
	Car() { /* nothing */ }
	Car(int y, String c, String m) {
		this.year = y;
		this.company =c;
		this.model = m;
	}
	
	void printDetails() {
		System.out.println("This is a " + 
				this.year + " " +
				this.company + " " +
				this.model + ".");
	}
	
	void drive() {
		this.tank -= 10;
		this.km += 100;
		
		System.out.println("You drove " +
				this.km + "km, and have " +
				this.tank + "L of oil.");
	}
	
	int getTank() {
		return this.tank;
	}
	void fillTank() {
		this.tank = 80;
		System.out.println("You filled the tank.");
	}
	
	int getKm() {
		return this.km;
	}
	void changeOil() {
		System.out.println("You changed the engine oil.");
	}
}
