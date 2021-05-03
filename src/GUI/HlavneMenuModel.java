package GUI;

import Produkt.Potravina;
import Sklad.Sklad;
import Zamestnanci.Manazer;
import Zamestnanci.Pekar;
import Zamestnanci.Skladnik;
import Zamestnanci.Zamestnanec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class HlavneMenuModel {
     ArrayList<Potravina> listProduktov = new ArrayList<Potravina>();
     ObservableList<Zamestnanec> listObservableZamestnancov = FXCollections.observableArrayList();
     ObservableList<Zamestnanec> productSelected = null, allProducts = null;
     ArrayList<Sklad> listSkladov = new ArrayList<Sklad>();




    public void vytvorenieSkladu(){
        listSkladov.add(new Sklad(" Centralny sklad", 0,3,30,220000, 10000));

     }

     public HlavneMenuModel(){
         vytvorenieSkladu();
         DefaultDistributor();
         DefaultZamestnanci();
         StavSkladu(listSkladov.get(0));

     }




    private int den = 1;
    private int mesiac = 1;


    //Funkcionalita
    // ArrayList<Zamestnanec> listZamestnancov = new ArrayList<Zamestnanec>();


    public void DefaultZamestnanci(){
        listObservableZamestnancov.add(new Skladnik("Peter Gerat",21,50,1,0));
        listObservableZamestnancov.add(new Manazer("Roman Osadsky",18,220,3,1));
        listObservableZamestnancov.add(new Pekar("Jozef Pidik",43,120,2,1));
    }

    public void stavDni(){
        den++;
        if(den == 31){
            den = 1;
            mesiac++;
        }
        if(mesiac == 13)
            mesiac = 1;

        System.out.println("DEŇ: " + den + "MESIAC: " + mesiac);

        if(den == 3){

            for(Zamestnanec zamTmp : listObservableZamestnancov) {

                zamTmp.setOddpracovanychhodin(0);
                //System.out.println(zamTmp.vypocetVyplaty(zamTmp.getVek(),zamTmp.getOddpracovanychhodin(),zamTmp.getPlatovaTrieda(),hlavneMenuModel.getHlavnySklad()));
                //zamTmp.vypocetVyplaty(zamTmp.getVek(), zamestnanec.getOddpracovanychhodin(), zamestnanec.getPlatovaTrieda(), hlavneMenuModel.getHlavnySklad());

                //hlavnySklad.getStavBakovehoUctu();




                zamTmp.vypocetVyplaty(zamTmp.getVek(), zamTmp.getOddpracovanychhodin(), zamTmp.getPlatovaTrieda(), listSkladov.get(0));



            }

        }






    }



    public void pridanieZamestnanca(String meno, int vek, boolean checkSkladnik, boolean checkManager, boolean checkPekar ){

        if (checkSkladnik)
            listObservableZamestnancov.add(new Skladnik(meno,vek,0,1,0));

        if (checkManager)
            listObservableZamestnancov.add(new Manazer(meno,vek,0,3,0));

        if (checkPekar)
            listObservableZamestnancov.add(new Pekar(meno,vek,0,2,0));

    }

    public ObservableList<Zamestnanec> getListObservableZamestnancov() {
        return listObservableZamestnancov;
    }

    public ObservableList<Zamestnanec> getProductSelected() {
        return productSelected;
    }

    public ObservableList<Zamestnanec> getAllProducts() {
        return allProducts;
    }

    public void setProductSelected(ObservableList<Zamestnanec> productSelected) {
        this.productSelected = productSelected;
    }

    public void setAllProducts(ObservableList<Zamestnanec> allProducts) {
        this.allProducts = allProducts;
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

         //System.out.println("POCET PRODUKTOV V SKLADE: " + pocetProduktovTotal +" / "+ hlavnysklad.getStavBakovehoUctu());
         //System.out.println("VOLNA KAPACITA: " + (hlavnysklad.getKapacita() - pocetProduktovTotal));

     }


    public ArrayList<Potravina> getListProduktov() {
        return listProduktov;
    }

    public void setListProduktov(ArrayList<Potravina> listProduktov) {
        this.listProduktov = listProduktov;
    }


}

