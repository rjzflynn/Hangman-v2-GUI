package hangman_mvc;

import javax.swing.ImageIcon;

//this Class returns image icons for the Hangman graphic according to the number of Lives in the current gameModel

public class HangingMan {

    GameModel gameModel;
    String zersLives = "/hangman_mvc/Images/hangman_1Lives.png";
    String oneLive = "/hangman_mvc/Images/hangman_1Lives.png";
    String twoLives = "/hangman_mvc/Images/hangman_1Lives.png";
    String threeLives = "/hangman_mvc/Images/hangman_2Lives.png";
    String fourLives = "/hangman_mvc/Images/hangman_3Lives.png";
    String fiveLives = "/hangman_mvc/Images/hangman_4Lives.png";
    String sixLives = "/hangman_mvc/Images/hangman_5Lives.png";

    public HangingMan(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public ImageIcon updateHangmanGraphic() {

        switch (gameModel.livesLeft) {
            case 0:
                gameModel.livesLeft = 0;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_0Lives.png"));
            case 1:
                gameModel.livesLeft = 1;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_1Lives.png"));

            case 2:
                gameModel.livesLeft = 2;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_2Lives.png"));
            case 3:
                gameModel.livesLeft = 3;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_3Lives.png"));
            case 4:
                gameModel.livesLeft = 4;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_4Lives.png"));
            case 5:
                gameModel.livesLeft = 5;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_5Lives.png"));
            case 6:
                gameModel.livesLeft = 6;
                return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_6Lives.png"));
        }
        return null;

    }
    
    public ImageIcon displayPrize(){
        return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/kitten.jpg"));
    }
}