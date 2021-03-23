package Controller;

import GUI.HlavneMenuView;
import GUI.ZamestnanciModel;
import GUI.ZamestnanciView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ZamestnanciController {

    private ZamestnanciView zamestnanciView;
    private ZamestnanciModel zamestnanciModel;

    public ZamestnanciController(ZamestnanciView zamestnanciView, ZamestnanciModel zamestnanciModel) {

        this.zamestnanciView = zamestnanciView;
        this.zamestnanciModel = zamestnanciModel;

        zamestnanciView.getBtnSkladnik().setOnAction(e -> {
            String menoZamestnanca = zamestnanciView.getMeno().getText();
            int vekZamestnanca = Integer.parseInt(zamestnanciView.getVek().getText());

            zamestnanciModel.pridanieZamestnanca(menoZamestnanca,vekZamestnanca,zamestnanciView.getBoxSkladnik().isSelected(),zamestnanciView.getBoxManager().isSelected(),zamestnanciView.getBoxPekar().isSelected());
            zamestnanciView.getScenaPridanieSkladnik().getWindow().hide();

        } );




    }


}
