package Zamestnanci;

public class Skladnik extends Zamestnanec {
    private double rychlostPrace;

    public Skladnik(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double rychlostPrace) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.rychlostPrace = rychlostPrace;
    }
}

