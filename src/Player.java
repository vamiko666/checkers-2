public class Player {
    private String name;
    private Colors color;

    public Player(String name, Colors color) {
        this.color = color;
        this.name = name;
    }//a

    public void move(int row, int col, Checker checker, Board board) {
        {
            if (checker != null) {
              checker.move(row, col, board);


            }
        }

    }
    public void setName(String newName){
        name=newName;
    }
}




