package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HlavneMenuView {

    Scene scenaHlavneMenu;

    Label textLabel = new Label();
    Button btnPridatZamestnanca = new Button("PRIDAŤ ZAMESTNANCA");
    Button btnSpravaZamestnanca = new Button("SPRAVA ZAMESTNANCOV");
    Button btnSimulatorDni = new Button("DEŇ +1");
    Button btnKoniec = new Button("KONIEC");

    public HlavneMenuView() {

        //textLabel.setText("HLAVNE MENU ");

        VBox hlavneMenu = new VBox(5);

        hlavneMenu.setPadding(new Insets(5, 400, 10, 5));
        hlavneMenu.getChildren().addAll(textLabel);
        hlavneMenu.getChildren().addAll(btnSimulatorDni,btnPridatZamestnanca,btnSpravaZamestnanca,btnKoniec);

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
