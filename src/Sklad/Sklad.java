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
    private int kapacita;

    public Sklad(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu, int kapacita) {
        super(nazovFirmy, numberOfProducts);
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
        this.stavBakovehoUctu = stavBakovehoUctu;
        this.kapacita = kapacita;
    }

    public int getPocetZamestancov() {
        return pocetZamestancov;
    }

    public void setPocetZamestancov(int pocetZamestancov) {
        this.pocetZamestancov = pocetZamestancov;
    }

    public int getPocetVozikov() {
        return pocetVozikov;
    }

    public void setPocetVozikov(int pocetVozikov) {
        this.pocetVozikov = pocetVozikov;
    }

    public int getStavBakovehoUctu() {
        return stavBakovehoUctu;
    }

    public void setStavBakovehoUctu(int stavBakovehoUctu) {
        this.stavBakovehoUctu = stavBakovehoUctu;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }
}
