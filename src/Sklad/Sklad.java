package Sklad;


import Produkt.Produkt;

import java.io.Serializable;


public class Sklad extends Produkt implements Serializable  {
    private int pocetZamestancov;
    private int pocetVozikov;
    private double stavBakovehoUctu;
    private int kapacita;

    public Sklad(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu, int kapacita) {
        super(nazovFirmy, numberOfProducts);
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
        this.stavBakovehoUctu = stavBakovehoUctu;
        this.kapacita = kapacita;

        System.out.println("Nazov: " +  nazovFirmy +" Pocet produktov: " + numberOfProducts +" Zamestnanci: " + pocetZamestancov +" Vozíky: " + pocetVozikov +" KAPITAL: " + stavBakovehoUctu +" Kapacita: " + kapacita);
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

    public double getStavBakovehoUctu() {
        return stavBakovehoUctu;
    }

    public void setStavBakovehoUctu(double stavBakovehoUctu) {
        this.stavBakovehoUctu = stavBakovehoUctu;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }


}
