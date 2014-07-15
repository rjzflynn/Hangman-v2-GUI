package hangman_mvc;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicPlayer {

    FileInputStream fIS;
    BufferedInputStream bIS;
    public Player player;
    public boolean playing;
    

    public void stop() {
        if (player != null) {
            player.close();
        }
        playing = false;
    }
    


    public void play(String path) {
            
        try {
            String s = getClass().getResource("/hangman_mvc/Music/" + path + ".mp3").toString();
            s = s.substring(6);                    //removes the "file: /" prefix attachey by the .getResource method
            s = s.replaceAll("%20", " ");          //match String to how .mp3 files are named
             
            fIS = new FileInputStream(s);
            bIS = new BufferedInputStream(fIS);
            player = new Player(bIS);

        } catch (FileNotFoundException | JavaLayerException ex) {
            ex.printStackTrace();
        }

       new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                   
                } catch (JavaLayerException ex) {
                    ex.printStackTrace();
                }

            }
        }.start();

        playing = true;
    }
    
    
}