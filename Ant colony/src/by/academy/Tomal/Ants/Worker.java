package by.academy.Tomal.Ants;

import java.util.Random;

public class Worker extends Ant {

	protected Worker() {
		super(50, 10);
	}

	public int Build() {
		Random rand = new Random();
		super.setSatiety(4 + rand.nextInt(7));
		return 3+rand.nextInt(15);
	}
}
