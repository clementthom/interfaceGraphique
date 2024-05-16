package hellofx;

import java.net.URL;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    //On va utitliser le modèle MVC(modèle - vue - controleur)

    //On utilise un FXML pour l'interface, plus besoin de déclarer des éléments (scene, boutons ...)

    @Override
    public void start(Stage fenetre) throws Exception{
        URL resourceMenuPrincipal = getClass().getResource("MenuPrincipal.fxml");
        Parent rootMenuPrincipal = FXMLLoader.load(resourceMenuPrincipal);
        URL resourceModeAutomatique = getClass().getResource("ModeAutomatique.fxml");
        Parent rootModeAutomatique = FXMLLoader.load(resourceModeAutomatique);

        
        Scene sceneMenuPrincipal = new Scene(rootMenuPrincipal);
        Scene sceneModeAutomatique = new Scene(rootModeAutomatique);

        int numeroScene = 0;
        fenetre.setScene(sceneMenuPrincipal);

        

        switch(numeroScene) {
            case 0 :
                fenetre.setScene(sceneMenuPrincipal);
                break;
            case 1 :
                fenetre.setScene(sceneModeAutomatique);
                break;
        }

        fenetre.setMaximized(true);
        fenetre.setResizable(false);

        fenetre.show();
        

    }

    // implémentation du fichier FXML (langage à balise)

    public static void main(String[] args) {
        launch(args);
    }

}