package Sklad;

public class Teply extends Sklad {
    private double expressLine;
    public Teply(int pocetZamestancov, int pocetVozikov, double expressLine) {
        super(pocetZamestancov, pocetVozikov);
        this.expressLine = expressLine;
        System.out.println("Vytvoril som teplý sklad...");
    }
}
