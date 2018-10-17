package by.academy.Tomal.Ants;

public class Soldier extends Ant {
	protected Soldier() {
		super(100, 20);
	}

	public void Protect() {
		super.setSatiety(-15);
	}
}
