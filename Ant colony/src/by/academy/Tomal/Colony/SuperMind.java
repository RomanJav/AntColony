package by.academy.Tomal.Colony;

import java.io.Console;
import java.util.Scanner;

public class SuperMind {
	private Colony ants;

	public SuperMind() {
		this.ants = new Colony();
		ControlYourColony();
	}

	private void ControlYourColony() {
		while (true) {
			System.out.println("Добро пожаловать, вы Коллективный разум колонии" + ants.getColonyName());
			System.out.println("В вашем подчинении есть Королева, солдаты, рабочие и добытчики, отдайте им приказ!");
			System.out.println("В вашем муравейнике " + ants.getColonyPopulation() + " муравьев");
			System.out.println("Пищи в хранилище: " + ants.getFoodInStock());
			System.out.println("Пищи необходимо: " + ants.getColonyNeedFood());
			System.out.println("Размер вашего муравейника: " + ants.getColonySquare());
			System.out.println("Отдайте же приказ!");
			System.out.println();
			System.out.println("1. Необходимо увеличить численность колонии!");
			System.out.println("2. Нужно увеличивать площадь муравейника!");
			System.out.println("3. Муравейнику нужно больше еды!");
			System.out.println("4. Встать на защиту муравейника!");
			Scanner in2 = new Scanner(System.in);
			int order = in2.nextInt();
			switch (order) {
			case 1:
				ants.OrderBorn();
				break;
			case 2:
				ants.OrderBuild();
				break;
			case 3:
				ants.OrderMine();
				break;
			case 4:
				ants.OrderProtect();
				break;
			default:
				break;
			}	
			System.out.flush();
		}
	}
}
