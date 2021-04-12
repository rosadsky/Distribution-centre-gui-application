package Zamestnanci;

public class Skladnik extends Zamestnanec {
    private double rychlostPrace;

    public Skladnik(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double rychlostPrace) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.rychlostPrace = rychlostPrace;

        System.out.println("Vytvoril som skladnika " + meno + "...");
    }

    /* ------ POLYMORFIZMUS ------ */

    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda) {
        double vyplata;


        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);

        System.out.println("Vyplata skladnika...");

        return  vyplata;
    }
}

