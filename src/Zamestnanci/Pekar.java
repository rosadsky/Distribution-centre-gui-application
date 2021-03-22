package Zamestnanci;

public class Pekar extends Zamestnanec {
    private double pocetChlebovZaHodinu;

    public Pekar(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double pocetChlebovZaHodinu) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetChlebovZaHodinu = pocetChlebovZaHodinu;
        System.out.println("Vytvoril som pekara " + meno + "...");
    }
}
