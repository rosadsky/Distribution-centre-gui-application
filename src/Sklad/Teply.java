package Sklad;

public class Teply extends Sklad {
    private boolean expressLine;

    public Teply(String nazovFirmy, int numberOfProducts, int pocetZamestancov, int pocetVozikov, int stavBakovehoUctu, int kapacita, boolean expressLine) {
        super(nazovFirmy, numberOfProducts, pocetZamestancov, pocetVozikov, stavBakovehoUctu, kapacita);
        this.expressLine = expressLine;
    }

    public boolean isExpressLine() {
        return expressLine;
    }


}

