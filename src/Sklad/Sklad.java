package Sklad;


import Produkt.Produkt;
import Zamestnanci.*;
import java.util.ArrayList;




public class Sklad {
    private int pocetZamestancov;
    private int pocetVozikov;

    private static ArrayList<Osoba> ListZamestnancov;




    public Sklad(int pocetZamestancov, int pocetVozikov) {
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
    }




    public int getPocetZamestancov() {
        return pocetZamestancov;
    }

    public int getPocetVozikov() {
        return pocetVozikov;
    }
}
