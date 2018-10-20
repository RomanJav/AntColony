package by.academy.Tomal.Insects.Ants;

import java.util.Random;

public class Soldier extends Ant {
	private int mandiblePower;
	
	protected Soldier() {
		super(100, 20, "Soldier");
		setMandiblePower();
	}

	public int getMandiblePower() {
		return mandiblePower;
	}

	public void setMandiblePower() {
		Random rand = new Random();
		int mandiblePower= 5 + rand.nextInt(15);
		this.mandiblePower = mandiblePower;
	}

	public void Protect() {
		super.setSatiety(-15);
	}
}
