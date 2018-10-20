package by.academy.Tomal.Colony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.academy.Tomal.Insects.Ants.Forager;
import by.academy.Tomal.Insects.Ants.Queen;
import by.academy.Tomal.Insects.Ants.Soldier;
import by.academy.Tomal.Insects.Ants.Worker;

public class Colony {
	private final String colonyName;
	private Queen queen;
	private List<Worker> workers;
	private List<Soldier> soldiers;
	private List<Forager> foragers;
	private int foodInStock;
	private int colonyNeedFood;
	private int colonyPopulation;
	private int colonySquare;

	protected Colony() {
		colonyName = setColonyName();
		workers = new ArrayList<Worker>();
		soldiers = new ArrayList<Soldier>();
		foragers = new ArrayList<Forager>();
		setQueen(new Queen());
	}

	public String getColonyName() {
		return colonyName;
	}

	private String setColonyName() {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите название колонии: ");
		String colonyName = in.nextLine();
		return colonyName;
	}

	public Queen getQueen() {
		return queen;
	}

	private void setQueen(Queen queen) {
		this.queen = queen;
		workers.add(queen.BornWorker());
		soldiers.add(queen.BornSoldier());
		foragers.add(queen.BornForager());
		setColonyNeedFood(140);
		setFoodInStock(140);
		setColonyPopulation();
	}

	public int getColonyPopulation() {
		return colonyPopulation;
	}

	private void setColonyPopulation() {
		this.colonyPopulation = workers.size() + soldiers.size() + foragers.size();
	}

	public int getColonyNeedFood() {
		return colonyNeedFood;
	}

	public void setColonyNeedFood(int colonyNeedFood) {
		this.colonyNeedFood += colonyNeedFood;
	}

	public int getFoodInStock() {
		return foodInStock;
	}

	public void setFoodInStock(int foodInStock) {
		this.foodInStock += foodInStock;
	}

	public int getColonySquare() {
		return colonySquare;
	}

	public void setColonySquare(int colonySquare) {
		this.colonySquare += colonySquare;
	}

	protected void OrderBorn() {
		if (workers.size() / 2 <= soldiers.size()) {
			workers.add(queen.BornWorker());
			setColonyNeedFood(10);
		} else if (workers.size() / 2 > soldiers.size()) {
			soldiers.add(queen.BornSoldier());
			setColonyNeedFood(20);
		}
		if (soldiers.size() + workers.size() > foragers.size()) {
			foragers.add(queen.BornForager());
			setColonyNeedFood(10);
		}
		setColonyPopulation();
	}

	protected void OrderMine() {
		for (Forager forager : foragers) {
			setFoodInStock(forager.MineFood());
			if (forager.isHungry()) {
				forager.Eat(forager.getHungryLevel() - forager.getSatiety() + 10);
				setFoodInStock(-(forager.getHungryLevel() - forager.getSatiety() + 10));
			}
		}
	}

	protected void OrderBuild() {
		for (Worker worker : workers) {
			setColonySquare(worker.Build());
			if (worker.isHungry()) {
				worker.Eat(worker.getHungryLevel() - worker.getSatiety() + 10);
				setFoodInStock(-(worker.getHungryLevel() - worker.getSatiety() + 10));
			}
		}
	}

	protected void OrderProtect() {
		for (Soldier soldier : soldiers) {
			soldier.Protect();
			if (soldier.isHungry()) {
				soldier.Eat(soldier.getHungryLevel() - soldier.getSatiety() + 10);
				setFoodInStock(-(soldier.getHungryLevel() - soldier.getSatiety() + 10));
			}
		}
		System.out.println("Colony under protect!");
	}

}
