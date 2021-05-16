package distribution.centre;

import java.util.ArrayList;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import Controller.*;
import GUI.*;


public class Main extends Application {


    public static void main(String[] args) {
    launch(args);
    }


    public void start(Stage primaryStage) throws Exception {


        Stage window = primaryStage;
        Stage okno;


        ZamestnanciView zamestnanciView = new ZamestnanciView();
        SpravaZamestnancovView spravaZamestnancovView = new SpravaZamestnancovView();
        HlavneMenuView hlavneMenuView = new HlavneMenuView();
        HlavneMenuModel hlavneMenuModel = new HlavneMenuModel();

        NovyProduktView novyProduktView = new NovyProduktView();
        NovyProduktController novyProduktController = new NovyProduktController(novyProduktView,hlavneMenuModel);

        ManazerskeRozhranieView manazerskeRozhranieView = new ManazerskeRozhranieView();
        ManazerskeRozhranieController manazerskeRozhranieController = new ManazerskeRozhranieController(manazerskeRozhranieView,hlavneMenuModel);


        ZamestnaneckeRozhranieView zamestnaneckeRozhranieView = new ZamestnaneckeRozhranieView();
        ZamestaneckeRozhranieController zamestaneckeRozhranieController = new ZamestaneckeRozhranieController(zamestnaneckeRozhranieView,hlavneMenuModel);

        HlavneMenuController hlavneMenuController = new HlavneMenuController(hlavneMenuView,hlavneMenuModel,zamestnanciView,spravaZamestnancovView,novyProduktView,manazerskeRozhranieView,zamestnaneckeRozhranieView,window);
        ZamestnanciController zamestnanciController = new ZamestnanciController(zamestnanciView,hlavneMenuModel);
        SpravaZamestnancovController spravaZamestnancovController = new SpravaZamestnancovController(spravaZamestnancovView,hlavneMenuModel);



        window.setScene(hlavneMenuView.getScenaHlavneMenu());
        window.setTitle("Distribution centre system by Roman Osadsky");
        window.show();



    }




}
