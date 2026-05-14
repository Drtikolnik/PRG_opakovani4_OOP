public class KrouzekSport extends Krouzek {
    private double racniNaklady;


    public KrouzekSport(String nazev, String jmenoVedouciho, int pocetZaku, int cenaZaZakaNaMesic, int pocetMesicu, String info) {
        super(nazev, jmenoVedouciho, pocetZaku, cenaZaZakaNaMesic, pocetMesicu, info);
    }



    public String toString() {
        return "Sportovní kroužek: \nNázev: " +nazev+ "\nVedoucí: " +jmenoVedouciho+ "\nPočet žáků: " +pocetZaku+ "\nCena žáka na měsíc: " +cenaZaZakaNaMesic+ "\nPočet měsíců " +pocetMesicu+ "\nPronájem tělocvičny: " +info+ "\n";
    }

    public double vypocetRocnichNakladu(){
        int cenaNavic = 0;
        if(info.equals("ano")){cenaNavic = 12000;}
        return (pocetZaku*cenaZaZakaNaMesic*pocetMesicu)+cenaNavic  ;
    }



















}
