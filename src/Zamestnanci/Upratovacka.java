package Zamestnanci;
import Sklad.Sklad;
public class Upratovacka extends Zamestnanec {


    public Upratovacka(String meno, int vek, double oddpracovanychhodin, int platovaTrieda) {
        super(meno, vek, oddpracovanychhodin, platovaTrieda);
    }

    @Override
    public double vypocetVyplaty(int vek, double oddpracovanychhodin, int platovaTrieda,Sklad sklad) {
        return 0;
    }
}
