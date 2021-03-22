package Sklad;


import Produkt.Produkt;
import Zamestnanci.*;
import distribution.centre.Dodavatel;

import java.util.ArrayList;
import java.util.List;


public class Sklad {
    private int pocetZamestancov;
    private int pocetVozikov;

    private static ArrayList<Osoba> ListZamestnancov;




    public Sklad(int pocetZamestancov, int pocetVozikov) {
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
    }


    public static void definovanieZamestnancov(){
        ListZamestnancov = new ArrayList<Osoba>();
    }

    public static void vytvorenieSkladnika(String meno, int vek){
        ListZamestnancov.add(new Skladnik(meno,vek,0,1,0));
    }

    public static void vytvoreniaManagera(String meno, int vek){
        ListZamestnancov.add(new Manazer(meno,vek,0,3,0));
    }

    public static void vytvoreniePekara(String meno, int vek){
        ListZamestnancov.add(new Pekar(meno,vek,0,2,0));
    }



    public int getPocetZamestancov() {
        return pocetZamestancov;
    }

    public int getPocetVozikov() {
        return pocetVozikov;
    }
}
