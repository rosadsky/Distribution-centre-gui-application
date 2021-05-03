package Zamestnanci;
import Sklad.Sklad;

public class Pekar extends Zamestnanec {
    private double pocetChlebovZaHodinu;

    public Pekar(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double pocetChlebovZaHodinu) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetChlebovZaHodinu = pocetChlebovZaHodinu;
        System.out.println("Vytvoril som pekara " + meno + "...");
    }


    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda,Sklad sklad) {
        double vyplata;

        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);
        System.out.println("VYPLATA - PEKAR :" + vyplata);


        sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);
        System.out.println("STAV BANKOVEHO UCTU SKLADU: " + sklad.getStavBakovehoUctu());
        return vyplata;
    }

    public double getPocetChlebovZaHodinu() {
        return pocetChlebovZaHodinu;
    }

    public void setPocetChlebovZaHodinu(double pocetChlebovZaHodinu) {
        this.pocetChlebovZaHodinu = pocetChlebovZaHodinu;
    }
}
