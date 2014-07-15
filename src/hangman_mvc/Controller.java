package hangman_mvc;

public class Controller {

    GameModel gameModel;

    public Controller(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    void tryWith(char c) {
        if (gameModel.livesLeft > 0 && gameModel.guessed == false) {
            boolean wasTheGuessCorrect = wasTheGuessCorrect(c);

            if (wasTheGuessCorrect == true) {
                handleCorrectGuess(c);
            } else {
                handleWrongGuess();
            }
        }     
    }
    
    
     
    void reset(){
     gameModel.guessed = false;
     gameModel.correctGuessTotal = 0;
     gameModel.livesLeft = 6;
     setWordToGuess(gameModel.wordCatagory);
     initilizeGuessedSoFarStringBuffer();
    }
    
     void setLives(int amount){
        gameModel.livesLeft = amount; 
    }
    
    void initilizeGuessedSoFarStringBuffer(){
            gameModel.initilizeguessedSoFarStringBuffer();
        }
    
    boolean wasTheGuessCorrect(char guessLetter) {
        boolean match = false;
        for (int w = 0; w < gameModel.wordToGuess.length(); w++) {
            if (gameModel.wordToGuess.charAt(w) == guessLetter) {
                match = true;
            }
        }
        return match;
    }

    
    
    //sets the wordToGuess based on the current catagory
    void setWordToGuess(String s){
        gameModel.wordToGuess  = gameModel.wordGenerator.getWord(gameModel.wordCatagory);
    }

     
     void handleCorrectGuess(char in) {
        for (int w = 0; w < gameModel.wordToGuess.length(); w++) {
            if (gameModel.wordToGuess.charAt(w) == in) {
                gameModel.setHangmamWordIndexTo(w, in);
                gameModel.correctGuessTotal++;
            }
        }
    }

     void handleWrongGuess() {
        gameModel.livesLeft--;
    }
     
     void setCatagory(String catagory){
         gameModel.wordCatagory = catagory;
     }
}
