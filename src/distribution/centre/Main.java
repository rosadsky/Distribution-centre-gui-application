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
    Scene scene2;

    
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
    /*
    public void start(Stage primaryStage) throws Exception {
        Stage window;
        Button button;

        window = primaryStage;
        window.setTitle("JAVAFX - Joe");



        TextField pocetKusov = new TextField();
        TextField nazovProduktu = new TextField();
        TextField dobaSpotreby = new TextField();
        button = new Button("Click me");
        button.setOnAction(e -> {
            instertString(pocetKusov,nazovProduktu,dobaSpotreby);

        });

        VBox layout = new VBox();

        layout.setPadding(new Insets(5,400,10,5));
        layout.getChildren().addAll(pocetKusov);
        layout.getChildren().addAll(nazovProduktu);
        layout.getChildren().addAll(dobaSpotreby,button);

        Scene scene = new Scene(layout,500,500);
        window.setScene(scene);
        window.show();
    }
*/
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;


        // HLAVNA SCÉNA {

        Button button1 = new Button("Pridanie produktu ->");
        Button button3 = new Button("Pridanie zamestnanca ->");
        button1.setOnAction(e -> {
            window.setScene(scene2);
        });

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(button1,button3);
        scene1 = new Scene(layout1,200,200);

        // } HLAVNA SCENA

        /*------------------------------------*/

        // HPRIDANIE PRODUKTU MLIEČNY {

        Label textLabel = new Label();
        Label textLabel1 = new Label();
        Label textLabel2 = new Label();

        textLabel.setText("Pocet kusov:");
        TextField pocetKusov = new TextField();
        textLabel1.setText("Nazov Produktu:");
        TextField nazovProduktu = new TextField();
        textLabel2.setText("Doba spotreby:");
        TextField dobaSpotreby = new TextField();

        Button button2 = new Button("OK!");
        button2.setOnAction(e-> {
            window.setScene(scene1);
            instertString(pocetKusov,nazovProduktu,dobaSpotreby);

        });


        VBox pridanieProduktu = new VBox(5);

        pridanieProduktu.setPadding(new Insets(5,400,10,5));

        pridanieProduktu.getChildren().addAll(textLabel,pocetKusov);
        pridanieProduktu.getChildren().addAll(textLabel1,nazovProduktu);
        pridanieProduktu.getChildren().addAll(textLabel2,dobaSpotreby,button2);
        scene2 = new Scene(pridanieProduktu, 600, 300);

        // } PRIDANIE PRODUKTU MLIEČNY

        /*------------------------------------*/

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
    private void instertString(TextField pocetKusov, TextField nazov, TextField koniecSpotreby) {
        int pocetKusovInt = Integer.parseInt(pocetKusov.getText());
        int koniecSpotrebyInt = Integer.parseInt(koniecSpotreby.getText());

        ListProduktov.add(new Mliecny(pocetKusovInt,nazov.getText(),koniecSpotrebyInt));

    }


}
