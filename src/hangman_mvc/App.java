
package hangman_mvc;


public class App {
    
    public static void main(String args[]){
        GameModel gameModel = new GameModel();
        Controller controller = new Controller(gameModel);
        View view = new View(gameModel, controller);     
        view.setVisible(true);       
        
    }  
}
