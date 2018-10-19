package by.academy.Tomal.Ants;

public abstract class Ant {
	private String name;
	private int size;
	private int hungryLevel;
	private int satiety;

	protected Ant(int size, int hungryLevel, String name) {
		setName(name);
		setSize(size);
		setHungryLevel(hungryLevel);
		setSatiety(100);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public int getHungryLevel() {
		return hungryLevel;
	}

	private void setHungryLevel(int hungryLevel) {
		this.hungryLevel = hungryLevel;
	}

	public int getSatiety() {
		return satiety;
	}

	protected void setSatiety(int satiety) {
		this.satiety += satiety;
	}

	public boolean isHungry() {
		if (getSatiety() < getHungryLevel()) {
			return true;
		} else if (getSatiety() >= getHungryLevel()) {
			return false;
		}
		return true;
	}

	public void Eat(int food) {
		setSatiety(food);
	}
}
