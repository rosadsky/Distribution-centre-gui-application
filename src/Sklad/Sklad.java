package Sklad;


import Zamestnanci.*;
import distribution.centre.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;


public class Sklad {
    private int pocetZamestancov;
    private int pocetVozikov;

    private static ArrayList<Osoba> ListZamestnancov;




    public Sklad(int pocetZamestancov, int pocetVozikov) {
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;
    }



    public void definovanieZamestnancov(){
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



    public ObservableList<Product> getProduct1() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("LapTop", 859, 20));
        products.add(new Product("Bouncy Ball", 2.49, 198));
        products.add(new Product("Toilet", 99, 74));
        products.add(new Product("The Notebook DVD", 19.99, 12));
        products.add(new Product("Corn", 1.49, 256));
        return products;
    }


    public int getPocetZamestancov() {
        return pocetZamestancov;
    }

    public int getPocetVozikov() {
        return pocetVozikov;
    }
}
