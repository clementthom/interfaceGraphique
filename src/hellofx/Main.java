package hellofx;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {

    //On va utitliser le modèle MVC(modèle - vue - controleur)

    //On utilise un FXML pour l'interface, plus besoin de déclarer des éléments (scene, boutons ...)
    //Le contrôle des scènes est effectué par le contrôleur
    @Override
    public void start(Stage fenetre) throws Exception{

        try {
        //implémentation video
            String path = "intro.mp4";
            Media media = new Media(new File(path).toURI().toString());
            // MediaPlayer mediaPlayer = new MediaPlayer(media);  
            // MediaView mediaView = new MediaView(mediaPlayer);
            // mediaPlayer.setAutoPlay(true);
        

            URL resourceMenuPrincipal = getClass().getResource("MenuPrincipal.fxml");
            Parent rootMenuPrincipal = FXMLLoader.load(resourceMenuPrincipal);

            // rootMenuPrincipal.getChildrenUnmodifiable().add(mediaView);

            Scene sceneMenuPrincipal = new Scene(rootMenuPrincipal);

            //fenetre.close();
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
