package by.academy.Tomal.Insects.Ants;

import java.util.Random;

public class Worker extends Ant {
	private int power;

	protected Worker() {
		super(50, 10, "Worker");

		setPower();
	}

	public int getPower() {
		return power;
	}

	private void setPower() {
		Random rand = new Random();
		int power = 1 + rand.nextInt(9);
		this.power = power;
	}

	public int Build() {
		Random rand = new Random();
		super.setSatiety(4 + rand.nextInt(power));
		return 3 + rand.nextInt(15);
	}
}
