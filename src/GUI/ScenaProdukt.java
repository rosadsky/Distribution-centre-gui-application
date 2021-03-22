package GUI;

import distribution.centre.Main;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class ScenaProdukt {

    public static Scene makeProdukt(Stage window, Scene scene1) {
        // HPRIDANIE PRODUKTU MLIEČNY {

        Scene scenaPridanieProduktu;

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
        button2.setOnAction(e -> {
            window.setScene(scene1);
            Main.instertString(pocetKusov,nazovProduktu,dobaSpotreby);

        });


        VBox pridanieProduktu = new VBox(5);

        pridanieProduktu.setPadding(new Insets(5, 400, 10, 5));

        pridanieProduktu.getChildren().addAll(textLabel, pocetKusov);
        pridanieProduktu.getChildren().addAll(textLabel1, nazovProduktu);
        pridanieProduktu.getChildren().addAll(textLabel2, dobaSpotreby, button2);
        scenaPridanieProduktu = new Scene(pridanieProduktu, 600, 300);

        return scenaPridanieProduktu;
    }




}
