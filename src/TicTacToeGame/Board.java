package TicTacToeGame;

public class Board {

    //    3 by 3
    char[][] board;

    public Board(){
        board = new char[3][3];
        for (int i=0; i< board.length; i++){
            for (int j=0; j< board.length; j++){
                board[i][j] = '.';
            }
        }
    }
    void Display(){
        for (int i=0; i< board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
