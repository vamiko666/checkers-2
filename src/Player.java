public class Player {
    String name;
    Colors color;

    public Player(String name, Colors color){
        this.color=color;
        this.name=name;
    }//a
    public void move(int row, int col,Checker checker){
        {
            checker.row=row;
            checker.column=col;
        }
    }
}
