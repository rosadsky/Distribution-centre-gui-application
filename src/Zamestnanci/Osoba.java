package Zamestnanci;

public class Osoba {
    private String meno;
    private int vek;

    public Osoba(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public int getVek() {
        return vek;
    }
}
