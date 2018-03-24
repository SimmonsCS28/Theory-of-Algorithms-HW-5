import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ask for size of chess board
		System.out.println("Please enter a number greater than 3 but less than or equal to 200 to set the size of the chess board.");
		int boardSize = input.nextInt();

		// Set size of chess board
		while (boardSize < 3 || boardSize > 200) {
			if (boardSize <= 3 || boardSize > 200) {
				System.out.println(
						"Number entered is invalid. Please enter a number greater than 3 but less or equal to 200.");
				boardSize = input.nextInt();
			} else {
				Chessboard[][] board = new Chessboard[boardSize][boardSize];
			};
		};
		
		System.out.println("The size of the chess board is now " + boardSize + "x" + boardSize + ".");
		
		// Initialize the goal position
		
		// Initialize the Knight's position
		
		// Find a path to the goal
		
		// Print out results
	};
};
