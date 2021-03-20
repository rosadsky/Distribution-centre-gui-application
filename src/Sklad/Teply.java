package Sklad;

public class Teply extends Sklad {
    private boolean expressLine;

    public Teply(int pocetZamestancov, int pocetVozikov, boolean expressLine) {
        super(pocetZamestancov, pocetVozikov);
        this.expressLine = expressLine;
    }

    public boolean isExpressLine() {
        return expressLine;
    }


}

