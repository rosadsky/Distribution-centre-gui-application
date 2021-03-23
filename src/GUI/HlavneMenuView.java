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
    Label textLabel1 = new Label();
    Label textLabel2 = new Label();



    public HlavneMenuView() {

        textLabel.setText("HLAVNE MENU ");
        textLabel1.setText("AAAA ");


        VBox hlavneMenu = new VBox(5);

        hlavneMenu.setPadding(new Insets(5, 400, 10, 5));
        hlavneMenu.getChildren().addAll(textLabel);
        hlavneMenu.getChildren().addAll(textLabel1);

        scenaHlavneMenu = new Scene(hlavneMenu, 600, 300);

    }
}
