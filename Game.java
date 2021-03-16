package TIC;

import java.util.*;

public class Game {

	public static void playerTurn() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the position where you want to make your move (1-9): ");

        Integer[] valid = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pos = scan.nextInt();
        if (Arrays.asList(valid).contains(pos) && checkEmpty(pos)) {
            Object[] board = null;
			Object player = null;
			board[pos]=player;
            showBoard();
        }else {
            System.out.println("Invalid Choice");
            playerTurn();
        }

    }

    public static boolean checkEmpty(int pos) {
        char[] board = null;
		if(board[pos] == ' ') {
            return true;
        }else {
            System.out.println("The Position you entered is already filled. Please select the position that is empty.");
            playerTurn();
        }
        return true;
    }

    public static void main(String[] args) {
        makeEmpty();
        playerTurn();
        showBoard();
        playerTurn();
    }

	private static void showBoard() {
		// TODO Auto-generated method stub
		
	}

	private static void makeEmpty() {
		// TODO Auto-generated method stub
		
	}
}
