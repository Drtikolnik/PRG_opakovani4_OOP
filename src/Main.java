import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void main() {
        Scanner sc = new Scanner(System.in);


        KrouzekSport SK1 = new KrouzekSport("Sportovní kroužek 1", "Jaroslav Burda", 19, 100, 10, "ano");
        KrouzekSport SK2 = new KrouzekSport("Sportovní kroužek 2", "Jaromír Kastner", 12, 80, 8, "ne");

        KrouzekJazyk JK1 = new KrouzekJazyk("Jazykový kroužek 1", "Kateřina Budínová",  18, 120, 10, "ano", "Čeština");
        KrouzekJazyk JK2 = new KrouzekJazyk("Jazykový kroužek 2", "Nevim Neznam",  18, 120, 10, "ne", "Čeština");

        KrouzekHudba HK1 = new KrouzekHudba("Hudební kroužek 1", "Mozart", 158, 250, 12, "ano", "housle");
        KrouzekHudba HK2 = new KrouzekHudba("Hudební kroužek 2", "Karel Gott", 264, 350, 2, "ne", "hlasivky");

        ArrayList<Krouzek> krouzky = new ArrayList<Krouzek>();
        krouzky.add(SK1);
        krouzky.add(SK2);
        krouzky.add(JK1);
        krouzky.add(JK2);
        krouzky.add(HK1);
        krouzky.add(HK2);

        //VÝPIS KROUŽKŮ
        System.out.println("===VŠECHNY KROUŽKY===");
        for(Krouzek k : krouzky){
            System.out.println(k.toString());
        }


        //VÝPIS ROČNÍCH NÁKLADŮ
        System.out.println("===ROČNÍ NÁKLADY===");
        for(Krouzek k : krouzky){
            System.out.print(k.getNazev() +" : ");
            if(k.getClass().equals(KrouzekSport.class)){
                System.out.println( ((KrouzekSport) k).vypocetRocnichNakladu());
            }else if(k.getClass().equals(KrouzekJazyk.class)){
                System.out.println( ((KrouzekJazyk) k).vypocetRocnichNakladu());
            }else{
                System.out.println( ((KrouzekHudba) k).vypocetRocnichNakladu());
            }
        }


        //VÝPIS ASPOŇ 15 ŽÁKŮ
        System.out.println("===KROUŽKY S ALESPOŇ 15 ŽÁKY===");
        for(Krouzek k : krouzky){
            if(k.getPocetZaku()>=15){
                System.out.println(k.toString());
            }
        }



















    }

}
