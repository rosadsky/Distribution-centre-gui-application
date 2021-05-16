package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ManazerskeRozhranieView {

    Scene ManazerskeRozhranie;

    TextArea textArea = new TextArea();
    Button btnZobrazitStavSkladu = new Button("STAV SKLADU");
    public ManazerskeRozhranieView() {



        VBox manazerskeRozhranie = new VBox(10);

        manazerskeRozhranie.getChildren().addAll(btnZobrazitStavSkladu,textArea);

        ManazerskeRozhranie = new Scene(manazerskeRozhranie, 600, 300);


    }

    public Scene getManazerskeRozhranie() {
        return ManazerskeRozhranie;
    }

    public void appendText(String s) {
        this.textArea.appendText(s);
    }

    public Button getBtnZobrazitStavSkladu() {
        return btnZobrazitStavSkladu;
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
