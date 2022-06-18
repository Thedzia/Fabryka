public class LetnieButy implements Buty {
    private String rodzaj;
    private double cena;
    private int rozmiar;

    public LetnieButy(String rodzaj, double cena, int rozmiar) {
        this.rodzaj = "Buty Letnie";
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
