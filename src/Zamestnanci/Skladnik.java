package Zamestnanci;
import Sklad.Sklad;
public class Skladnik extends Zamestnanec {
    private double produktovZaHodinu;

    public Skladnik(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double rychlostPrace) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.produktovZaHodinu = rychlostPrace;

    }

    /* ------ POLYMORFIZMUS ------ */

    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad) {
        double vyplata;


        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);


        sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);


        return  vyplata;
    }


    public double getproduktovZaHodinu() {
        return produktovZaHodinu;
    }

    public void setproduktovZaHodinu(double produktovZaHodinu) {
        this.produktovZaHodinu = produktovZaHodinu;
    }
}

