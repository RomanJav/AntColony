package by.academy.Tomal.Insects.Myrmecophilies;

import by.academy.Tomal.Colony.Colony;
import by.academy.Tomal.Insects.Insect;

public abstract class Myrmecophily extends Insect {
	private static Colony antColony;
	
	protected Myrmecophily() {
		super(true, false);
	}

	public Colony getAntColony() {
		return antColony;
	}

	private void setAntColony(Colony antColony) {
		Myrmecophily.antColony = antColony;
	}
	
	public void seekAntColony(Colony antColony) {
		setAntColony(antColony);
	}
	
}
