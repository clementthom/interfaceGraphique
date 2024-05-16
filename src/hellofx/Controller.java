package hellofx;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class Controller {


    
    
    //plan menu principal
    @FXML //indique qu'on est en lien avec le FXML
    public void handleModeAutomatiqueButtonAction(ActionEvent e) {
        System.out.println("Mode automatique actif");
    } 
    @FXML
    public void handleModeManuelButtonAction(ActionEvent e) {

    } 
    @FXML
    public void handleArretButtonAction(ActionEvent e) {

    } 
    
    public void initialize() {

    }
}