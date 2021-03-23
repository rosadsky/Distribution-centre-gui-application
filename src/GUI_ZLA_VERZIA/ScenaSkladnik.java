package GUI_ZLA_VERZIA;

import distribution.centre.Main;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScenaSkladnik {

    public static Scene makeSkladnik(Stage window) {
        // HPRIDANIE PRODUKTU MLIEČNY {

        Scene scenaPridanieSkladnik;

        // public Zamestnanec(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {
        //public Skladnik(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double rychlostPrace) {

        Label textLabel = new Label();
        Label textLabel1 = new Label();
        Label textLabel2 = new Label();

        textLabel.setText("Meno zamestnanca: ");
        TextField meno = new TextField();
        textLabel1.setText("Vek: ");
        TextField vek = new TextField();
        textLabel2.setText("Typ zamestnanca: ");

        CheckBox boxSkladnik = new CheckBox("Skladnik");
        CheckBox boxManager = new CheckBox("Manager");
        CheckBox boxPekar = new CheckBox("Pekar");

        Button BtnSkladnik = new Button("PRIDAŤ ZAMESTNANCA");
        BtnSkladnik.setOnAction(e -> {
            Main.pridajZamestnanca(meno,vek,boxSkladnik,boxManager,boxPekar);
            window.setScene(Main.scene1);
        });


        VBox pridanieSkladnik = new VBox(5);

        pridanieSkladnik.setPadding(new Insets(5, 400, 10, 5));
        pridanieSkladnik.getChildren().addAll(textLabel, meno);
        pridanieSkladnik.getChildren().addAll(textLabel1, vek,textLabel2,boxSkladnik,boxManager,boxPekar,BtnSkladnik);
        scenaPridanieSkladnik = new Scene(pridanieSkladnik, 600, 300);



        return scenaPridanieSkladnik;
    }

}
