package Zamestnanci;

import Sklad.Sklad;

public class Manazer extends Zamestnanec {
    private int pocetBonusovychBodov;


    public Manazer(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, int pocetBonusovychBodov) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetBonusovychBodov = pocetBonusovychBodov;
        System.out.println("Vytvoril som manazera " + meno + "...");
    }



    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad) {
       double vyplata;


        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);
        //sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);

        //System.out.println("STAV" + sklad.getStavBakovehoUctu());

        System.out.println("Vyplata manažéra...");

        return vyplata;
    }
}
