package by.academy.Tomal.Insects;

public abstract class Insect {
	private boolean antenna;
	private boolean wings;
	private int legs;
	private int hungryLevel;
	private int satiety;
	
	protected Insect() {
		setLegs(6);
		setWings(false);
		setAntenna(false);
	}
	protected Insect(boolean wings, boolean antenna) {
		setLegs(6);
		setWings(wings);
		setAntenna(antenna);
	}
	public boolean isAntenna() {
		return antenna;
	}
	public void setAntenna(boolean antenna) {
		this.antenna = antenna;
	}
	public boolean isWings() {
		return wings;
	}
	public void setWings(boolean wings) {
		this.wings = wings;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getHungryLevel() {
		return hungryLevel;
	}

	public void setHungryLevel(int hungryLevel) {
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
