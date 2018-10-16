package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int floors = 9;
		int entrances = 4;
		int inOneFloor = 4;
		int inOneEntrance;
		int entrance;
		int floor;
		int number;

		System.out.println("Enter the apartment number");
		number = sc.nextInt();

		sc.close();
		inOneEntrance = floors * entrances;
		entrance = (number - 1) / inOneEntrance + 1;
		floor = ((number - (entrance - 1) * inOneEntrance) - 1) / inOneFloor + 1;

		System.out.println("Entrance is " + entrance + " ,floor is " + floor);

	}

}
