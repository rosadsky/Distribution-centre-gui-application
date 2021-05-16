package Zamestnanci;

import Sklad.Sklad;

public class Manazer extends Zamestnanec implements KontrolaPreplneniaSkladu {
    private int pocetBonusovychBodov;


    public Manazer(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, int pocetBonusovychBodov) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
        this.pocetBonusovychBodov = pocetBonusovychBodov;
    }



    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad) {
       double vyplata;


        //System.out.println("(10)*" + platovaTrieda+ "*" + oddpracovanychhodin + "+"+ vek+ "*"+ platovaTrieda );
        vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);
        sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);

        return vyplata;
    }




    public int getPocetBonusovychBodov() {
        return pocetBonusovychBodov;
    }

    public void setPocetBonusovychBodov(int pocetBonusovychBodov) {
        this.pocetBonusovychBodov = pocetBonusovychBodov;
    }
}
