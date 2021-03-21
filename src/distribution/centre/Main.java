package distribution.centre;

import java.util.ArrayList;

import Sklad.Sklad;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import Produkt.*;
import Sklad.*;


public class Main extends Application {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;


    
    public static void main(String[] args) {




        ListOfDodavatelia = new ArrayList<Dodavatel>();
        ListProduktov = new ArrayList<Produkt>();


      Teply teplySklad = new Teply(12,12,true);
      Chladny chladnySklad = new Chladny(13,12,10);
      Mraznicka mraznickaSklad = new Mraznicka(14,12,22);



      System.out.println("Teply sklad: " + teplySklad.getPocetZamestancov());
      System.out.println("Chladny sklad: " + chladnySklad.getPocetZamestancov());
      System.out.println("Mrazak sklad: " + mraznickaSklad.getPocetZamestancov());

       ListOfDodavatelia.add(new Dodavatel(15,12," Treska Žilina"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska BA"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));


        ListProduktov.add(new Mliecny(12,"Mlieko",12));
        ListProduktov.add(new Mrazeny(12,"Masko Kuracie",true));
        ListProduktov.add(new Trvanlivy(12,"Coca Cola",4));
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Distribution Centre - information system by Roman Osadsky");
        Button btnNovyZamestnanec = new Button();
        Button btnNovyProdukt = new Button();
        btnNovyZamestnanec.setText("Nový zamestnanec");
        btnNovyProdukt.setText("Novy produkt");

        btnNovyZamestnanec.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btnNovyZamestnanec);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }
}
