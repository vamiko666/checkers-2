import java.util.Scanner;

public class Game {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player("aaa", Colors.WHITE);
        Player player2 = new Player("bbb", Colors.BLACK);
        Board game = new Board();
        boolean gameNotOver = true;
        Checker[][] board = game.getBoard();
        printBoard(board);


        player1.move(7, 6, board[7][7],game);
        game.updateBoard();
        board = game.board;
        printBoard(board);
    }


    public static void printBoard(Checker[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(i+" - - - - - - - -");
            System.out.print("|");
            for (int j = 0; j < board.length; j++) {

                if (board[j][i] != null) {
                    if (board[j][i].getColor().equals(Colors.WHITE)) {

                        System.out.print("W");

                    } else if (board[j][i].getColor().equals(Colors.BLACK)) {
                        System.out.print("B");
                    }
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }


    }

    public static int[] commands() {
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = scn.nextInt() - 1;
        }
        return result;
    }
}
