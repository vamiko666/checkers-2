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

    public boolean isJump(int row1, int col1, int row2, int col2) {
        int count = 0;
        if (col1 < col2) {
            for (int i = col1; i < col2; i++) {
                if (row1 < row2)
                    for (int j = row1; j < row2; j++) {
                        count++;
                    }
                else {
                    for (int j = row2; j < row1; j++) {
                        count++;
                    }
                }
            }
        } else {
            for (int i = col2; i < col1; i++) {
                if (row1 < row2)
                    for (int j = row1; j < row2; j++) {
                        count++;
                    }
                else {
                    for (int j = row2; j < row1; j++) {
                        count++;
                    }
                }
            }
        }
        return count >= 1;
    }
}



