package tictactoegame;

import java.util.Scanner;

public class Turn {
    private static Turn _turn = null;
    
    private Turn(){};
    
    public static Turn getInstance(){
        if(_turn == null){
            _turn = new Turn();
        }
        return _turn;
    }
    
    public static void makeTurn(String[] gameBoard, int turn, Player player){
        
        boolean noInputTurnError = false;
        
        while(!noInputTurnError){
            if(turn < 0 || turn >= gameBoard.length){
                System.out.println("Invalid turn. Make a valid turn: ");
                noInputTurnError = false;
                turn = makeNewTurn();
            }
            if(ConditionCheck.checkFreeField(gameBoard, turn)){
               gameBoard[turn] = player.getSymbol();
               noInputTurnError = true;
            }
            else{
                System.out.println("Field blocked. Make a new turn: ");
                noInputTurnError = false;
                turn = makeNewTurn();
            }
        }
    }
    
    private static int makeNewTurn(){
        Scanner scanner = new Scanner(System.in);
        try{
          return(scanner.nextInt());
        }
        catch(Exception e){
            System.out.println(e.getCause());
            return -1;
        }
    }
}
