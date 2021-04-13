package Sklad;

public class Mraznicka extends Sklad {
    private int pocetBoxov;


    public Mraznicka(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu, int pocetBoxov) {
        super(nazovFirmy, numberOfProducts, pocetZamestancov, pocetVozikov, stavBakovehoUctu);
        this.pocetBoxov = pocetBoxov;
    }
}
