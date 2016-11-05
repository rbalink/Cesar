import java.util.Scanner;

/**
 * CesarCipher
 * 
 * @author robert
 *
 */

public class CesarCipherScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of characters: ");
		int number = scan.nextInt();
		char[] array = readChars(number);
		while (getCommand() == 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter the shift offset: ");
			int shift = scan2.nextInt();
			System.out.println("Message before shifting: ");
			printMessage(array);
			shift(array, shift);
			System.out.println("");
			System.out.println("Message after shifting: ");
			printMessage(array);
			System.out.println("");
		}
	}

	/**
	 * method just prints the array the console
	 * 
	 * @param array
	 */
	public static void printMessage(char[] array) {
		for (char i : array) {
			System.out.print(i);
		}
	}

	/**
	 * User enters his array character by character
	 * 
	 * @param lenght
	 *            how long his array shall be
	 * @return returns the new created array
	 */
	public static char[] readChars(int lenght) {
		char[] newArray = new char[lenght];
		for (int i = 0; i < newArray.length; i++) {
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Character for position " + i + ": ");
			newArray[i] = scan4.next().charAt(0);
		}
		return newArray;

	}

	/**
	 * method switches the original array to a shifted array with a for loop
	 * 
	 * @param array
	 *            is the array the User created
	 * @param value
	 *            number of shifting
	 * 
	 */
	public static void shift(char[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			int shifting = (int) array[i];
			shifting = shifting + value;
			char result = (char) shifting;
			array[i] = result;

		}

	}

	/**
	 * 
	 * User decides how to proceed
	 * 
	 * @return shift returns 0 for moving on exit returns 1 for shut down
	 */
	public static int getCommand() {
		while (true) {

			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter your command [shift] [exit]: ");
			String s = scan3.nextLine();
			if (s.equals("shift")) {
				return 0;
			} else if (s.equals("exit")) {
				System.out.println("Goodbye.");
				return 1;
			} else {
				System.out.println("Your command is wrong.");
				return 0;
			}
		}
	}
}
