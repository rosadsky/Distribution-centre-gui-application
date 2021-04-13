package Sklad;

import Produkt.Potravina;

import java.util.ArrayList;

public class Chladny extends Sklad {
    private double teplota;
    ArrayList<Potravina> listProduktovChladnySklad = new ArrayList<Potravina>();

    public Chladny(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu, double teplota, ArrayList<Potravina> listProduktovChladnySklad) {
        super(nazovFirmy, numberOfProducts, pocetZamestancov, pocetVozikov, stavBakovehoUctu);
        this.teplota = teplota;
        this.listProduktovChladnySklad = listProduktovChladnySklad;
    }

    private void filtrovanieProduktov(ArrayList<Potravina> distributor){

    }




}
