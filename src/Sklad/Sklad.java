package Sklad;



public class Sklad {
    private int pocetZamestancov;
    private int pocetVozikov;

    public Sklad(int pocetZamestancov, int pocetVozikov) {
        this.pocetZamestancov = pocetZamestancov;
        this.pocetVozikov = pocetVozikov;


    }

    public int getPocetZamestancov() {
        return pocetZamestancov;
    }

    public int getPocetVozikov() {
        return pocetVozikov;
    }
}
