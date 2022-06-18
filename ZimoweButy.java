public class ZimoweButy implements Buty {
    private String rodzaj;
    private double cena;
    private int rozmiar;

    public ZimoweButy(String rodzaj, double cena, int rozmiar) {
        this.rodzaj = "Buty Zimowe";
        this.cena = cena;
        this.rozmiar = rozmiar;

    }

    public String getRodzaj() {
        return rodzaj;
    }

    public double getCena() {
        return cena;
    }

    public int getRozmiar() {
        return rozmiar;
    }

}
