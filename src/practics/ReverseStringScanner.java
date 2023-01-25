package practics;

import java.util.Scanner;

public class ReverseStringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scan.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");

	}

}
