package distribution.centre;

import java.util.ArrayList;

import Sklad.Sklad;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import Produkt.*;
import Sklad.*;

import javax.xml.soap.Text;


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
        Stage window;
        Button button;

        window = primaryStage;
        window.setTitle("JAVAFX - Joe");
//Form
        TextField pocetKusov = new TextField();
        TextField nazovProduktu = new TextField();
        TextField dobaSpotreby = new TextField();
        button = new Button("Click me");
        button.setOnAction(e -> {
            instertString(pocetKusov,nazovProduktu,dobaSpotreby);

        });
//Layout
        VBox layout = new VBox();

        layout.setPadding(new Insets(5,400,10,5));
        layout.getChildren().addAll(pocetKusov);
        layout.getChildren().addAll(nazovProduktu);
        layout.getChildren().addAll(dobaSpotreby,button);
        Scene scene = new Scene(layout,500,500);
        window.setScene(scene);
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
    private void instertString(TextField pocetKusov, TextField nazov, TextField koniecSpotreby) {
        int pocetKusovInt = Integer.parseInt(pocetKusov.getText());
        int koniecSpotrebyInt = Integer.parseInt(koniecSpotreby.getText());

        ListProduktov.add(new Mliecny(pocetKusovInt,nazov.getText(),koniecSpotrebyInt));

    }


}
