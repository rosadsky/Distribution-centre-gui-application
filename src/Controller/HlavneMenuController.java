package Controller;

import GUI.*;
import javafx.stage.Stage;

public class HlavneMenuController {

    HlavneMenuView hlavneMenuView;
    HlavneMenuModel hlavneMenuModel;
    ZamestnanciView zamestnanciView;
    SpravaZamestnancovView spravaZamestnancovView;

    Stage stage = new Stage();

    public HlavneMenuController(HlavneMenuView hlavneMenuView, HlavneMenuModel hlavneMenuModel, ZamestnanciView zamestnanciView, SpravaZamestnancovView spravaZamestnancovView, Stage window, ZamestnanciModel zamestnanciModel) {

    this.hlavneMenuModel = hlavneMenuModel;
    this.hlavneMenuView = hlavneMenuView;
    this.zamestnanciView = zamestnanciView;
    this.spravaZamestnancovView = spravaZamestnancovView;

        hlavneMenuView.getBtnSimulatorDni().setOnAction(e-> {
            zamestnanciModel.stavDni();

        });


        hlavneMenuView.getBtnPridatZamestnanca().setOnAction(e-> {

             stage.setScene(zamestnanciView.getScenaPridanieSkladnik());
             stage.show();

        });

        hlavneMenuView.getBtnSpravaZamestnanca().setOnAction(e-> {
            stage.setScene(spravaZamestnancovView.getScenaSpravaZamestnacov());
            stage.show();
        });



    }
}
