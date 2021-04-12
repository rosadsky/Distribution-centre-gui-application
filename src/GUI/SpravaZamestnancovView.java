package GUI;

import Zamestnanci.Skladnik;
import Zamestnanci.Zamestnanec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SpravaZamestnancovView {

    TableView<Zamestnanec> table;
    Scene scenaSpravaZamestnacov;
    ZamestnanciModel zamestnanciModel;
    TextField nameInput, priceInput, quantityInput;
    Button addButton,deleteButton;


    Label textLabel = new Label();
    Button btnZobrazitZamestnancov = new Button("ZOBRAZIT ZAMESTNANCOV");


    public SpravaZamestnancovView() {

        textLabel.setText("SPRAVA ZAMESTNANCOV ");

        VBox spravaMenu = new VBox(5);


        // new column
        TableColumn<Zamestnanec,String> nameColumn = new TableColumn<>("meno");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("meno"));

        TableColumn<Zamestnanec,Integer> vek = new TableColumn<>("vek");
        vek.setMinWidth(50);
        vek.setCellValueFactory(new PropertyValueFactory("vek"));

        TableColumn<Zamestnanec,Double> odpracovanychHodin = new TableColumn<>("Odpracovanych hodin");
        odpracovanychHodin.setMinWidth(100);
        odpracovanychHodin.setCellValueFactory(new PropertyValueFactory<>("oddpracovanychhodin"));

        TableColumn<Zamestnanec,Integer> platovaTrieda = new TableColumn<>("Platova trieda");
        platovaTrieda.setMinWidth(100);
        platovaTrieda.setCellValueFactory(new PropertyValueFactory<>("platovaTrieda"));

        table = new TableView<>();

        table.getColumns().addAll(nameColumn,vek,odpracovanychHodin,platovaTrieda);

        // spodna lišta

        //nameInput
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        //priceInput
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);

        //quantityInput
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        //Button
        addButton = new Button("Add");
        //addButton.setOnAction(e-> addButtonClicked());
        deleteButton = new Button("Delete");
        //deleteButton.setOnAction(e-> deleteButtonClicked());


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);

        spravaMenu.setPadding(new Insets(5, 100, 10, 5));
        spravaMenu.getChildren().addAll(textLabel,table,hBox);
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

    public Button getAddButton() {
        return addButton;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public ZamestnanciModel getZamestnanciModel() {
        return zamestnanciModel;
    }


}
