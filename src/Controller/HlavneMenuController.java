package Controller;

import GUI.HlavneMenuModel;
import GUI.HlavneMenuView;
import GUI.ZamestnanciView;
import javafx.stage.Stage;

public class HlavneMenuController {

    HlavneMenuView hlavneMenuView;
    HlavneMenuModel hlavneMenuModel;
    ZamestnanciView zamestnanciView;

    Stage stage = new Stage();

    public HlavneMenuController(HlavneMenuView hlavneMenuView, HlavneMenuModel hlavneMenuModel, ZamestnanciView zamestnanciView, Stage window) {

    this.hlavneMenuModel = hlavneMenuModel;
    this.hlavneMenuView = hlavneMenuView;
    this.zamestnanciView = zamestnanciView;


        hlavneMenuView.getBtnPridatZamestnanca().setOnAction(e-> {

             stage.setScene(zamestnanciView.getScenaPridanieSkladnik());
             stage.show();

        });



    }
}
