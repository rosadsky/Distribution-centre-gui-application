package distribution.centre;

import java.util.ArrayList;

import Sklad.Sklad;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import Produkt.*;
import Sklad.*;


public class Main {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;
    private Chladny chladnySklad;
    private Mraznicka mraznickaSklad;


    
    public static void main(String[] args) {
       ListOfDodavatelia = new ArrayList<Dodavatel>();
       ListProduktov = new ArrayList<Produkt>();


      Teply teplySklad = new Teply(12,12,true);
      Chladny chladnySklad = new Chladny(13,12,10);
      Mraznicka mraznickaSklad = new Mraznicka(14,12,22);



      System.out.println("Teply sklad: " + teplySklad.getPocetZamestancov());
      System.out.println("Chladny sklad: " + chladnySklad.getPocetZamestancov());
      System.out.println("Mrazak sklad: " + mraznickaSklad.getPocetZamestancov());

       ListOfDodavatelia.add(new Dodavatel(15,12," Treska Žilina"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska BA"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));


        ListProduktov.add(new Mliecny(12,"Mlieko",12));
        ListProduktov.add(new Mrazeny(12,"Masko Kuracie",true));
        ListProduktov.add(new Trvanlivy(12,"Coca Cola",4));


    }
}
