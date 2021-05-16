package GUI;

import Controller.MyException;
import Produkt.Potravina;
import Sklad.Sklad;
import Zamestnanci.*;
import distribution.centre.MyThread;
import distribution.centre.Zakaznik;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;


/**
 * Hlavne menu je trieda kde sa vykonava funkcionalita programu
 */
public class HlavneMenuModel {
    private ArrayList<Potravina> listProduktov = new ArrayList<Potravina>();
    private ObservableList<Zamestnanec> listObservableZamestnancov = FXCollections.observableArrayList();
    private ObservableList<Zamestnanec> productSelected = null, allProducts = null;
    private ArrayList<Sklad> listSkladov = new ArrayList<Sklad>();
    private  ArrayList<Zakaznik> listZakaznikov = new ArrayList<Zakaznik>();
    private int den = 1;
    private int mesiac = 1;
    private int pocetPotravin = 0;
    private int pocetZakaznikov = 2;


    public HlavneMenuModel(){
        Deserializacia();
        vytvorenieSkladu();
        vytvorenieZakaznikov();
        DefaultDistributor();
        DefaultZamestnanci();
        MyThread thread1 = new MyThread();
        thread1.run();

    }

    /**
     * Vytvorenie skladu
     */
    public void vytvorenieSkladu(){

        if (listSkladov == null)
            listSkladov.add(new Sklad(" Centralny sklad", 0,3,30,220000, 20000));
    }

    /**
     * Vytvorenie zakaznikov, ktorym dodavame produkty
     */
    public void vytvorenieZakaznikov(){

        ArrayList<Potravina> listPotravinZakaznik = new ArrayList<Potravina>();

        listPotravinZakaznik.add(new Potravina("Mliekaren s.r.o",200,"Syr Niva","mliecne",4));
        listPotravinZakaznik.add(new Potravina("Mliekaren s.r.o",900,"Mlieko polotucne","mliecne",4));
        listPotravinZakaznik.add(new Potravina("Food holding s.r.o",300,"Horalka","trvanlivy",16));
        listPotravinZakaznik.add(new Potravina("Food holding s.r.o",500,"Budis","trvanlivy",16));
        Zakaznik tesco = new Zakaznik("Tesco", 4, 19,listPotravinZakaznik);
        listZakaznikov.add(tesco);

        ArrayList<Potravina> listPotravinZakaznik_1 = new ArrayList<Potravina>();

        listPotravinZakaznik_1.add(new Potravina("Food holding s.r.o",534,"Budis","trvanlivy",16));
        listPotravinZakaznik_1.add(new Potravina("Masozavod namestovo s.r.o",923,"Bravcove maso","mrazeny",16));
        listPotravinZakaznik_1.add(new Potravina("Masozavod namestovo s.r.o",244,"Parky","mrazeny",16));

        Zakaznik lidl = new Zakaznik("Lidl", 3,20,listPotravinZakaznik_1);
        listZakaznikov.add(lidl);

    }

    /**
     * Konstruktor kde zavolame vsetky prvotne funkcie na vytvorenie potrebnych objektov
     */



    /**
     *  Zakladny zamestnanci
     */
    public void DefaultZamestnanci(){
        listObservableZamestnancov.add(new Skladnik("Peter Gerat",21,50,1,0));
        listObservableZamestnancov.add(new Manazer("Roman Osadsky",18,220,3,1));
        listObservableZamestnancov.add(new Pekar("Jozef Pidik",43,120,2,1));
    }

    /**
     * Fungovanie programu, pomocou tlacitka +1 den, sklad vdaka tomu pracuje po dnoch
     * @param hlavneMenuView - parameter vypisovanie udajov co sa prave deje so skladom
     */

    public void stavDni(HlavneMenuView hlavneMenuView) {
        den++;
        if (den == 31) {
            den = 1;
            mesiac++;
        }
        if (mesiac == 13)
            mesiac = 1;

        //System.out.println("DEŇ: " + den + "MESIAC: " + mesiac + "\n");

        hlavneMenuView.appendText("--------------------DEŇ: " + den + " MESIAC " + mesiac + "--------------------\n");

        if (den == 3) {
            vypocitavanieVyplatZamestnancov(hlavneMenuView);



            hlavneMenuView.appendText( "BANKOVY ÚČET SKLADU [ "+ listSkladov.get(0).getStavBakovehoUctu() + "€] \n");
        }

        if(den == 21) {
            novaObjednavkaZakaznika();
        }

        if (den == 19 || den == 20){
            int index;
            if (den == 19)
                index = 0;
            else
                index= 1;

            for(Potravina potrTmp : listZakaznikov.get(index).getListPotravin()){

                if (potrTmp.getNumberOfProducts() > 0){
                    //System.out.println("NESPLNENÉ OBJEDNÁVKY PENALIZÁCIA 3000 €");
                    hlavneMenuView.appendText("Vsetky objednavky splnené zarobené 1000 €\n");
                    listSkladov.get(0).setStavBakovehoUctu(listSkladov.get(0).getStavBakovehoUctu() - 3000);
                } else {
                    //System.out.println("Vsetky objednavky splnené zarobené 1000 € ");

                    hlavneMenuView.appendText("Vsetky objednavky splnené zarobené 1000 €\n");
                    listSkladov.get(0).setStavBakovehoUctu(listSkladov.get(0).getStavBakovehoUctu() - 1000);
                }

            }

        }

        // Vykonavanie prace zamestnacov

        vykonavaniePraceZamestnanca(hlavneMenuView);
    }


