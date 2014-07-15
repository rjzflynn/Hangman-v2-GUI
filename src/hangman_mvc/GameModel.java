
package hangman_mvc;


public class GameModel  {
    
     boolean guessed;
     int correctGuessTotal;
     int livesLeft;
     String wordToGuess;
     StringBuffer guessedSoFarStringBuffer;
     String wordCatagory;
     
     WordGenerator wordGenerator;

    public GameModel() {
        wordGenerator = new WordGenerator(); 
        this.livesLeft = 6;
        wordCatagory = "default";
    }
    
    boolean isTheWholeWordGuessed() {
        return this.correctGuessTotal == this.wordToGuess.length();
    }
     
     
     String getHangmanWord(){  
        return putInSpaces(guessedSoFarStringBuffer.toString());
    }
    
   
     void setHangmamWordIndexTo(int index, char x){
        this.guessedSoFarStringBuffer.setCharAt(index, x);   
    }
     
      void initilizeguessedSoFarStringBuffer(){
         guessedSoFarStringBuffer = new StringBuffer();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedSoFarStringBuffer.append("_");
        }   
    }
      
      String getSecretWord(){
          StringBuffer sb = new StringBuffer();
        for (int i = 0; i < wordToGuess.length(); i++) {
            sb.append(wordToGuess.charAt(i) + " ");
        }
        return sb.toString();
      }
     
     private String putInSpaces(String aWord) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < aWord.length(); i++) {
            sb.append(aWord.charAt(i) + " ");
        }
        return sb.toString();
    }

   
     
     
    
}
