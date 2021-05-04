
# Distribution centre project 🛒


 
### 1. Hierarchia dedenia
 Použitá pri classach zamestnatncov.
```java
public class Osoba {  
    private String meno;  
 private int vek;  
  
 public Osoba(String meno, int vek) {  
        this.meno = meno;  
 this.vek = vek;  
  }
```

```java
public abstract class Zamestnanec extends Osoba {  
    private double oddpracovanychhodin;  
 private int platovaTrieda;  
  
 public Zamestnanec(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {  
        super(meno, vek);  
 this.oddpracovanychhodin = oddpracovanychhodin;  
 this.platovaTrieda = platovaTrieda;  
  }
```

```java
public class Skladnik extends Zamestnanec {  
    private double rychlostPrace;  
  
 public Skladnik(String meno, int vek, double oddpracovanychhodin, int platovaTrieda, double rychlostPrace) {  
        super(meno, vek, oddpracovanychhodin, platovaTrieda);  
 this.rychlostPrace = rychlostPrace;
```

	
### 2. Polymorfizmus
Polymorfizmus je prekonávanie metódy v dedených triedach.
Najviac ju využívam tu (zatiaľ).

```java
public abstract double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad);
```
```java
public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda, Sklad sklad) {  
   double vyplata;  
    
  vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);  
  System.out.println("VYPLATA - MANAZER :" + vyplata);  
    
  sklad.setStavBakovehoUctu(sklad.getStavBakovehoUctu() - vyplata);  
  System.out.println("STAV " + sklad.getStavBakovehoUctu());  
  
 return vyplata;  
}

```

```java
@Override  
public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda,Sklad sklad) {  
    return 0;  
}
```




###  3. Agregácia


```java
import Zamestnanci.Skladnik;  
import Zamestnanci.Zamestnanec;    
  
public class ZamestnanciModel {  
    Zamestnanec zamestnanec;  
	Sklad sklad;
```
### 4. Ukážte oddelenie aplikačnej logiky od používateľského rozhrania
V mojom riešení je použitý návrhový vzor MVC. Oddelil som rozhranie od GUI a aplikačnej logiky.

```java
HlavneMenuView hlavneMenuView = new HlavneMenuView();  
HlavneMenuModel hlavneMenuModel = new HlavneMenuModel();  
HlavneMenuController hlavneMenuController = new HlavneMenuController(hlavneMenuView,hlavneMenuModel,zamestnanciView,spravaZamestnancovView,window);
```

# Finálne odovzdanie: 

### Explicitné použitie RTTI

```java
if (zamTmp instanceof Skladnik) {  
  
    randomNum = rand.nextInt((100 - 50) + 1) + 50;  
  
 if (randomNum > ((Skladnik) zamTmp).getproduktovZaHodinu()) {  
        ((Skladnik) zamTmp).setproduktovZaHodinu(randomNum);  
  System.out.println("zvýšenie rýchlosti práce na " + randomNum);  
  } else {  
        System.out.println("RYCHLOST PRACE: " + randomNum);  
  }  
  
    pickPotravina(randomNum,randomHodina);  
}
```
### Použitie lambda výrazov alebo referencií na metódy (method references)

```java
listProduktov.forEach( (n) -> { System.out.println(n.getNazovProduktu() + " QTY: " + n.getNumberOfProducts()); } );
```
```java
listObservableZamestnancov.forEach( (n) -> {  
  
    System.out.println("************************");  
  System.out.println("Odpracovane hodiny" + n.getOddpracovanychhodin());  
  n.vypocetVyplaty(n.getVek(),n.getOddpracovanychhodin(),n.getPlatovaTrieda(), listSkladov.get(0));  
  
} );
```

### Použitie implicitnej implementácie metód v rozhraniach (default method implementation)

```java
public interface KontrolaPreplneniaSkladu {  
  
    default boolean kontrolaSkladu(ArrayList<Sklad> listSkladov, ArrayList<Potravina> listProduktov )  
    {  
        System.out.println("Defaultna metóda vykonaná");  
  
 int totalKapacita= 0;  
 for (Potravina potrTmp : listProduktov){  
            totalKapacita += potrTmp.getNumberOfProducts();  
  }  
  
        if (totalKapacita > listSkladov.get(0).getKapacita()){  
            return false;  
  }  
  
        return true;  
  }  
  
}
```

### Použitie serializácie

**Serializácia**

```java
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
```
**Deserializácia**

```java
public void Deserializacia(){  
  
    try{  
  
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Sklad s=(Sklad)in.readObject();  
  
  
  System.out.println("--------------------- PREDOŠLÝ SKLAD ------------------------------");  
  System.out.println("NAZOV SKLADU: " + s.getNazovFirmy() + " STAV UCTU: " + s.getStavBakovehoUctu() + " ZAMESTNANCI: " + s.getPocetZamestancov() );  
  System.out.println("-------------------------------------------------------------------");  
  
  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
}
```

### Zapuzdrenie

```java
public class Sklad extends Produkt implements Serializable  {  
	 private int pocetZamestancov;  
	 private int pocetVozikov;  
	 private double stavBakovehoUctu;  
	 private int kapacita;
 }
```
