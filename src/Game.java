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
        // while (gameNotOver){
        //    int[] movement=commands();
        //    player1.move(movement[2],movement[3],board[movement[1]][movement[0]]);
        //    game.updateBoard();
        //    board= game.board;
        //    System.out.flush();
        //    printBoard(board);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPosition()[0] + " ");
                    System.out.print(board[i][j].getPosition()[1] + " ");
                    if (board[i][j].getColor().equals(Colors.BLACK)) {
                        System.out.print("BLack\n");
                    } else {
                        System.out.print("Wite\n");
                    }
                }
            }

        }


    }


    public static void printBoard(Checker[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(" - - - - - - - -");
            System.out.print("|");
            for (int j = 0; j < board.length; j++) {

                if (board[j][i] != null) {
                    if (board[j][i].color.equals(Colors.WHITE)) {

                        System.out.print("W");

                    } else if (board[j][i].color.equals(Colors.BLACK)) {
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
