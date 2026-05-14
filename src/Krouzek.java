public abstract class Krouzek {

    public String nazev;
    public String jmenoVedouciho;
    public int pocetZaku;
    public int cenaZaZakaNaMesic;
    public int pocetMesicu;
    public String info;

    public Krouzek(String nazev, String jmenoVedouciho, int pocetZaku, int cenaZaZakaNaMesic, int pocetMesicu,  String info) {
        this.nazev = nazev;
        this.jmenoVedouciho = jmenoVedouciho;
        this.pocetZaku = pocetZaku;
        this.cenaZaZakaNaMesic = cenaZaZakaNaMesic;
        this.pocetMesicu = pocetMesicu;
        this.info = info;

    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getJmenoVedouciho() {
        return jmenoVedouciho;
    }

    public void setJmenoVedouciho(String jmenoVedouciho) {
        this.jmenoVedouciho = jmenoVedouciho;
    }

    public int getPocetZaku() {
        return pocetZaku;
    }

    public void setPocetZaku(int pocetZaku) {
        this.pocetZaku = pocetZaku;
    }

    public int getCenaZaZakaNaMesic() {
        return cenaZaZakaNaMesic;
    }

    public void setCenaZaZakaNaMesic(int cenaZaZakaNaMesic) {
        this.cenaZaZakaNaMesic = cenaZaZakaNaMesic;
    }

    public int getPocetMesicu() {
        return pocetMesicu;
    }

    public void setPocetMesicu(int pocetMesicu) {
        this.pocetMesicu = pocetMesicu;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
