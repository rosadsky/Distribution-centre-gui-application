package Controller;

import GUI.HlavneMenuModel;
import GUI.NovyProduktView;
import GUI.ZamestnanciView;

public class NovyProduktController {

    private NovyProduktView novyProduktView;
    private GUI.HlavneMenuModel HlavneMenuModel;

    public NovyProduktController(NovyProduktView NovyProduktView, HlavneMenuModel hlavneMenuModel) {

        this.novyProduktView = NovyProduktView;
        this.HlavneMenuModel = hlavneMenuModel;

        novyProduktView.getBtnPridatProdukt().setOnAction(e -> {
            String nazovVyrobcu = novyProduktView.getVyrobca().getText();
            String nazovProduktu = novyProduktView.getMeno().getText();

            int pocetProduktov = Integer.parseInt(novyProduktView.getPocetProduktov().getText());

            hlavneMenuModel.pridanieProduktu(nazovVyrobcu,nazovProduktu,pocetProduktov,novyProduktView.getMliecny().isSelected(),novyProduktView.getTrvanlinvy().isSelected(),novyProduktView.getMrazeny().isSelected());
            novyProduktView.getScenaPridanieProduktu().getWindow().hide();

        } );




    }
}
