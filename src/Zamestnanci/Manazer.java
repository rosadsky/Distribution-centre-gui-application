package Zamestnanci;

public class Manazer extends Zamestnanec {
    private int pocetBonusovychBodov;

    public Manazer(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, int pocetBonusovychBodov) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetBonusovychBodov = pocetBonusovychBodov;
        System.out.println("Vytvoril som manazera " + meno + "...");
    }



    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda) {
       double vyplata;

        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);
        System.out.println("Vyplata manažéra...");

        return vyplata;
    }
}
