package TIC;

import java.util.*;

public class Game {

	 public static void showBoard() {
	        System.out.println("Currently the Board Looks Like ");
	        System.out.println(" ");
	        String[] board = null;
			System.out.println("\n "+ board[1] + " | "+ board[2] + " | " + board[3]);
	        System.out.println("-----------");
	        System.out.println(" "+ board[4] + " | " + board[5] + " | " + board[6]);
	        System.out.println("-----------");
	        System.out.println(" "+ board[7] + " | " + board[8] + " | " + board[9]);
	        System.out.println(" ");
	    }

	    public static void main(String[] args) {
	        makeEmpty();
	        playerSelect();
	        showBoard();
	        
	    }

		private static void makeEmpty() {
			// TODO Auto-generated method stub
			
		}

		private static void playerSelect() {
			// TODO Auto-generated method stub
			
		}
	}
	
