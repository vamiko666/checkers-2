public class Checker {
    int row;
    int column;

    Colors color;

    boolean isKing;
    //king is like queen
    public Checker(int row,int column,Colors color){
        this.row=row;
        this.column=column;
        this.color=color;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }
    public void setPosition(int row, int column){
        this.row=row;
        this.column=column;
    }
    public int[] getPosition() { return new int[]{row, column}; }


    public Colors getColor() {
        return color;
    }

}
