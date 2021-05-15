package Produkt;

import java.io.Serializable;

public class Produkt implements Serializable {
    String nazovFirmy;
    int numberOfProducts;

    public Produkt(String nazovFirmy, int numberOfProducts) {
        this.nazovFirmy = nazovFirmy;
        this.numberOfProducts = numberOfProducts;
    }

    public String getNazovFirmy() {
        return nazovFirmy;
    }

    public void setNazovFirmy(String nazovFirmy) {
        this.nazovFirmy = nazovFirmy;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
