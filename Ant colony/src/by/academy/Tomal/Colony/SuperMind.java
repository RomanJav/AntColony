package by.academy.Tomal.Colony;

import java.util.Scanner;

import by.academy.Tomal.Insects.Myrmecophilies.Lomechusa;

public class SuperMind {
	private Colony ants;

	public SuperMind() {
		this.ants = new Colony();
		ControlYourColony();
		Lomechusa lomechusa=new Lomechusa();
		lomechusa.seekAntColony(this.ants);
	}

	private void ControlYourColony() {
		while (true) {
			System.out.println("����� ����������, �� ������������ ����� �������" + ants.getColonyName());
			System.out.println("� ����� ���������� ���� ��������, �������, ������� � ���������, ������� �� ������!");
			System.out.println("� ����� ����������� " + ants.getColonyPopulation() + " ��������");
			System.out.println("���� � ���������: " + ants.getFoodInStock());
			System.out.println("���� ����������: " + ants.getColonyNeedFood());
			System.out.println("������ ������ �����������: " + ants.getColonySquare());
			System.out.println("������� �� ������!");
			System.out.println();
			System.out.println("1. ���������� ��������� ����������� �������!");
			System.out.println("2. ����� ����������� ������� �����������!");
			System.out.println("3. ����������� ����� ������ ���!");
			System.out.println("4. ������ �� ������ �����������!");
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
