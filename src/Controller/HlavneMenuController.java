package Controller;

import GUI.*;
import javafx.stage.Stage;

public class HlavneMenuController {

    HlavneMenuView hlavneMenuView;
    HlavneMenuModel hlavneMenuModel;
    ZamestnanciView zamestnanciView;
    SpravaZamestnancovView spravaZamestnancovView;

    Stage stage = new Stage();

    public HlavneMenuController(HlavneMenuView hlavneMenuView, HlavneMenuModel hlavneMenuModel, ZamestnanciView zamestnanciView, SpravaZamestnancovView spravaZamestnancovView,NovyProduktView novyProduktView,ManazerskeRozhranieView manazerskeRozhranieView, Stage window) {

    this.hlavneMenuModel = hlavneMenuModel;
    this.hlavneMenuView = hlavneMenuView;
    this.zamestnanciView = zamestnanciView;
    this.spravaZamestnancovView = spravaZamestnancovView;

        hlavneMenuView.getBtnSimulatorDni().setOnAction(e-> {
            hlavneMenuModel.stavDni(hlavneMenuView);
        });


        hlavneMenuView.getBtnPridatZamestnanca().setOnAction(e-> {

             stage.setScene(zamestnanciView.getScenaPridanieSkladnik());
             stage.show();

        });

        hlavneMenuView.getBtnPridatProdukt().setOnAction(e-> {
            stage.setScene(novyProduktView.getScenaPridanieProduktu());
            stage.show();

        });

        hlavneMenuView.getBtnSpravaZamestnanca().setOnAction(e-> {
            stage.setScene(spravaZamestnancovView.getScenaSpravaZamestnacov());
            stage.show();
        });

        hlavneMenuView.getBtnManazer().setOnAction(e->{
            stage.setScene(manazerskeRozhranieView.getManazerskeRozhranie());
            stage.show();
        });

        hlavneMenuView.getBtnKoniec().setOnAction(e-> {
            hlavneMenuModel.koniecProgramu();
        });




    }
}
