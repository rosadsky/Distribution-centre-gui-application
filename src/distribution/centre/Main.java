package distribution.centre;

import java.util.ArrayList;

import Sklad.Sklad;
import distribution.centre.*;
import java.util.ArrayList;
import java.util.List;

import Produkt.*;


public class Main {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;
    private Distributor Distributor;
    private Dodavatel Dodavatel;
    private Produkt Produkt;
    
    public static void main(String[] args) {
       ListOfDodavatelia = new ArrayList<Dodavatel>();
       ListProduktov = new ArrayList<Produkt>();

       ListOfDodavatelia.add(new Dodavatel(15,12," Treska Žilina"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska BA"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));


        ListProduktov.add(new Mliecny(12,"Mlieko",12));
        ListProduktov.add(new Mrazeny(12,"Masko Kuracie",true));
        ListProduktov.add(new Trvanlivy(12,"Coca Cola",4));


    }
}
