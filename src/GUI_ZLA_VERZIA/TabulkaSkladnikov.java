package GUI_ZLA_VERZIA;

import Sklad.Sklad;
import Zamestnanci.Osoba;
import Zamestnanci.Osoba;
import Zamestnanci.Zamestnanec;
import distribution.centre.Main;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class TabulkaSkladnikov {



    public static Scene showTabulkaSkladnikov(Stage window) {
        // HPRIDANIE PRODUKTU MLIEČNY {


        TableView<Osoba> tableOsobaov;
        Scene scenaPridanieProduktu;



        Button btnSkladnici = new Button("Skladnici ");
        Button btnManazeri = new Button("Manazeri ");
        Button btnPekari = new Button("Pekari");


        Button exit = new Button("VRATIT SA SPAT");

        exit.setOnAction(e -> {
            window.setScene(Main.scene1);
        });


        HBox pridanieProduktu = new HBox(5);


        TableColumn<Osoba,String> nazovStlpca = new TableColumn<>("meno");
        nazovStlpca.setMinWidth(200);
        nazovStlpca.setCellValueFactory(new PropertyValueFactory<>("meno"));

        tableOsobaov = new TableView<>();
       // tableOsobaov.setItems(Sklad);
        tableOsobaov.getColumns().addAll(nazovStlpca);


        pridanieProduktu.setPadding(new Insets(5, 5, 10, 5));





        pridanieProduktu.getChildren().addAll(exit);
        scenaPridanieProduktu = new Scene(pridanieProduktu, 600, 300);

        return scenaPridanieProduktu;
    }







}
