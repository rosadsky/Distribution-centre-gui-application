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


/*
    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        //Scéna na pridanie produktu
        scenaPridanieProduktu= ScenaProdukt.makeProdukt(window);

        scenaPridanieSkladnik = ScenaSkladnik.makeSkladnik(window);

        scenaPrehladZamestnancov = PrehladZamestnancov.showPrehlad(window);

        // HLAVNA SCÉNA {

        Button PridanieProduktu = new Button("   Pridanie produktu    ");

        Button PridanieSkladnika = new Button("  Pridanie zamestnanca  ");

        Button PrehladZamestnancov = new Button(" Prehlad zamestnancov ");

        PridanieProduktu.setOnAction(e -> {
            window.setScene(scenaPridanieProduktu);

        });

        PridanieSkladnika.setOnAction(e -> {
            window.setScene(scenaPridanieSkladnik);
        });

        PrehladZamestnancov.setOnAction(e -> {
            window.setScene(scenaPrehladZamestnancov);
        });

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(PridanieProduktu,PridanieSkladnika,PrehladZamestnancov);

        layout1.setPadding(new Insets(50, 5, 10, 50));
        scene1 = new Scene(layout1,400,400);

        window.setScene(scene1);
        window.setTitle("Distribution Centre System ");
        window.show();


    }
    */

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

        HlavneMenuController hlavneMenuController = new HlavneMenuController(hlavneMenuView,hlavneMenuModel,zamestnanciView,spravaZamestnancovView,novyProduktView,manazerskeRozhranieView,window);
        ZamestnanciController zamestnanciController = new ZamestnanciController(zamestnanciView,hlavneMenuModel);
        SpravaZamestnancovController spravaZamestnancovController = new SpravaZamestnancovController(spravaZamestnancovView,hlavneMenuModel);



        window.setScene(hlavneMenuView.getScenaHlavneMenu());
        window.setTitle("Distribution centre system by Roman Osadsky");
        window.show();



    }




}
