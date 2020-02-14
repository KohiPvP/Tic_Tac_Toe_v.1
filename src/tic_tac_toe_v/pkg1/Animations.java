package tic_tac_toe_v.pkg1;

import javafx.fxml.FXML;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.ImageView;


public class Animations implements Runnable{
    @FXML
    private ImageView menu_wallpaper_1;
    public void run(){
        Animations();
        System.out.println("The new thread is running!");
    }
    private void Animations(){
         menu_wallpaper_1.setBlendMode(BlendMode.HARD_LIGHT);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
                ex.printStackTrace();
        }
    }
}
