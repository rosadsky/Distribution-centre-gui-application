package Controller;

import GUI.HlavneMenuView;
import GUI.HlavneMenuModel;
import GUI.ZamestnanciView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ZamestnanciController {

    private ZamestnanciView zamestnanciView;
    private HlavneMenuModel HlavneMenuModel;

    public ZamestnanciController(ZamestnanciView zamestnanciView, HlavneMenuModel HlavneMenuModel) {

        this.zamestnanciView = zamestnanciView;
        this.HlavneMenuModel = HlavneMenuModel;

        zamestnanciView.getBtnSkladnik().setOnAction(e -> {
            String menoZamestnanca = zamestnanciView.getMeno().getText();
            int vekZamestnanca = Integer.parseInt(zamestnanciView.getVek().getText());

            HlavneMenuModel.pridanieZamestnanca(menoZamestnanca,vekZamestnanca,zamestnanciView.getBoxSkladnik().isSelected(),zamestnanciView.getBoxManager().isSelected(),zamestnanciView.getBoxPekar().isSelected());
            zamestnanciView.getScenaPridanieSkladnik().getWindow().hide();

        } );




    }


}
