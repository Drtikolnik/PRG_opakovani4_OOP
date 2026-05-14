public class KrouzekHudba extends Krouzek{
String hudebniNastroj;

    public KrouzekHudba(String nazev, String jmenoVedouciho, int pocetZaku, int cenaZaZakaNaMesic, int pocetMesicu, String info, String hudebniNastroj) {
        super(nazev, jmenoVedouciho, pocetZaku, cenaZaZakaNaMesic, pocetMesicu, info);
        this.hudebniNastroj = hudebniNastroj;
    }

    public String toString() {
        return "Hudební kroužek: \nNázev: " +nazev+ "\nVedoucí: " +jmenoVedouciho+ "\nPočet žáků: " +pocetZaku+ "\nCena žáka na měsíc: " +cenaZaZakaNaMesic+ "\nPočet měsíců " +pocetMesicu+ "\nHudební nástroj: " +hudebniNastroj+ "\nŠkola půjčuje nástroje: " +info+ "\n";
    }

    public double vypocetRocnichNakladu(){
        int cenaNavic = 0;
        if(info.equals("ano")){cenaNavic = 15000;}
        return (pocetZaku*cenaZaZakaNaMesic*pocetMesicu)+cenaNavic  ;
    }



















}



