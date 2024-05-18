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
    //Le contrôle des scènes est effectué par le contrôleur
    @Override
    public void start(Stage fenetre) throws Exception{

        try {
            URL resourceMenuPrincipal = getClass().getResource("MenuPrincipal.fxml");
            Parent rootMenuPrincipal = FXMLLoader.load(resourceMenuPrincipal);

            Scene sceneMenuPrincipal = new Scene(rootMenuPrincipal);

            fenetre.close();
            fenetre.setScene(sceneMenuPrincipal);
            fenetre.setMaximized(true); //plein écran
            fenetre.setResizable(false);   //on ne peut pas redimensionner la fenêtre

            fenetre.show();
        } catch(Exception e) {
            e.printStackTrace();
        }


        /*URL resourceMenuPrincipal = getClass().getResource("MenuPrincipal.fxml");
        Parent rootMenuPrincipal = FXMLLoader.load(resourceMenuPrincipal);
        URL resourceModeAutomatique = getClass().getResource("ModeAutomatique.fxml");
        Parent rootModeAutomatique = FXMLLoader.load(resourceModeAutomatique);

        
        Scene sceneMenuPrincipal = new Scene(rootMenuPrincipal);
        Scene sceneModeAutomatique = new Scene(rootModeAutomatique);
        */
    }

    // implémentation du fichier FXML (langage à balise)

    public static void main(String[] args) {
        launch(args);
    }

}


/*            URL resourceMenuInitialisation = getClass().getResource("Initialisation.fxml");
            Parent rootInitialisation = FXMLLoader.load(resourceMenuInitialisation);
 */