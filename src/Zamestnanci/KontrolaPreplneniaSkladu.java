package Zamestnanci;

import Produkt.Potravina;
import Sklad.Sklad;

import java.util.ArrayList;

public interface KontrolaPreplneniaSkladu {

    /**
     * Defaultna metoda, kde sa kontroluje preplnenie skladu
     * @param listSkladov
     * @param listProduktov
     * @return
     */
    default boolean kontrolaSkladu(ArrayList<Sklad> listSkladov, ArrayList<Potravina> listProduktov )
    {
       // System.out.println("Defaultna metóda vykonaná");

        int totalKapacita= 0;
        for (Potravina potrTmp : listProduktov){
            totalKapacita += potrTmp.getNumberOfProducts();
        }

        if (totalKapacita > listSkladov.get(0).getKapacita()){
            return false;
        }

        return true;
    }

}
