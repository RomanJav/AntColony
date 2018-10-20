package by.academy.Tomal.Insects.Ants;

import by.academy.Tomal.Insects.Insect;

public abstract class Ant extends Insect {
	private String role;
	private int size;

	protected Ant(int size, int hungryLevel, String name) {
		setRole(name);
		setSize(size);
		super.setHungryLevel(hungryLevel);
		super.setSatiety(100);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String name) {
		this.role = name;
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}


}
