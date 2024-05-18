package hellofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Controller {

    Stage fenetre = new Stage();
    int boutonCliqué = 0;


    //on lance la video d'introduction puis on 
    public void initialisation() throws IOException{
        fenetre.close();
        URL resourceInitialisation = getClass().getResource("Initialisation.fxml");
        Parent rootInitialisation = FXMLLoader.load(resourceInitialisation);
        
        Scene sceneMenuPrincipal = new Scene(rootInitialisation);
        fenetre.setScene(sceneMenuPrincipal);

        fenetre.setMaximized(true);
        fenetre.setResizable(false);

        fenetre.show();
    }
    
    //on affiche le menu pricipal
    public void afficherMenuPrincipal(ActionEvent event) throws IOException {
        fenetre.close();
        URL resourceMenuPrincipal = getClass().getResource("MenuPrincipal.fxml");
        Parent rootMenuPrincipal = FXMLLoader.load(resourceMenuPrincipal);
        
        Scene sceneMenuPrincipal = new Scene(rootMenuPrincipal);
        fenetre = (Stage)((Node)event.getSource()).getScene().getWindow();
        fenetre.setScene(sceneMenuPrincipal);

        fenetre.setMaximized(true);
        fenetre.setResizable(false);

        fenetre.show();
    }

    //on affiche la fenêtre du mode automatique
    public void afficherModeAutomatique(ActionEvent event) throws IOException {
        fenetre.close();
        URL resourceModeAutomatique = getClass().getResource("ModeAutomatique.fxml");
        Parent rootModeAutomatique = FXMLLoader.load(resourceModeAutomatique);
        
        Scene sceneModeAutomatique = new Scene(rootModeAutomatique);
        fenetre = (Stage)((Node)event.getSource()).getScene().getWindow();
        fenetre.setScene(sceneModeAutomatique);

        fenetre.setMaximized(true);
        fenetre.setResizable(false);

        fenetre.show();
    }

    //on affiche la fenêtre du mode automatique
    public void afficherModeManuel(ActionEvent event) throws IOException {
        fenetre.close();
        URL resourceModeManuel = getClass().getResource("ModeManuel.fxml");
        Parent rootModeManuel = FXMLLoader.load(resourceModeManuel);
        
        Scene sceneModeManuel = new Scene(rootModeManuel);
        fenetre = (Stage)((Node)event.getSource()).getScene().getWindow();
        fenetre.setScene(sceneModeManuel);

        fenetre.setMaximized(true);
        fenetre.setResizable(false);

        fenetre.show();
    }
    
    //plan menu principal
    @FXML //indique qu'on est en lien avec le FXML
    public void handleModeAutomatiqueButtonAction(ActionEvent e) throws IOException{
        afficherModeAutomatique(e);
    } 
    @FXML
    public void handleModeManuelButtonAction(ActionEvent e) throws IOException{
        afficherModeManuel(e);
    } 
    @FXML
    public void handleArretButtonAction(ActionEvent e) throws IOException{
        fenetre.close();
        System.exit(0);
    } 

    //plan mode automatique
    @FXML
    public void handleRetourButtonAction(ActionEvent e) throws IOException{
        afficherMenuPrincipal(e);//même méthode pour le mode manuel
    }
    //on réutilise la méthode du bouton d'arrêt 
}