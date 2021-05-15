package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class HlavneMenuView {

    Scene scenaHlavneMenu;

    Label textLabel = new Label();
    Label textLabel_welcome= new Label("DISTRIBUČNÉ CENTRUM ");
    Button btnPridatZamestnanca = new Button("PRIDAŤ ZAMESTNANCA");
    Button btnPridatProdukt = new Button("PRIDAŤ PRODUKT");
    Button btnSpravaZamestnanca = new Button("SPRAVA ZAMESTNANCOV");
    Button btnSimulatorDni = new Button("DEŇ +1");
    Button btnKoniec = new Button("KONIEC");

    public HlavneMenuView() {

        //textLabel.setText("HLAVNE MENU ");

        VBox hlavneMenu = new VBox();

        btnSimulatorDni.setPadding(new Insets(10,63,10,63));
        btnPridatProdukt.setPadding(new Insets(5,33,5,33));
        btnPridatZamestnanca.setPadding(new Insets(5,15,5,15));
        hlavneMenu.setPadding(new Insets(10, 20, 10, 20));
        hlavneMenu.setSpacing(10);
        hlavneMenu.getChildren().addAll(textLabel_welcome);
        hlavneMenu.getChildren().addAll(btnSimulatorDni,btnPridatZamestnanca,btnPridatProdukt,btnSpravaZamestnanca,btnKoniec);

        scenaHlavneMenu = new Scene(hlavneMenu, 600, 300);

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
}
