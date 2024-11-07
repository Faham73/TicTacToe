package TicTacToeGame;

public class Game {
    public Board board;
    public Player player1;
    public Player player2;

    public Game(){
        player1 = new Player("Nahid", 'X');
        player2 = new Player("Faham", 'O');

        board = new Board();
    }

    public void play() {
        System.out.println("Welcome to tic toc game.");
        player1.makeMove();
    }
}
