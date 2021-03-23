package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class SpravaZamestnancovView {


    Scene scenaSpravaZamestnacov;

    Label textLabel = new Label();
    Button btnZobrazitZamestnancov = new Button("ZOBRAZIT ZAMESTNANCOV");


    public SpravaZamestnancovView() {


        textLabel.setText("HLAVNE MENU ");

        HBox spravaMenu = new HBox(5);

        spravaMenu.setPadding(new Insets(5, 400, 10, 5));
        spravaMenu.getChildren().addAll(textLabel);
        spravaMenu.getChildren().addAll(btnZobrazitZamestnancov);

        scenaSpravaZamestnacov = new Scene(spravaMenu, 600, 300);

    }

    public Scene getScenaSpravaZamestnacov() {
        return scenaSpravaZamestnacov;
    }

    public Label getTextLabel() {
        return textLabel;
    }

    public Button getBtnZobrazitZamestnancov() {
        return btnZobrazitZamestnancov;
    }
}
