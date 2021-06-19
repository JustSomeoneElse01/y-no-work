import java.util.Scanner;

public class Logic {
	Scanner scanner = new Scanner(System.in);

	int gamemode;
	int target;
	int input;
	int attempts;

	/*int gamemode() {

		do {

			try {
				System.out.println("1 = Player vs. player\t2 = Player vs. computer");
				int gamemode = Integer.parseInt(scanner.nextLine());

				if (gamemode == 1) {
					return 1;

				} else if (gamemode == 2) {
					return 2;

				} else {
					return 0;

				}

			} catch (java.lang.NumberFormatException e) {
				continue;

			}

		} while (true);

	}*/

	void userSetGamemode() {

		try {

			gamemode = Integer.parseInt(scanner.nextLine());

		} catch (java.lang.NumberFormatException e) {

		}

	}

	void playerSetTarget() {
		System.out.println("Enter a Target (WHOLE NUMBER)");

		do {

			try {
				target = Integer.parseInt(scanner.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("Please enter a WHOLE number (max 2,147,483,647)");

			}

		} while (true);

	}

	void computerSetTarget() {
		target = (int) (1 + Math.random() * 100);
		System.out.println("Target between 1 and 100 set");

	}

	void hideTarget() {
		for (int i = 0; i < 100; i++) {
			System.out.println("---");

		}

	}

	void guessLoop() {
		System.out.println("Go!");

		do {

			do {

				try {
					input = Integer.parseInt(scanner.nextLine());
					break;

				} catch (NumberFormatException e) {
					System.out.println("Your guess must be a whole number below 2,147,483,647");

				}
			} while (true);
			attempts++;

			if (input != target) {
				System.out.println(input > target ? "Go smaller" : "Go bigger");

			} else {
				System.out.println("It was " + target + "!");

				if (attempts == 1) {
					System.out.println("It took you 1 attempt to get the answer. Wow!");

				} else {
					System.out.println("It took you " + attempts + " attempts to get the answer");

				}

			}

		} while (input != target);

	}

	int getGamemode() {
		return gamemode;
	}
}