package GUI;

import distribution.centre.Main;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrehladZamestnancov {

    private static Scene scenaPrehladSkladnikov;
    //Scene scenaPrehladSkladnikov;

    public static Scene showPrehlad(Stage window) {
        // HPRIDANIE PRODUKTU MLIEČNY {

        Scene scenaPridanieProduktu;


        scenaPrehladSkladnikov = TabulkaSkladnikov.showTabulkaSkladnikov(window);

        Button btnSkladnici = new Button("Skladnici ");
        Button btnManazeri = new Button("Manazeri ");
        Button btnPekari = new Button("Pekari");


        Button exit = new Button("VRATIT SA SPAT");

        btnSkladnici.setOnAction(e -> {
            window.setScene(scenaPrehladSkladnikov);
        });

        exit.setOnAction(e -> {
            window.setScene(Main.scene1);


        });


        HBox pridanieProduktu = new HBox(5);



        pridanieProduktu.setPadding(new Insets(5, 5, 10, 5));

        pridanieProduktu.getChildren().addAll(btnSkladnici,btnManazeri,btnPekari,exit);
        scenaPridanieProduktu = new Scene(pridanieProduktu, 600, 300);

        return scenaPridanieProduktu;
    }

}
