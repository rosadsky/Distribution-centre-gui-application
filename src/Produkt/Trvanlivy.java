package Produkt;

public class Trvanlivy extends Produkt {
    private double vaha;

    public Trvanlivy(int pocetKusov, String nazovProduktu, double vaha) {
        super(pocetKusov, nazovProduktu);
        this.vaha = vaha;
        System.out.println("Vytvoreny produkt " + nazovProduktu + "...");
    }
}
