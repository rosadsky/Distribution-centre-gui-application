package Produkt;

public class Mliecny extends Produkt {
    private int koniecSpotrebyHodiny;


    public Mliecny(int pocetKusov, String nazovProduktu, int koniecSpotrebyHodiny) {
        super(pocetKusov, nazovProduktu);
        this.koniecSpotrebyHodiny = koniecSpotrebyHodiny;

        System.out.println("Vytvoreny produkt " + nazovProduktu + "...");
    }
}