    /**
     * Vygenerovanie objednavky zakaznika ked splnime tie co boli zadane
     */
    public void novaObjednavkaZakaznika(){

     for (int i = 0; i < 2;i++) {
         for (Potravina potrTmp : listZakaznikov.get(0).getListPotravin()) {
             int randomNum;
             Random rand = new Random();
             int randomObjednavka = rand.nextInt((1000 - 300) +300);
             potrTmp.setNumberOfProducts(randomObjednavka);
             //System.out.println("POTRAVINA: " + potrTmp.getNazovProduktu() +"QTY: " +potrTmp.getNumberOfProducts());
         }
     }
    }

    /**
     * Vypocitavanie vyplat zamestnocov
     * @param hlavneMenuView - pre vypis v GUI
     */

    public void vypocitavanieVyplatZamestnancov(HlavneMenuView hlavneMenuView){

        //System.out.println("----------------- VYPOCET VYPLAT -----------------");

        listObservableZamestnancov.forEach( (n) -> {

            //System.out.println("************************");
            hlavneMenuView.appendText("************************\n");
           // System.out.println("Odpracovane hodiny" + n.getOddpracovanychhodin());
            hlavneMenuView.appendText(n.getMeno() +" odpracoval: " + n.getOddpracovanychhodin() + "\n");
            hlavneMenuView.appendText("VYPLATA : " + n.vypocetVyplaty(n.getVek(),n.getOddpracovanychhodin(),n.getPlatovaTrieda(), listSkladov.get(0))+ "€\n");



        } );



    }

    /**
     * Nahodne generovanie prace zamestnanca
     * @param hlavneMenuView - pre vypis v GUI
     */

    public void vykonavaniePraceZamestnanca(HlavneMenuView hlavneMenuView) {

        for (Zamestnanec zamTmp : listObservableZamestnancov) {
            Random rand = new Random();
            int randomNum;
            int randomHodina = rand.nextInt((12 - 1) + 1) + 1;

            zamTmp.setOddpracovanychhodin(zamTmp.getOddpracovanychhodin() + randomHodina);

            //System.out.println(zamTmp.getMeno() + " dnes odpracoval: " + randomHodina + " TOTAL: (" + zamTmp.getOddpracovanychhodin() + ")");
            //hlavneMenuView.appendText(zamTmp.getMeno() + " dnes odpracoval: " + randomHodina + " TOTAL: (" + zamTmp.getOddpracovanychhodin() + ")\n");
            /* ---------  explicitné použitie RTTI – napr. na zistenie typu objektu --------*/

            if (zamTmp instanceof Skladnik) {

                randomNum = rand.nextInt((100 - 50) + 1) + 50;

                if (randomNum > ((Skladnik) zamTmp).getproduktovZaHodinu()) {
                    ((Skladnik) zamTmp).setproduktovZaHodinu(randomNum);
                   // System.out.println("zvýšenie rýchlosti práce na " + randomNum);
                } else {
                   // System.out.println("RYCHLOST PRACE: " + randomNum);
                }

                pickPotravina(randomNum,randomHodina,hlavneMenuView);
            }

            if (zamTmp instanceof Pekar) {
                randomNum = rand.nextInt((100 - 30) + 1) + 30;

                if (randomNum > ((Pekar) zamTmp).getPocetChlebovZaHodinu()) {
                    ((Pekar) zamTmp).setPocetChlebovZaHodinu(randomNum);
                    //System.out.println("zvýšenie rýchlosti pečenia na " + randomNum);
                } else {
                    //System.out.println("RYCHLOST PEČENIA: " + randomNum);
                }

            }

            if (zamTmp instanceof Manazer){


                if(pracaManazera()){
                    ((Manazer) zamTmp).setPocetBonusovychBodov(((Manazer) zamTmp).getPocetBonusovychBodov()+1);

                    if(((Manazer) zamTmp).kontrolaSkladu(listSkladov,listProduktov)){
                        ((Manazer) zamTmp).setPocetBonusovychBodov(((Manazer) zamTmp).getPocetBonusovychBodov()+1);
                    }
                    //System.out.println("VYKONAL OBJEDNAVKU ! ");
                } else {
                    //System.out.println("NIČ NEVYKONAL");
                }
            }



        }
    }


