public class Checker {
    private int row;
    private int column;

    private Colors color;

    boolean isKing;

    //king is like queen
    public Checker(int row, int column, Colors color) {
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public void setPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int[] getPosition() {
        return new int[]{row, column};
    }

    public Colors getColor() {
        return color;
    }

    public boolean move(int row, int column, Board board) {
        if (isKing == false) {
            if (Math.abs(row - this.row) == 1 && Math.abs(column - this.column) == 1) {
                this.row = row;
                this.column = column;

                return true;
            } else if (Math.abs(row - this.row) == 2 && Math.abs(column - this.column) == 2) {
                if (board.isJump(row, column, this.row, column)) {
                    this.row = row;
                    this.column = column;
                    return true;

                }
            }
        } else {
            if (board.isJump(row, column, this.row, this.column)) {
                this.row = row;
                this.column = column;
            }

        }
        return false;

    }

    private void CheckIsKing() {
        if (color.equals(Colors.WHITE)) {
            if (row == 0) {
                setKing(true);
            } else {
                if (row == 7) {
                    setKing(true);
                }
            }
        }
    }
}
