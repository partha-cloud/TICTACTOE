package TIC;

public class Game {

	public static void main(String[] args) {
		 char[] board1 = createBoard();
		 System.out.println(board1);
	}

    public static char[] createBoard()
    {
        char[] board=new char[10];
        for(int index=0; index < board.length ; index++)
        {
            board[index]=' ';
        }
        return board;
    }

	}


