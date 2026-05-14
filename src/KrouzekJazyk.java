public class KrouzekJazyk extends Krouzek {
    private String jazyk;


    public KrouzekJazyk(String nazev, String jmenoVedouciho, int pocetZaku, int cenaZaZakaNaMesic, int pocetMesicu, String info, String jazyk) {
        super(nazev, jmenoVedouciho, pocetZaku, cenaZaZakaNaMesic, pocetMesicu, info);
        this.jazyk = jazyk;
    }

    public String toString() {
        return "Jazykový kroužek: \nNázev: " +nazev+ "\nVedoucí: " +jmenoVedouciho+ "\nPočet žáků: " +pocetZaku+ "\nCena žáka na měsíc: " +cenaZaZakaNaMesic+ "\nPočet měsíců " +pocetMesicu+ "\nJazyk " +jazyk+ "\nRodinný mluvčí: " +info+ "\n";
    }

    public double vypocetRocnichNakladu(){
        int cenaNavic = 0;
        if(info.equals("ano")){cenaNavic = 8000;}
        return (pocetZaku*cenaZaZakaNaMesic*pocetMesicu)+cenaNavic  ;
    }

















}
