package Sklad;


import Zamestnanci.*;
import distribution.centre.Produkt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;


public class Sklad extends Produkt {
    private int pocetZamestancov;
    private int pocetVozikov;

    public Sklad(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov) {
        super(nazovFirmy, numberOfProducts);
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
    }
}
