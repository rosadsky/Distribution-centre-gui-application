package Controller;

import GUI.HlavneMenuModel;
import GUI.ManazerskeRozhranieView;

public class ManazerskeRozhranieController {


    public ManazerskeRozhranieController(ManazerskeRozhranieView manazerskeRozhranieView, HlavneMenuModel hlavneMenuModel) {


        manazerskeRozhranieView.getBtnZobrazitStavSkladu().setOnAction(e-> {
            String string;

            try{

                string = hlavneMenuModel.StavSkladuHlavneho();
                manazerskeRozhranieView.appendText(string);

            }catch (MyException exception){
                manazerskeRozhranieView.appendText("NEEXISTUJU NIESU ŽIADNY ZAMESTNATNCI");
            }


        });


    }
}
