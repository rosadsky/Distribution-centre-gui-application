package Zamestnanci;
import Sklad.Sklad;

public class Pekar extends Zamestnanec {
    private double pocetChlebovZaHodinu;

    public Pekar(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double pocetChlebovZaHodinu) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetChlebovZaHodinu = pocetChlebovZaHodinu;
    }


    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda,Sklad sklad) {
        double vyplata;

        vyplata = ((2)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);


        sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);
        return vyplata;
    }

    public double getPocetChlebovZaHodinu() {
        return pocetChlebovZaHodinu;
    }

    public void setPocetChlebovZaHodinu(double pocetChlebovZaHodinu) {
        this.pocetChlebovZaHodinu = pocetChlebovZaHodinu;
    }
}
