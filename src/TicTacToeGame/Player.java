package TicTacToeGame;

public class Player {
//    Name
    String name;
//    Symbol
    char symbol;

//    Empty Constructor
    public Player(){

    }


    public Player(String Name, char Symbol){
        this.name = Name;
        this.symbol = Symbol;

    }

//    Mark
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }

    public void makeMove() {

    }
}
