package tictactoegame;

public class ConditionCheck {
    private static ConditionCheck _conditionCheck = null;
    
    private ConditionCheck(){}
    
    public static ConditionCheck getInstance(){
        if(_conditionCheck == null){
            _conditionCheck = new ConditionCheck();
        }
        return _conditionCheck;
    }
    
    public static boolean checkWin(String[] gameBoard){
        if(gameBoard[0] == gameBoard[1] && gameBoard[0] == gameBoard[2] && gameBoard[0] != " "){
            return true;
        }
        else if(gameBoard[3] == gameBoard[4] && gameBoard[3] == gameBoard[5] && gameBoard[3] != " "){
            return true;
        }
        else if(gameBoard[6] == gameBoard[7] && gameBoard[6] == gameBoard[8] && gameBoard[6] != " "){
            return true;
        }
        else if(gameBoard[0] == gameBoard[3] && gameBoard[0] == gameBoard[6] && gameBoard[0] != " "){
            return true;
        }
        else if(gameBoard[1] == gameBoard[4] && gameBoard[1] == gameBoard[7] && gameBoard[1] != " "){
            return true;
        }
        else if(gameBoard[2] == gameBoard[5] && gameBoard[2] == gameBoard[8] && gameBoard[2] != " "){
            return true;
        }
        else if(gameBoard[0] == gameBoard[4] && gameBoard[0] == gameBoard[8] && gameBoard[0] != " "){
            return true;
        }
        else if(gameBoard[2] == gameBoard[4] && gameBoard[2] == gameBoard[6] && gameBoard[2] != " "){
            return true;
        }   
        else{
            return false;
        }      
    }
    
    public static boolean checkFreeField(String[] gameBoard, int turn){
        return gameBoard[turn].equals(" ");
    }
}
