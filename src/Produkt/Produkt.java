package Produkt;

import distribution.centre.Distributor;

public class Produkt extends Distributor {
    private String nazovProduktu;
    private String typProduktu;
    private double teplotaSkladovania;

    public Produkt(String nazovFirmy, int numberOfProducts, String nazovProduktu, String typProduktu, double teplotaSkladovania) {
        super(nazovFirmy, numberOfProducts);
        this.nazovProduktu = nazovProduktu;
        this.typProduktu = typProduktu;
        this.teplotaSkladovania = teplotaSkladovania;
    }
}
