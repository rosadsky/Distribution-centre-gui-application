package GUI;


import Zamestnanci.Manazer;
import Zamestnanci.Pekar;
import Zamestnanci.Skladnik;
import Zamestnanci.Zamestnanec;

import Sklad.Sklad;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ZamestnanciModel {

    Sklad sklad;
    //Funkcionalita
   // ArrayList<Zamestnanec> listZamestnancov = new ArrayList<Zamestnanec>();

    ObservableList<Zamestnanec> listObservableZamestnancov = FXCollections.observableArrayList();


    public void DefaultZamestnanci(){
        listObservableZamestnancov.add(new Skladnik("Peter Gerat",12,1,1,0));
        listObservableZamestnancov.add(new Manazer("Roman Osadsky",12,2,3,1));
        listObservableZamestnancov.add(new Pekar("Jozef Pidik",12,1,2,1));
    }



    public ZamestnanciModel() {
        DefaultZamestnanci();
    }


    public void pridanieZamestnanca(String meno, int vek, boolean checkSkladnik, boolean checkManager, boolean checkPekar ){

        if (checkSkladnik)
            listObservableZamestnancov.add(new Skladnik(meno,vek,0,1,0));

        if (checkManager)
            listObservableZamestnancov.add(new Manazer(meno,vek,0,3,0));

        if (checkPekar)
            listObservableZamestnancov.add(new Pekar(meno,vek,0,2,0));

    }

    public ObservableList<Zamestnanec> getListObservableZamestnancov() {
        return listObservableZamestnancov;
    }


}
