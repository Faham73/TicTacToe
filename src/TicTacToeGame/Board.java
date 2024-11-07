package TicTacToeGame;

public class Board {

    //    3 by 3
    char[][] grid;
    public Board() {
        grid = new char[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                
            }
        }
    }
    
    public void display(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(grid[i][j]='.');
            }
        }
    }

    public void setMark() {
    }
}
