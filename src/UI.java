
import java.io.IOException;
import java.util.Scanner;

/**
 * Simple UI
 * 
 * @author Tim Hillier
 *
 */
public class UI {
	static boolean ET;

	public static void UIrunner() throws IOException {
		Scanner reader = new Scanner(System.in);
		ET = true;
		while (ET) {

			// Reading from System.in
			System.out.println("What is your command?");
			String cont = reader.nextLine().toUpperCase();
			if (cont.equals("MOVE") || cont.equals("M")
					|| cont.equals("ATTACK") || cont.equals("A")) {
				Command(cont);

			}

			else {
				while (!(cont.equals("MOVE") || cont.equals("M")
						|| cont.equals("ATTACK") || cont.equals("A"))) {
					// While not true
					System.out.println("I do not understand.");
					System.out.println("What did you command?");
					cont = reader.nextLine().toUpperCase();
					Command(cont);
				}
			}
		}

	}

	private static void Command(String com) {
		switch (com) {
		case "MOVE":
		case "M":

			Movement.Move();
			break;
		case "ATTACK":
		case "A":

			Attack.Fight();
			break;
		default:
			break;
		}

	}

}
