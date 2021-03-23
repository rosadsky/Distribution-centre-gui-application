package Controller;

import GUI.HlavneMenuModel;
import GUI.HlavneMenuView;
import GUI.SpravaZamestnancovView;
import GUI.ZamestnanciView;
import javafx.stage.Stage;

public class HlavneMenuController {

    HlavneMenuView hlavneMenuView;
    HlavneMenuModel hlavneMenuModel;
    ZamestnanciView zamestnanciView;
    SpravaZamestnancovView spravaZamestnancovView;

    Stage stage = new Stage();

    public HlavneMenuController(HlavneMenuView hlavneMenuView, HlavneMenuModel hlavneMenuModel, ZamestnanciView zamestnanciView, SpravaZamestnancovView spravaZamestnancovView, Stage window) {

    this.hlavneMenuModel = hlavneMenuModel;
    this.hlavneMenuView = hlavneMenuView;
    this.zamestnanciView = zamestnanciView;
    this.spravaZamestnancovView = spravaZamestnancovView;


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
