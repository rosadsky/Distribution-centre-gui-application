package GUI;

import distribution.centre.Main;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ZamestnanciView {

    Scene scenaPridanieSkladnik;

    Label textLabel = new Label();
    Label textLabel1 = new Label();
    Label textLabel2 = new Label();
    TextField meno = new TextField();
    TextField vek = new TextField();
    CheckBox boxSkladnik = new CheckBox("Skladnik");
    CheckBox boxManager = new CheckBox("Manager");
    CheckBox boxPekar = new CheckBox("Pekar");
    Button btnSkladnik = new Button("PRIDAŤ ZAMESTNANCA");


    public ZamestnanciView() {

        textLabel.setText("Meno zamestnanca: ");
        textLabel1.setText("Vek: ");
        textLabel2.setText("Typ zamestnanca: ");

        VBox pridanieSkladnik = new VBox(5);

        pridanieSkladnik.setPadding(new Insets(5, 400, 10, 5));
        pridanieSkladnik.getChildren().addAll(textLabel, meno);
        pridanieSkladnik.getChildren().addAll(textLabel1, vek,textLabel2,boxSkladnik,boxManager,boxPekar,btnSkladnik);
        scenaPridanieSkladnik = new Scene(pridanieSkladnik, 600, 300);

    }

    public Label getTextLabel() {
        return textLabel;
    }

    public Label getTextLabel1() {
        return textLabel1;
    }

    public Label getTextLabel2() {
        return textLabel2;
    }

    public TextField getMeno() {
        return meno;
    }

    public TextField getVek() {
        return vek;
    }

    public CheckBox getBoxSkladnik() {
        return boxSkladnik;
    }

    public CheckBox getBoxManager() {
        return boxManager;
    }

    public CheckBox getBoxPekar() {
        return boxPekar;
    }

    public Button getBtnSkladnik() {
        return btnSkladnik;
    }

    public Scene getScenaPridanieSkladnik() {
        return scenaPridanieSkladnik;
    }
}
