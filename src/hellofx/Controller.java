package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Label label;

    //plan menu principal
    protected void handleModeAutomatiqueButtonAction(ActionEvent e) {

    } 
    @FXML
    protected void handleModeManuelButtonAction(ActionEvent e) {

    } 
    @FXML
    protected void handleArretButtonAction(ActionEvent e) {

    } 

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        // label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }
}