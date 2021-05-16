package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class HlavneMenuView {

    Scene scenaHlavneMenu;

    Label textLabel = new Label();
    Label textLabel_welcome= new Label("DISTRIBUČNÉ CENTRUM ");
    Label textLabel_Simulator = new Label("PRIEBEH SKLADU");
    Button btnPridatZamestnanca = new Button("PRIDAŤ ZAMESTNANCA");
    Button btnPridatProdukt = new Button("PRIDAŤ PRODUKT");
    Button btnSpravaZamestnanca = new Button("SPRAVA ZAMESTNANCOV");
    Button btnManazer = new Button("MANAZERSKE ROZHRANIE");
    Button btnZamestanec = new Button("ZAMESTN. ROZHRANIE");
    Button btnSimulatorDni = new Button("DEŇ +1");
    Button btnAktualnyDen = new Button("AKTUALNY DEŇ");
    Button btnKoniec = new Button("KONIEC");
    TextArea textArea = new TextArea();

    public HlavneMenuView() {

        //textLabel.setText("HLAVNE MENU ");
        HBox hlavnemenu_1 = new HBox(10);
        VBox hlavneMenu = new VBox();
        VBox hlavnemenu_2 = new VBox();
        HBox hlavnemenu_3 = new HBox();


        textLabel_welcome.setPadding(new Insets(130,5,5,5));
        btnSimulatorDni.setPadding(new Insets(10,63,10,63));
        btnPridatProdukt.setPadding(new Insets(5,33,5,33));
        btnPridatZamestnanca.setPadding(new Insets(5,15,5,15));
        btnZamestanec.setPadding(new Insets(5,19,5,19));
        textLabel_Simulator.setPadding(new Insets(35,5,5,5));

        textArea.setPadding(new Insets(5,5,5,5));
        hlavneMenu.setPadding(new Insets(10, 20, 10, 20));
        hlavneMenu.setSpacing(10);
        textArea.setPrefWidth(350);
        textArea.setPrefHeight(400);
        hlavneMenu.getChildren().addAll(textLabel_welcome);
        hlavneMenu.getChildren().addAll(btnPridatZamestnanca,btnPridatProdukt,btnSpravaZamestnanca,btnManazer,btnZamestanec,btnKoniec);

        hlavnemenu_2.getChildren().addAll(textLabel_Simulator,textArea,hlavnemenu_3,btnSimulatorDni);

        hlavnemenu_1.setSpacing(10);
        hlavnemenu_2.setSpacing(10);

        hlavnemenu_1.getChildren().addAll(hlavneMenu,hlavnemenu_2);


        scenaHlavneMenu = new Scene(hlavnemenu_1, 600, 600);

    }

    public Scene getScenaHlavneMenu() {
        return scenaHlavneMenu;
    }

    public Label getTextLabel() {
        return textLabel;
    }

    public Button getBtnSimulatorDni() {
        return btnSimulatorDni;
    }

    public Button getBtnPridatZamestnanca() {
        return btnPridatZamestnanca;
    }

    public Button getBtnSpravaZamestnanca() {
        return btnSpravaZamestnanca;
    }

    public Button getBtnKoniec() {
        return btnKoniec;
    }

    public void setBtnKoniec(Button btnKoniec) {
        this.btnKoniec = btnKoniec;
    }

    public void setTextArea(String textArea) {
        this.textArea.setText(textArea);
    }

    public void appendText(String s) {
        this.textArea.appendText(s);
    }

    public Button getBtnPridatProdukt() {
        return btnPridatProdukt;
    }

    public Button getBtnManazer() {
        return btnManazer;
    }

    public Button getBtnZamestanec() {
        return btnZamestanec;
    }
}

