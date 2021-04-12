package Sklad;

import Produkt.Potravina;

import java.util.ArrayList;

public class Chladny extends Sklad {
    private double teplota;


    public Chladny(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, double teplota) {
        super(nazovFirmy, numberOfProducts, pocetZamestancov, pocetVozikov);
        this.teplota = teplota;
    }


    ArrayList<Potravina> listProduktovChladnySklad = new ArrayList<Potravina>();


}
