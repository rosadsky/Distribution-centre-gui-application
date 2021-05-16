package Controller;

import GUI.HlavneMenuModel;
import GUI.ZamestnaneckeRozhranieView;

public class ZamestaneckeRozhranieController {
    public ZamestaneckeRozhranieController(ZamestnaneckeRozhranieView zamestnaneckeRozhranieView, HlavneMenuModel hlavneMenuModel) {


        zamestnaneckeRozhranieView.getBtnZobrazitPraceSkladik().setOnAction(e-> {
            zamestnaneckeRozhranieView.appendText(hlavneMenuModel.vypisZamestnancov(true,false,false));
        });

        zamestnaneckeRozhranieView.getBtnZobrazitPraceManazer().setOnAction(e-> {
            zamestnaneckeRozhranieView.appendText(hlavneMenuModel.vypisZamestnancov(false,true,false));
        });
        zamestnaneckeRozhranieView.getBtnZobrazitPracePekar().setOnAction(e-> {
            zamestnaneckeRozhranieView.appendText(hlavneMenuModel.vypisZamestnancov(false,false,true));
        });


    }
}
