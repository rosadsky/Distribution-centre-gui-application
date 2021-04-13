package Sklad;


import Zamestnanci.*;
import distribution.centre.Produkt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;


public class Sklad extends Produkt {
    private int pocetZamestancov;
    private int pocetVozikov;
    private int stavBakovehoUctu;

    public Sklad(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu) {
        super(nazovFirmy, numberOfProducts);
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
        this.stavBakovehoUctu = stavBakovehoUctu;

        System.out.println("SKLAD s počtom zamestancov " + pocetZamestancov + " dostupne voziky "+ pocetVozikov + "stav bankoveho uctu " + stavBakovehoUctu);

    }
}
