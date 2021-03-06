package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


//String nazovFirmy, int numberOfProducts, String nazovProduktu, String typProduktu, double teplotaSkladovania

public class NovyProduktView {

    Scene scenaPridanieProduktu;

    Label textLabel4 = new Label("Výrobca");
    Label textLabel = new Label();
    Label textLabel1 = new Label();
    Label textLabel2 = new Label();
    Label textLabel3 = new Label();
    TextField meno = new TextField();
    TextField vyrobca = new TextField();
    TextField pocetProduktov = new TextField();
    CheckBox mliecny = new CheckBox("mliecny");
    CheckBox trvanlinvy = new CheckBox("trvanlinvy");
    CheckBox mrazeny  = new CheckBox("mrazeny");
    Button btnPridatProdukt = new Button("PRIDAŤ PRODUKT");



    public NovyProduktView() {

        textLabel.setText("Nazov produktu: ");
        textLabel1.setText("Pocet Produktov: ");
        textLabel2.setText("Typ produktu: ");

        VBox pridanieSkladnik = new VBox(5);

        pridanieSkladnik.setPadding(new Insets(5, 400, 10, 5));
        pridanieSkladnik.getChildren().addAll(textLabel4,vyrobca,textLabel, meno);
        pridanieSkladnik.getChildren().addAll(textLabel1, pocetProduktov, textLabel2, mliecny, trvanlinvy, mrazeny,textLabel3,btnPridatProdukt);
        scenaPridanieProduktu = new Scene(pridanieSkladnik, 600, 300);

    }

    public Scene getScenaPridanieProduktu() {
        return scenaPridanieProduktu;
    }


    public TextField getMeno() {
        return meno;
    }

    public TextField getVyrobca() {
        return vyrobca;
    }

    public TextField getPocetProduktov() {
        return pocetProduktov;
    }

    public CheckBox getMliecny() {
        return mliecny;
    }

    public CheckBox getTrvanlinvy() {
        return trvanlinvy;
    }

    public CheckBox getMrazeny() {
        return mrazeny;
    }

    public Button getBtnPridatProdukt() {
        return btnPridatProdukt;
    }
}