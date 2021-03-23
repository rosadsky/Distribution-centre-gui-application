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
    Button btnSpravaZamestnanca = new Button("PRIDAŤ ZAMESTNANCA");





    public HlavneMenuView() {

        textLabel.setText("HLAVNE MENU ");

        VBox hlavneMenu = new VBox(5);

        hlavneMenu.setPadding(new Insets(5, 400, 10, 5));
        hlavneMenu.getChildren().addAll(textLabel);
        hlavneMenu.getChildren().addAll(btnPridatZamestnanca,btnSpravaZamestnanca);

        scenaHlavneMenu = new Scene(hlavneMenu, 600, 300);

    }

    public Scene getScenaHlavneMenu() {
        return scenaHlavneMenu;
    }

    public Label getTextLabel() {
        return textLabel;
    }


    public Button getBtnPridatZamestnanca() {
        return btnPridatZamestnanca;
    }

    public Button getBtnSpravaZamestnanca() {
        return btnSpravaZamestnanca;
    }
}
