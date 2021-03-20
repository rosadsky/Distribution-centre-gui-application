package Sklad;

public class Mraznicka extends Sklad {
    private int pocetBoxov;

    public Mraznicka(int pocetZamestancov, int pocetVozikov, int pocetBoxov) {
        super(pocetZamestancov, pocetVozikov);
        this.pocetBoxov = pocetBoxov;
        System.out.println("Vytvoril som Mrazničku sklad...");
    }
}
