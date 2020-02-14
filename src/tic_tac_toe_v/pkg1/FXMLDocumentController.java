
package tic_tac_toe_v.pkg1;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Label label_winningText;
    
    @FXML
    private Pane pane_game;
    @FXML
    private Pane pane_menu;
    @FXML
    private Pane pane_winning;
    
    @FXML
    private Button game_button_1;
    @FXML
    private Button game_button_2;
    @FXML
    private Button game_button_3;
    @FXML
    private Button game_button_4;
    @FXML
    private Button game_button_5;
    @FXML
    private Button game_button_6;
    @FXML
    private Button game_button_7;
    @FXML
    private Button game_button_8;
    @FXML
    private Button game_button_9;
    @FXML
    private Button btn_newGame;
    @FXML
    private Button btn_backToMenu;
    
    @FXML
    private ImageView menu_wallpaper_1;
    @FXML
    private ImageView menu_wallpaper_2;
    @FXML
    private ImageView menu_wallpaper_3;
    @FXML
    private ImageView menu_wallpaper_4;
    @FXML
    private ImageView menu_wallpaper_5;
    @FXML
    private ImageView menu_wallpaper_6;
    @FXML
    private ImageView menu_wallpaper_7;
    @FXML
    private ImageView menu_wallpaper_8;
    
     static ArrayList<Integer> playerPositions = new ArrayList<>();
     static ArrayList<Integer> cpuPositions = new ArrayList<>();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {    //Start
        openGameWindow();
    }
    @FXML
    private void buttonExit(ActionEvent event){         //Kilépés
        System.exit(0);
    }
    @FXML
    private void newGame(ActionEvent event){
        openGameWindow();
    }
    @FXML
    private void backToMenu(ActionEvent event){
        openMenuWindow();
    }
    
    
    public void onButton1(ActionEvent event){
        int buttonID = 1;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
             
    }
    public void onButton2(ActionEvent event){
        int buttonID = 2;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton3(ActionEvent event){
        int buttonID = 3;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton4(ActionEvent event){
        int buttonID = 4;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton5(ActionEvent event){
        int buttonID = 5;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton6(ActionEvent event){
        int buttonID = 6;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton7(ActionEvent event){
        int buttonID = 7;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton8(ActionEvent event){
        int buttonID = 8;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    public void onButton9(ActionEvent event){
        int buttonID = 9;
        Boolean Zone = checkZone(buttonID);
        if (Zone == false) {
            Tasker(buttonID, Zone);
        }
        else{
            System.out.println("The zone is not empty!");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Animations an1 = new Animations();
        Thread t1 = new Thread(new Animations());
        t1.start();
        setImageViews();
        openMenuWindow();
        System.out.println("The progam is running!");
    }
    public void openGameWindow(){
        pane_menu.setVisible(false);
        pane_game.setVisible(true);
        pane_winning.setVisible(false);
    }
    public void openMenuWindow(){
        pane_menu.setVisible(true);
        pane_game.setVisible(false);
        pane_winning.setVisible(false);
    }
    
    private void Tasker(int buttonID, Boolean Zone){
        //Player
            int playerPos = buttonID;
            placePiece("player", playerPos);
            playerPositions.add(playerPos);
            checkWinning();
            
        //CPU       
            Random rand = new Random(); //Empty
            int cpuPos = rand.nextInt(9)+1;
            while (checkZone(cpuPos) == true) {            
                cpuPos = rand.nextInt(9)+1;
            } //Generate to right cpuPosition
            placePiece("cpu", cpuPos);
            cpuPositions.add(cpuPos);
            checkWinning();
         
        
    }
    private Boolean checkZone(int ButtonNumber){
        switch(ButtonNumber){
            case 1: if(game_button_1.getText() == null || game_button_1.getText() == ""){
                    return false;
                    }
                break;
            case 2: if(game_button_2.getText() == null || game_button_2.getText() == ""){
                    return false;
                    }
                break;
            case 3: if(game_button_3.getText() == null || game_button_3.getText() == ""){
                    return false;
                    }
                break;
            case 4: if(game_button_4.getText() == null || game_button_4.getText() == ""){
                    return false;
                    }
                break;
            case 5: if(game_button_5.getText() == null || game_button_5.getText() == ""){
                    return false;
                    }
                break;
            case 6: if(game_button_6.getText() == null || game_button_6.getText() == ""){
                    return false;
                    }
                break;
            case 7: if(game_button_7.getText() == null || game_button_7.getText() == ""){
                    return false;
                    }
                break;
            case 8: if(game_button_8.getText() == null || game_button_8.getText() == ""){
                    return false;
                    }
                break;
            case 9: if(game_button_9.getText() == null || game_button_9.getText() == ""){
                    return false;
                    }
                break;
        }
        return true;
    }
    private void checkWinning(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,6,7);
        
        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);
        for(List l : winning){
            if (playerPositions.containsAll(l)) {
                openWinningWindow("player");
            } else if(cpuPositions.containsAll(l)){
                openWinningWindow("cpu");
            } 
        } 
        if (playerPositions.size() + cpuPositions.size() == 9) {
            System.err.println("The table is full!");
            clearPositions();
        }
    }
    private void placePiece(String user, int pos){
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else {
            symbol = 'O';
        }
        switch(pos){
            case 1:
                game_button_1.setText("" + symbol);
                break;
            case 2:
                game_button_2.setText("" + symbol);
                break;
            case 3:
                game_button_3.setText("" + symbol);
                break;
            case 4:
                game_button_4.setText("" + symbol);
                break;
            case 5:
                game_button_5.setText("" + symbol);
                break;
            case 6:
                game_button_6.setText("" + symbol);
                break;
            case 7:
                game_button_7.setText("" + symbol);
                break;
            case 8:
                game_button_8.setText("" + symbol);
                break;
            case 9:
                game_button_9.setText("" + symbol);
                break;              
        }
    }
    private void openWinningWindow(String winner){
        clearPositions();
        pane_menu.setVisible(false);
        pane_game.setVisible(false);
        pane_winning.setVisible(true);
        if(winner.contains("player")){
            label_winningText.setText("Gratulálunk te nyertél! :)");
        } else if(winner.contains("cpu")){
            label_winningText.setText("Sajnos a cpu nyert! :(");
        }
    }
    public void clearPositions(){
        playerPositions.clear();
        cpuPositions.clear();
        game_button_1.setText("");
        game_button_2.setText("");
        game_button_3.setText("");
        game_button_4.setText("");
        game_button_5.setText("");
        game_button_6.setText("");
        game_button_7.setText("");
        game_button_8.setText("");
        game_button_9.setText("");
    }
    public void setImageViews(){
        try {
            final Image image = new Image("image/menu_wallpaper.jpg");
            menu_wallpaper_1.setImage(image);
            menu_wallpaper_2.setImage(image);
            menu_wallpaper_3.setImage(image);
            menu_wallpaper_4.setImage(image);
            menu_wallpaper_5.setImage(image);
            menu_wallpaper_6.setImage(image);
            menu_wallpaper_7.setImage(image);
            menu_wallpaper_8.setImage(image);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void menuAnimations(){
    }
    
}
