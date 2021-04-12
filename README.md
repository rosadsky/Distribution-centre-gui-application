# Distribution centre projekt


 
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
public abstract class Zamestnanec extends Osoba
	...
	public abstract double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda);	
```
```java
public class Manazer extends Zamestnanec {  
    ....
  ic double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda) {  
       double vyplata;  
  
  vyplata = ((10)*platovaTrieda)*oddpracovanychhodin+(vek*platovaTrieda);  
  System.out.println("Vyplata manažéra...");  
  
 return vyplata;  
  }

```

```java
@Override  
public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda) {  
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
