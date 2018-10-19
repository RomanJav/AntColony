package by.academy.Tomal.Ants;

import java.util.Random;

public class Forager extends Ant {
	private int foodMined;

	protected Forager() {
		super(70, 10, "Forager");
	}

	public int getFoodMined() {
		return foodMined;
	}

	private void setFoodMined(int foodMined) {
		this.foodMined = foodMined;
	}

	public int MineFood() {
		Random rand = new Random();
		super.setSatiety(3 + rand.nextInt(7));
		int foodMined = 5 + rand.nextInt(25);
		setFoodMined(foodMined);
		return foodMined;
	}
}
