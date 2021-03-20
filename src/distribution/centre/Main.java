package distribution.centre;

import java.util.ArrayList;
import distribution.centre.*;
import java.util.ArrayList;
import Produkt.Produkt;


public class Main {


    private static ArrayList<distribution.centre.Dodavatel> ListOfDodavatelia;
    private static ArrayList<Produkt> ListProduktov;
    private Distributor Distributor;
    private Dodavatel Dodavatel;
    
    public static void main(String[] args) {
       ListOfDodavatelia = new ArrayList<Dodavatel>();
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska Žilina"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska BA"));
       ListOfDodavatelia.add(new Dodavatel(15,12," Treska ZA"));

    }
}
