package Sklad;

public class Chladny extends Sklad {
    private double teplota;

    public Chladny(int pocetZamestancov, int pocetVozikov, double teplota) {
        super(pocetZamestancov, pocetVozikov);
        this.teplota = teplota;
        System.out.println("Vytvoril som Chladny sklad...");
    }
}
