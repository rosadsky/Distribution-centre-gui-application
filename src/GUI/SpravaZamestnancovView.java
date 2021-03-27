package GUI;

import Zamestnanci.Skladnik;
import Zamestnanci.Zamestnanec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SpravaZamestnancovView {

    TableView<Zamestnanec> table;
    Scene scenaSpravaZamestnacov;
    ZamestnanciModel zamestnanciModel;



    Label textLabel = new Label();
    Button btnZobrazitZamestnancov = new Button("ZOBRAZIT ZAMESTNANCOV");


    public SpravaZamestnancovView() {

        //ObservableList<Zamestnanec> data = FXCollections.observableArrayList();



       // data = zamestnanciModel.getListObservableZamestnancov();

        textLabel.setText("SPRAVA ZAMESTNANCOV ");

        VBox spravaMenu = new VBox(5);

        // new column
        TableColumn<Zamestnanec,String> nameColumn = new TableColumn<>("meno");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("meno"));

        TableColumn<Zamestnanec,String> vek = new TableColumn<>("vek");
        vek.setMinWidth(50);
        vek.setCellValueFactory(new PropertyValueFactory<>("vek"));

        TableColumn<Zamestnanec,Integer> odpracovanychHodin = new TableColumn<>("oddpracovanychhodin");
        odpracovanychHodin.setMinWidth(50);
        odpracovanychHodin.setCellValueFactory(new PropertyValueFactory<>("oddpracovanychhodin"));

        table = new TableView<>();

        table.getColumns().addAll(nameColumn,vek,odpracovanychHodin);

        spravaMenu.setPadding(new Insets(5, 5, 10, 5));
        spravaMenu.getChildren().addAll(textLabel,table);
        //spravaMenu.getChildren().addAll(btnZobrazitZamestnancov);



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

    public TableView<Zamestnanec> getTable() {
        return table;
    }


    public ZamestnanciModel getZamestnanciModel() {
        return zamestnanciModel;
    }
}
