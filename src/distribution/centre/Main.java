package distribution.centre;

import java.util.ArrayList;

import GUI.ScenaProdukt;
import GUI.ScenaSkladnik;
import Sklad.Sklad;
import Zamestnanci.Skladnik;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import Produkt.*;
import Sklad.*;
import sun.font.TextLabel;

import javax.xml.soap.Text;

import Sklad.Sklad;


public class Main extends Application {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;

    Stage window;
    public static Scene scene1;
    Scene scenaPridanieProduktu,scenaPridanieSkladnik;

    
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

        Sklad.definovanieZamestnancov();



        ListProduktov.add(new Mliecny(12,"Mlieko",12));
        ListProduktov.add(new Mrazeny(12,"Masko Kuracie",true));
        ListProduktov.add(new Trvanlivy(12,"Coca Cola",4));
        launch(args);

    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        //Scéna na pridanie produktu
        scenaPridanieProduktu= ScenaProdukt.makeProdukt(window);
        scenaPridanieSkladnik = ScenaSkladnik.makeSkladnik(window);


        // HLAVNA SCÉNA {

        Button PridanieProduktu = new Button("   Pridanie produktu    ");

        Button PridanieSkladnika = new Button("  Pridanie zamestnanca  ");

        PridanieProduktu.setOnAction(e -> {
            window.setScene(scenaPridanieProduktu);


        });

        PridanieSkladnika.setOnAction(e -> {
            window.setScene(scenaPridanieSkladnik);
        });


        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(PridanieProduktu,PridanieSkladnika);

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

    public static void pridajZamestnanca(TextField meno, TextField vek, CheckBox boxSkladnik, CheckBox boxManager, CheckBox boxPekar){

        String menoZamestnanca = meno.getText();
        int vekZamestnanca = Integer.parseInt(vek.getText());

        if(boxSkladnik.isSelected()){
            System.out.println("Vytvaram skladnika");
            Sklad.vytvorenieSkladnika(menoZamestnanca,vekZamestnanca);
        }

        if(boxManager.isSelected()){
            System.out.println("Vytvaram manažéra");
            Sklad.vytvoreniaManagera(menoZamestnanca,vekZamestnanca);
        }

        if(boxPekar.isSelected()){
            System.out.println("Vytvaram pekára");
            Sklad.vytvoreniePekara(menoZamestnanca,vekZamestnanca);
        }


    }


}
