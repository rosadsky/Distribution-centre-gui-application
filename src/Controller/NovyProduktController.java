package Controller;

import GUI.HlavneMenuModel;
import GUI.ZamestnanciView;

public class NovyProduktController {

    private ZamestnanciView zamestnanciView;
    private GUI.HlavneMenuModel HlavneMenuModel;

    public NovyProduktController(ZamestnanciView zamestnanciView, HlavneMenuModel HlavneMenuModel) {

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
