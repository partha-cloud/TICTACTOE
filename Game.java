package TIC;

import java.util.*;

public class Game {

	public static void main(String[] args) {}
	Scanner userInput=new Scanner(System.in);
	
		 char userLetter = chooseUserLetter1(userInput);
		 char computerLetter = (userLetter == 'X') ? '0' : 'X';
		 
	

  private static char chooseUserLetter1(Scanner userInput) {
    	System.out.print("choose your letter: ");
   return userInput.next().toUpperCase().charAt(0);
    }



	private char chooseUserLetter(Scanner userInput2) {
		// TODO Auto-generated method stub
		return 0;
	}

	}


