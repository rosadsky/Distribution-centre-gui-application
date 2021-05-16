package Zamestnanci;
import Sklad.Sklad;

public abstract class Zamestnanec extends Osoba {
    private double oddpracovanychhodin;
    private int platovaTrieda;

    public Zamestnanec(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {
        super(meno, vek);
        this.oddpracovanychhodin = oddpracovanychhodin;
        this.platovaTrieda = platovaTrieda;
    }

    /* ------ POLYMORFIZMUS ------ */


    /**
     * Vypocet vyplaty, kde sa vyuziva polymorfizmus, kazdy typ zamestnanca ma iny vypocet vyplaty
     * @param vek
     * @param oddpracovanychhodin
     * @param platovaTrieda
     * @param sklad
     * @return
     */
    public abstract double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad);

    public double getOddpracovanychhodin() {
        return oddpracovanychhodin;
    }

    public int getPlatovaTrieda() {
        return platovaTrieda;
    }

    public void setOddpracovanychhodin(double oddpracovanychhodin) {
        this.oddpracovanychhodin = oddpracovanychhodin;
    }

    public void setPlatovaTrieda(int platovaTrieda) {
        this.platovaTrieda = platovaTrieda;
    }
}
