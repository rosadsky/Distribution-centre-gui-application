package Controller;

import GUI.HlavneMenuModel;
import GUI.ManazerskeRozhranieView;

public class ManazerskeRozhranieController {


    public ManazerskeRozhranieController(ManazerskeRozhranieView manazerskeRozhranieView, HlavneMenuModel hlavneMenuModel) {


        manazerskeRozhranieView.getBtnZobrazitStavSkladu().setOnAction(e-> {

            manazerskeRozhranieView.appendText(hlavneMenuModel.StavSkladuHlavneho());



        });


    }
}
