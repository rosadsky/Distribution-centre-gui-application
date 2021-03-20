package distribution.centre;

import java.util.ArrayList;

public class Dodavatel {

    private int numberOfProducts;
    private int hodinaOdchodu;
    private String menoDodavatela;

    public Dodavatel(int numberOfProducts, int hodinaOdchodu, String menoDodavatela) {
        this.numberOfProducts = numberOfProducts;
        this.hodinaOdchodu = hodinaOdchodu;
        this.menoDodavatela = menoDodavatela;

        System.out.println("Vytvoril som dodavatela" + this.menoDodavatela+"...");
    }
}
