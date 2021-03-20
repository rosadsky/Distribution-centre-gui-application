package Produkt;

public class Pecivo extends Produkt {
    private int pocetPekarov;

    public Pecivo(int pocetKusov, String nazovProduktu, int pocetPekarov) {
        super(pocetKusov, nazovProduktu);
        this.pocetPekarov = pocetPekarov;
    }
}
