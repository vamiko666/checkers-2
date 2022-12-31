public class Board {
    Checker[][] board;

    public Board() {

        this.board = generateBoard();

    }

    private Checker[][] generateBoard() {
        Colors color = Colors.BLACK;
        Checker[][] board = new Checker[8][8];
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    board[j][i] = new Checker(j, i, color);
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    board[j][i] = new Checker(j, i, color);
                }
            }

        }
        color = Colors.WHITE;
        for (int i = 5; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    board[j][i] = new Checker(j, i, color);
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    board[j][i] = new Checker(j, i, color);
                }
            }

        }
        return board;
    }
//gets the board
    public Checker[][] getBoard() {
        return board;
    }

    public void updateBoard() {
        Checker[][] oldBoard = board;
        Checker[][] newBoard = new Checker[8][8];
        int row;
        int col;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (oldBoard[i][j] != null) {
                    row = oldBoard[i][j].getPosition()[0];
                    col = oldBoard[i][j].getPosition()[1];
                    newBoard[row][col] = oldBoard[i][j];



                }
            }
        }
        board = newBoard;
    }


}
