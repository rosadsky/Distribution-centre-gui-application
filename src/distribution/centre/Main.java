package distribution.centre;

import java.util.ArrayList;

import GUI.ScenaProdukt;
import Sklad.Sklad;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import Produkt.*;
import Sklad.*;
import sun.font.TextLabel;

import javax.xml.soap.Text;


public class Main extends Application {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;

    Stage window;
    Scene scene1;
    Scene scenaPridanieProduktu;

    
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

        window = primaryStage;

        //Scéna na pridanie produktu
        scenaPridanieProduktu= ScenaProdukt.makeProdukt(window,scene1);


        // HLAVNA SCÉNA {

        Button button1 = new Button("   Pridanie produktu    ");
        Button button3 = new Button("  Pridanie zamestnanca  ");
        button1.setOnAction(e -> {
            window.setScene(scenaPridanieProduktu);
        });

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(button1,button3);

        layout1.setPadding(new Insets(50, 5, 10, 50));
        scene1 = new Scene(layout1,400,400);



        window.setScene(scene1);
        window.setTitle("Distribution Centre System ");
        window.show();


    }

    private void pocetKusov(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("User is " + age);
            ListProduktov.add(new Mliecny(age,"Mlieko",12));
        } catch(NumberFormatException e) {
            System.out.println("Error: " + message + "is not a number");
        }
    }
    public static void instertString(TextField pocetKusov, TextField nazov, TextField koniecSpotreby) {
        int pocetKusovInt = Integer.parseInt(pocetKusov.getText());
        int koniecSpotrebyInt = Integer.parseInt(koniecSpotreby.getText());

        ListProduktov.add(new Mliecny(pocetKusovInt,nazov.getText(),koniecSpotrebyInt));

    }


}
