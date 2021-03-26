package GUI;


import Zamestnanci.Manazer;
import Zamestnanci.Pekar;
import Zamestnanci.Skladnik;
import Zamestnanci.Zamestnanec;

import Sklad.Sklad;

import java.util.ArrayList;

public class ZamestnanciModel {

    Sklad sklad;
    //Funkcionalita
    ArrayList<Zamestnanec> listZamestnancov = new ArrayList<Zamestnanec>();

    public ZamestnanciModel() {
        inicializaciaZamestnancov();
    }

    public ArrayList<Zamestnanec> inicializaciaZamestnancov(){

        sklad.VytvorenieArrayaProduktov();

        listZamestnancov.add(new Skladnik("Peter Gerat",12,0,1,0));
        listZamestnancov.add(new Manazer("Roman Osadsky",12,2,3,1));
        listZamestnancov.add(new Pekar("Jozef Pidik",12,0,2,1));
        return (listZamestnancov);

    }



    public void pridanieZamestnanca(String meno, int vek, boolean checkSkladnik, boolean checkManager, boolean checkPekar ){

        if (checkSkladnik)
            listZamestnancov.add(new Skladnik(meno,vek,0,1,0));

        if (checkManager)
            listZamestnancov.add(new Manazer(meno,vek,0,3,0));

        if (checkPekar)
            listZamestnancov.add(new Pekar(meno,vek,0,2,0));

    }
}
