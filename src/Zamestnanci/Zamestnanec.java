package Zamestnanci;

public abstract class Zamestnanec extends Osoba {
    private double oddpracovanychhodin;
    private int platovaTrieda;

    public Zamestnanec(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {
        super(meno, vek);
        this.oddpracovanychhodin = oddpracovanychhodin;
        this.platovaTrieda = platovaTrieda;
    }

    /* ------ POLYMORFIZMUS ------ */

    public abstract double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda);

    public double getOddpracovanychhodin() {
        return oddpracovanychhodin;
    }

    public int getPlatovaTrieda() {
        return platovaTrieda;
    }
}
