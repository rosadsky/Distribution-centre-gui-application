package Zamestnanci;

public class Zamestnanec extends Osoba {
    private double oddpracovanychhodin;
    private int platovaTrieda;

    public Zamestnanec(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {
        super(meno, vek);
        this.oddpracovanychhodin = oddpracovanychhodin;
        this.platovaTrieda = platovaTrieda;
    }

    /* ------ POLYMORFIZMUS ------ */

    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda){
        double vyplata;

        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);

        return vyplata;
    }

}