    /**
     * Nahodne generovanie vyberu potravin so skladu, zo skladu aj ubudaju potraviny pripocitavaju sa k zakaznikovi
      * @param rychlost - rychlost prace zamestnanca
     * @param pocetHodin - pocet hodin kolko zamestannec pracuje
     * @param hlavneMenuView . pre vypis v GUI
     */
    public void pickPotravina(int rychlost, int pocetHodin,HlavneMenuView hlavneMenuView){
        Random rand = new Random();

        for (int i = 0; i < pocetHodin; i++){

            int randomNum = rand.nextInt((pocetPotravin-1 - 1) + 1);

            if (pocetPotravin > randomNum){

                int randomZakaznik = rand.nextInt((10 - 1) + 1);
                int index = 0;

                if (randomZakaznik<5) {
                    index = 0;
                }else {
                    index = 1;
                }

                int randomPotravina = rand.nextInt((listZakaznikov.get(index).getNumberOfProducts()-1 - 1) + 1);

                int odobratieProduktov = listZakaznikov.get(index).getListPotravin().get(randomPotravina).getNumberOfProducts() - rychlost;

                if (odobratieProduktov<0) {
                    odobratieProduktov = 0;
                }

                listZakaznikov.get(index).getListPotravin().get(randomPotravina).setNumberOfProducts(odobratieProduktov);

                for (Potravina produktTmp : listProduktov){
                    if(produktTmp.getNazovProduktu().equals(listZakaznikov.get(index).getListPotravin().get(randomPotravina).getNazovProduktu())){

                        int odobratieZoSkladu = produktTmp.getNumberOfProducts()-odobratieProduktov;
                        if(odobratieZoSkladu < 0)
                            produktTmp.setNumberOfProducts(0);
                        else
                            produktTmp.setNumberOfProducts(odobratieZoSkladu);
                    }

                }

               hlavneMenuView.appendText("VYBAVENA OBJ. " + listZakaznikov.get(index).getListPotravin().get(randomPotravina).getNazovProduktu()+
                       " EŠTE CHÝBA: " + listZakaznikov.get(index).getListPotravin().get(randomPotravina).getNumberOfProducts()+"\n");


            }

        }


    }

    /**
     *  Nahodne generovanie prace zamestnanca, manazer kontroluje ci na sklade je dostatok potravin ak nie objedna
     * @return - vrati true ak manazer objednal produkty
     */

    public boolean pracaManazera(){

        Random rand = new Random();

        for (Potravina potrTmp : listProduktov){

           // System.out.print("["+potrTmp.getNumberOfProducts()+"]");
            if (potrTmp.getNumberOfProducts() <= 0){
                int pocetNaObjednanie = rand.nextInt((3000-1000) + 1000);
                //System.out.println("Nedostatok " + potrTmp.getNazovProduktu() + " objednavam [" + pocetNaObjednanie+ "]");
                potrTmp.setNumberOfProducts(pocetNaObjednanie);
                listSkladov.get(0).setStavBakovehoUctu(listSkladov.get(0).getStavBakovehoUctu() - pocetNaObjednanie );
                return true;
            }

        }

        return false;
    }

    /**
     * Vypis zamestnancov pre GUI, pomocou skladanie stringu
     * @param SkladnikBool -  ak je skladnik zak sa sklada string s skladnikov
     * @param ManazerBool - ak manazer tak sa sklada string s manazerov
     * @param PekarBool - ak je pekar tak sa sklada string s pekarov
     * @return - string ktory sklada program
     */
    public String vypisZamestnancov(boolean SkladnikBool,boolean ManazerBool, boolean PekarBool){
        String mainString = "";

        for (Zamestnanec zamTmp : listObservableZamestnancov){

            if (zamTmp instanceof Skladnik && SkladnikBool){
                mainString = mainString + zamTmp.getMeno() +" HODINY: "+ zamTmp.getOddpracovanychhodin() + " PRODUKTY ZA HODINU: "+ ((Skladnik) zamTmp).getproduktovZaHodinu() + "\n";
            }

            if (zamTmp instanceof Manazer && ManazerBool){
                mainString = mainString + zamTmp.getMeno() + " HODINY: " + zamTmp.getOddpracovanychhodin() + "BONUSOVE BODY: " + ((Manazer) zamTmp).getPocetBonusovychBodov() + "\n";
            }

            if (zamTmp instanceof Pekar && PekarBool){
                mainString = mainString + zamTmp.getMeno() + " HODINY: " + zamTmp.getOddpracovanychhodin() + "CHLEBY ZA HODINU: " + ((Pekar) zamTmp).getPocetChlebovZaHodinu() + "\n";

            }


        }

        return mainString;
    }


