
package hangman_mvc;

//This Class returns a  randomized ImageIcon of 1-10 kitten pictures

import javax.swing.ImageIcon;


public class KittenGenerator {
    private String fileDest = "/hangman_mvc/Images/kittens/kitten";
    
    
    public ImageIcon getKitten(){
        Integer rand = (int)((Math.random() * 8));  
        String random = rand.toString();
        
        System.out.println(rand);
        return new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/kittens/kitten" + random
                + ".jpg"));
    
    }
            
}
