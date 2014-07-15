
package hangman_mvc;

import javax.swing.ImageIcon;


public class LivesBar {
    
    GameModel gameModel;
    
//    String oneLive = "/hangman_mvc/Images/1lives.png";
//    String twoLives = "/hangman_mvc/Images/1lives.png";
//    String threeLives = "/hangman_mvc/Images/1lives.png";
//    String fourLives = "/hangman_mvc/Images/1lives.png";
//    String fiveLives = "/hangman_mvc/Images/1lives.png";
//    String sixLives = "/hangman_mvc/Images/1lives.png";

    public LivesBar(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    
    
    public ImageIcon updateLivesBar(){
        switch(gameModel.livesLeft){
            case 0:
                gameModel.livesLeft = 0;
                return null;
            case 1:
                gameModel.livesLeft = 1;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/1lives.png"));
            case 2:
                gameModel.livesLeft = 2;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/2lives.png"));
            case 3:
                gameModel.livesLeft = 3;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/3lives.png"));
            case 4:
                gameModel.livesLeft = 4;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/4lives.png"));
            case 5:
                gameModel.livesLeft = 5;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/5lives.png"));
            case 6:
                gameModel.livesLeft = 6;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/6lives.png"));
        }
        return null;
    }
    
}
