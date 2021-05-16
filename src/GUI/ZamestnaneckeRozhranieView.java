package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ZamestnaneckeRozhranieView {

    Scene ZamestnaneckeRozhranie;
    Label textLabel_welcome= new Label("INFORMÁCIE PRE ZAMESTANCOV O ICH EFEKTIVITE PRÁCE ");
    TextArea textArea = new TextArea();
    Button btnZobrazitPraceSkladik = new Button("SKLADNICI");
    Button btnZobrazitPracePekar = new Button("PEKARI");
    Button btnZobrazitPraceManazer = new Button("MANAZERI");

    public ZamestnaneckeRozhranieView() {


        VBox zamestnaneckeRozhranie = new VBox(10);
        HBox zamestnanci = new HBox(10);

        zamestnanci.getChildren().addAll(btnZobrazitPraceSkladik, btnZobrazitPracePekar, btnZobrazitPraceManazer);

        zamestnaneckeRozhranie.getChildren().addAll(textLabel_welcome,zamestnanci, textArea);

        ZamestnaneckeRozhranie = new Scene(zamestnaneckeRozhranie, 600, 300);

    }

    public Scene getZamestnaneckeRozhranie() {
        return ZamestnaneckeRozhranie;
    }

    public void appendText(String s) {
        this.textArea.appendText(s);
    }

    public Button getBtnZobrazitPraceSkladik() {
        return btnZobrazitPraceSkladik;
    }

    public Button getBtnZobrazitPracePekar() {
        return btnZobrazitPracePekar;
    }

    public Button getBtnZobrazitPraceManazer() {
        return btnZobrazitPraceManazer;
    }
}
