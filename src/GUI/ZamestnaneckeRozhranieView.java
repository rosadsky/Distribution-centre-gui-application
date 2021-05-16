package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ZamestnaneckeRozhranieView {

    Scene ZamestnaneckeRozhranie;

    TextArea textArea = new TextArea();
    Button btnZobrazitPraceSkladik = new Button("SKLADNICI");
    Button btnZobrazitPracePekar = new Button("PEKARI");
    Button btnZobrazitPraceManazer = new Button("MANAZERI");

    public ZamestnaneckeRozhranieView() {


        VBox zamestnaneckeRozhranie = new VBox(10);
        HBox zamestnanci = new HBox(10);

        zamestnanci.getChildren().addAll(btnZobrazitPraceSkladik, btnZobrazitPracePekar, btnZobrazitPraceManazer);

        zamestnaneckeRozhranie.getChildren().addAll(zamestnanci, textArea);

        ZamestnaneckeRozhranie = new Scene(zamestnaneckeRozhranie, 600, 300);

    }
}
