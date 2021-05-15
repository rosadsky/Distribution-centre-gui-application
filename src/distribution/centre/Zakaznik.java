package distribution.centre;

import Produkt.Potravina;

import java.util.ArrayList;

public class Zakaznik {
    private String nazovZakaznika;
    private int numberOfProducts;
    private int denOchodu;
    private ArrayList<Potravina> listPotravin;

    public Zakaznik(String nazovZakaznika, int numberOfProducts, int denOchodu, ArrayList<Potravina> listPotravin) {
        this.nazovZakaznika = nazovZakaznika;
        this.numberOfProducts = numberOfProducts;
        this.denOchodu = denOchodu;
        this.listPotravin = listPotravin;
    }


    public String getNazovZakaznika() {
        return nazovZakaznika;
    }

    public void setNazovZakaznika(String nazovZakaznika) {
        this.nazovZakaznika = nazovZakaznika;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getDenOchodu() {
        return denOchodu;
    }

    public void setDenOchodu(int denOchodu) {
        this.denOchodu = denOchodu;
    }

    public ArrayList<Potravina> getListPotravin() {
        return listPotravin;
    }

    public void setListPotravin(ArrayList<Potravina> listPotravin) {
        this.listPotravin = listPotravin;
    }
}
