package by.academy.Tomal.Ants;

public class Queen extends Ant {

	public Queen() {
		super(200, 100);
	}

	public Worker BornWorker() {
		Worker worker = new Worker();
		super.setSatiety(-20);
		return worker;
	}
	public Soldier BornSoldier() {
		Soldier soldier = new Soldier();
		super.setSatiety(-20);
		return soldier;
	}
	public Forager BornForager() {
		Forager forager = new Forager();
		super.setSatiety(-20);
		return forager;
	}
	
}
