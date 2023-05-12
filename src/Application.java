
public class Application {

	public static void main(String[] args) {

		Dog a1 = new Dog();
		a1.setName("Twaalfpeuzel");
		a1.setLegs(12);
		a1.setType("Flapdoezel");
		a1.makeSound();
		
		Cat a2 = new Cat();
		a2.setName("Dikzak");
		a2.setLegs(0);
		a2.setType("Poesssssspss");
		a2.makeSound();
		
		MajesticSeaFlapFlap a3 = new MajesticSeaFlapFlap();
		a3.setName("Manta");
		a3.setLegs(0);
		a3.setType("Zeebeest");
		a3.makeSound();

		// dit heet Polymorphism  appel is wel fruit, fruit is geen appel
 		
	}

}
