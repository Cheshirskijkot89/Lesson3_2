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
<<<<<<< HEAD

=======
		
>>>>>>> 7798fe2eaef33d5d74cb9b5625aa1f3adb554c15
		System.out.println("Enter the apartment number");
		number = sc.nextInt();

		sc.close();
		inOneEntrance = floors * entrances;
		entrance = (number - 1) / inOneEntrance + 1;
		floor = ((number - (entrance - 1) * inOneEntrance) - 1) / inOneFloor + 1;
<<<<<<< HEAD

=======
		
>>>>>>> 7798fe2eaef33d5d74cb9b5625aa1f3adb554c15
		System.out.println("Entrance is " + entrance + " ,floor is " + floor);

	}

}
