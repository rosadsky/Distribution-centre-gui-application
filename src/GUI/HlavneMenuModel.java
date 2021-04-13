package GUI;

import Produkt.Potravina;
import Sklad.Sklad;
import distribution.centre.Produkt;
import distribution.centre.Dodavatel;

import java.util.ArrayList;

public class HlavneMenuModel {


     ArrayList<Produkt> listDistributorov = new ArrayList<Produkt>();
     ArrayList<Dodavatel> listDodavatelov = new ArrayList<Dodavatel>();
     ArrayList<Potravina> listProduktov = new ArrayList<Potravina>();

     Sklad hlavnysklad;

     public Sklad vytvorenieSkladu(){
         Sklad hlavnysklad = new Sklad(" Hlavny sklad", 0,3,30,220000, 10000);

         return hlavnysklad;
     }


     public HlavneMenuModel(){
         Sklad sklad = vytvorenieSkladu();
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

     }


}

