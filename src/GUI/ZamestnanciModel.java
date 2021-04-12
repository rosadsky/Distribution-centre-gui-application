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

    Zamestnanec zamestnanec;
    Sklad sklad;
    //Funkcionalita
   // ArrayList<Zamestnanec> listZamestnancov = new ArrayList<Zamestnanec>();

    ObservableList<Zamestnanec> listObservableZamestnancov = FXCollections.observableArrayList();
    ObservableList<Zamestnanec> productSelected = null, allProducts = null;

    public void DefaultZamestnanci(){
        listObservableZamestnancov.add(new Skladnik("Peter Gerat",21,50,1,0));
        listObservableZamestnancov.add(new Manazer("Roman Osadsky",18,220,3,1));
        listObservableZamestnancov.add(new Pekar("Jozef Pidik",43,120,2,1));
    }

    public ZamestnanciModel() {
        DefaultZamestnanci();

        for(Zamestnanec zamTmp : listObservableZamestnancov) {

            System.out.println(zamTmp.vypocetVyplaty(zamTmp.getVek(),zamTmp.getOddpracovanychhodin(),zamTmp.getPlatovaTrieda()));

        }
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

    public ObservableList<Zamestnanec> getProductSelected() {
        return productSelected;
    }

    public ObservableList<Zamestnanec> getAllProducts() {
        return allProducts;
    }

    public void setProductSelected(ObservableList<Zamestnanec> productSelected) {
        this.productSelected = productSelected;
    }

    public void setAllProducts(ObservableList<Zamestnanec> allProducts) {
        this.allProducts = allProducts;
    }
}
