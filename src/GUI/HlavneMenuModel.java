package GUI;

import Produkt.Potravina;
import Sklad.Sklad;
import Sklad.Chladny;
import Sklad.Mraznicka;
import Sklad.Teply;
import distribution.centre.Produkt;
import distribution.centre.Dodavatel;

import java.util.ArrayList;

public class HlavneMenuModel {

     ArrayList<Potravina> listProduktov = new ArrayList<Potravina>();

     public Sklad vytvorenieSkladu(){
         Sklad hlavnysklad = new Sklad(" Hlavny sklad", 0,3,30,220000, 10000);
         return hlavnysklad;
     }

     public Chladny vytvorenieChladnehoSkladu(){
         Chladny chladnysklad = new Chladny("Chladny sklad",0,1,2,1000,200,0);
         return chladnysklad;
     }
    public Mraznicka vytvorenieMraznicky(){
        Mraznicka mraznicka = new Mraznicka("Mraznicka",0,1,2,2000,200,4);
        return mraznicka;
    }

    public Teply vytvorenieTeplehoSkladu(){
        Teply mraznicka = new Teply("Mraznicka",0,1,2,2000,200,false);
        return mraznicka;
    }





     public HlavneMenuModel(){
         Sklad sklad = vytvorenieSkladu();
         Chladny chladnySklad = vytvorenieChladnehoSkladu();
         Mraznicka mraznicka = vytvorenieMraznicky();


         DefaultDistributor();
         StavSkladu(sklad);

     }

     private void DefaultDistributor(){
         listProduktov.add(new Potravina("Mliekaren s.r.o",152,"Mlieko plnotucne","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",600,"Jogurt","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",110,"Syr Niva","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",345,"Mlieko polotucne","mliecne",4));

         listProduktov.add(new Potravina("Food holding s.r.o",1100,"Horalka","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",1320,"Mila","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",800,"Kofola","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",420,"Budis","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",491,"Krušovice","trvanlivy",16));

         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",491,"Kuracie prsia","mrazeny",16));
         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",200,"Bravcove maso","mrazeny",16));
         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",200,"Parky","mrazeny",16));
     }

     private void StavSkladu(Sklad hlavnysklad){
         int pocetProduktovTotal = 0;
         for(Potravina produkt : listProduktov) {
             System.out.println(produkt.getNazovProduktu() + " QTY: " + produkt.getNumberOfProducts());
             pocetProduktovTotal += produkt.getNumberOfProducts();

         }

         System.out.println("POCET PRODUKTOV V SKLADE: " + pocetProduktovTotal +" / "+ hlavnysklad.getKapacita());
         System.out.println("VOLNA KAPACITA: " + (hlavnysklad.getKapacita() - pocetProduktovTotal));

     }


}

