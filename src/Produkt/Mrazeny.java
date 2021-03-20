package Produkt;

public class Mrazeny extends Produkt {
    private boolean maso;

    public Mrazeny(int pocetKusov, String nazovProduktu, boolean maso) {
        super(pocetKusov, nazovProduktu);
        this.maso = maso;
        System.out.println("Vytvoreny produkt " + nazovProduktu + "...");
    }
}