    /**
     * Pridanie zamastneca z GUI,
     * @param meno
     * @param vek
     * @param checkSkladnik - aby program vedel ci vytvorit skladnika
     * @param checkManager - aby program vedel ci vytvorit manazera
     * @param checkPekar - aby program vedel ci vytvorit pekara
     */
    public void pridanieZamestnanca(String meno, int vek, boolean checkSkladnik, boolean checkManager, boolean checkPekar ){

        if (checkSkladnik)
            listObservableZamestnancov.add(new Skladnik(meno,vek,0,1,0));

        if (checkManager)
            listObservableZamestnancov.add(new Manazer(meno,vek,0,3,0));

        if (checkPekar)
            listObservableZamestnancov.add(new Pekar(meno,vek,0,2,0));
    }

    /**
     * Pridanie produktu z GUI
     * @param vyrobca
     * @param nazov
     * @param pocet
     * @param mliecny
     * @param trvanlivy
     * @param mrazeny
     */
    public void pridanieProduktu(String vyrobca,String nazov, int pocet, boolean mliecny, boolean trvanlivy, boolean mrazeny){

        if (mliecny)
            listProduktov.add(new Potravina(vyrobca,pocet,nazov,"mliecny", 17));
        if (trvanlivy)
            listProduktov.add(new Potravina(vyrobca,pocet,nazov,"trvanlivy", 6));
        if (mrazeny)
            listProduktov.add(new Potravina(vyrobca,pocet,nazov,"mrazeny", 0));

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

    /**
     * Ukoncenie programu serializaciou
     */
    public void koniecProgramu(){

        try{

            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);


            out.writeObject(listSkladov.get(0));
            out.flush();

            out.close();
            System.out.println("Serialization succes");
        }catch(Exception e){
            System.out.println(e);
        }

        System.exit(0);
    }

    /**
     * Deserializacia pri spustení programu
     */
    public void Deserializacia(){

        try{

            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Sklad s = (Sklad)in.readObject();

            listSkladov.add(s);

          //  System.out.println("--------------------- PREDOŠLÝ SKLAD ------------------------------");
          //  System.out.println("NAZOV SKLADU: " + s.getNazovFirmy() + " STAV UCTU: " + s.getStavBakovehoUctu() + " ZAMESTNANCI: " + s.getPocetZamestancov() );
          //  System.out.println("-------------------------------------------------------------------");


            in.close();
        }catch(Exception e){System.out.println(e);}
    }

    /**
     * Vytvorenie defaultneho distributora
     */
    private void DefaultDistributor(){
         listProduktov.add(new Potravina("Mliekaren s.r.o",1520,"Mlieko plnotucne","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",6000,"Jogurt","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",1100,"Syr Niva","mliecne",4));
         listProduktov.add(new Potravina("Mliekaren s.r.o",345,"Mlieko polotucne","mliecne",4));

         listProduktov.add(new Potravina("Food holding s.r.o",1100,"Horalka","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",1320,"Mila","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",800,"Kofola","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",420,"Budis","trvanlivy",16));
         listProduktov.add(new Potravina("Food holding s.r.o",1491,"Krušovice","trvanlivy",16));

         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",491,"Kuracie prsia","mrazeny",16));
         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",900,"Bravcove maso","mrazeny",16));
         listProduktov.add(new Potravina("Masozavod namestovo s.r.o",1100,"Parky","mrazeny",16));

         pocetPotravin = 13;
        // System.out.println("Pocet druhov potravín v sklade: [" + pocetPotravin + "] ");
     }


     public void najomneSkladu(int i){

      //  listSkladov.get(0).setStavBakovehoUctu(listSkladov.get(0).getStavBakovehoUctu() - i);
        //System.out.println(listSkladov.get(0).getStavBakovehoUctu());
         System.out.println("HELLO");
     }

    /**
     * Spajanie stringu pre stav skladu s vlastnou výnimkou ak niesu produkty vytvorené tak vyhodí error
      * @return - vracia spojeny string vsetkych informacii o sklade
     */
    public String StavSkladuHlavneho() throws MyException {
        String mainString = null;

        if(listProduktov == null){
            throw new MyException("ERROR ZIADNE PRODUKTY NIESU VYTVORENE");
        }

         for(Potravina potrTmp : listProduktov){
             mainString = mainString + " PRODUKT: "+  potrTmp.getNazovProduktu() +" QTY: " + potrTmp.getNumberOfProducts()+ " VYROBCA" + potrTmp.getNazovFirmy()+"\n";
         }

         return mainString;
     }

    public ArrayList<Potravina> getListProduktov() {
        return listProduktov;
    }

    public void setListProduktov(ArrayList<Potravina> listProduktov) {
        this.listProduktov = listProduktov;
    }

    public ArrayList<Sklad> getListSkladov() {
        return listSkladov;
    }
}

