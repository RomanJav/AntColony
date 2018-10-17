package by.academy.Tomal.Ants;

import java.util.Random;

public class Forager extends Ant {

	protected Forager() {
		super(70, 10);
	}

	public int MineFood() {
		Random rand = new Random();
		super.setSatiety(3 + rand.nextInt(7));
		return 5+rand.nextInt(25);
	}
}
