public class Ex801 {

	public static void main(String[] args) {
		BabyCat baby = new BabyCat();
	
		System.out.println("품종: " + baby.breed);
		System.out.println("색상: " + baby.color);
		
		baby.eat();
		baby.meow();
	}
}
