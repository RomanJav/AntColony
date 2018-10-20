package by.academy.Tomal.Insects.Myrmecophilies;

public class Lomechusa extends Myrmecophily{
	
	public Lomechusa() {
		super();
		super.setHungryLevel(50);
		super.setSatiety(100);
	}
	
	public void Eat(int food) {
		setSatiety(20);
		super.getAntColony().setFoodInStock(-20);
	}

}
