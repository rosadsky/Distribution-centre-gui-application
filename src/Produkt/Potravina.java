package Produkt;

import distribution.centre.Produkt;

public class Potravina extends Produkt {
    private String nazovProduktu;
    private String typProduktu;
    private double teplotaSkladovania;

    public Potravina(String nazovFirmy, int numberOfProducts, String nazovProduktu, String typProduktu, double teplotaSkladovania) {
        super(nazovFirmy, numberOfProducts);
        this.nazovProduktu = nazovProduktu;
        this.typProduktu = typProduktu;
        this.teplotaSkladovania = teplotaSkladovania;
    }

    public String getNazovProduktu() {
        return nazovProduktu;
    }

    public void setNazovProduktu(String nazovProduktu) {
        this.nazovProduktu = nazovProduktu;
    }

    public String getTypProduktu() {
        return typProduktu;
    }

    public void setTypProduktu(String typProduktu) {
        this.typProduktu = typProduktu;
    }

    public double getTeplotaSkladovania() {
        return teplotaSkladovania;
    }

    public void setTeplotaSkladovania(double teplotaSkladovania) {
        this.teplotaSkladovania = teplotaSkladovania;
    }
}
