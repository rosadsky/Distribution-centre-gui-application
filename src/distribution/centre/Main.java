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
import javafx.scene.control.Label;
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
       //ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));


        ListProduktov.add(new Mliecny(12,"Mlieko",12));
        ListProduktov.add(new Mrazeny(12,"Masko Kuracie",true));
        ListProduktov.add(new Trvanlivy(12,"Coca Cola",4));
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Distribution Centre - information system by Roman Osadsky");
        Button btn = new Button();
        btn.setText("Nový zamestnanec");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Label secondLabel = new Label("I'm a Label on new Window");

                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);

                Scene secondScene = new Scene(secondaryLayout, 230, 100);


                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);

                // Set position of second window, related to primary window.
                newWindow.setX(primaryStage.getX() + 200);
                newWindow.setY(primaryStage.getY() + 100);

                newWindow.show();


            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }
}
