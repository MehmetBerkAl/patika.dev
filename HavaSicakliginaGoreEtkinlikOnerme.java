import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args){
        int sicaklik;        
        System.out.println("Sicaklik degerini giriniz : ");
        Scanner input = new Scanner(System.in);
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if(5<=sicaklik && sicaklik<15){
            System.out.println("Sinemaya yapabilirsin.");
        }
        else if(15<=sicaklik && sicaklik<25){
            System.out.println("Piknik yapabilirsin.");
        }
        else{
            System.out.println("Yuzmeye gidebilirsin.");
        }

        input.close();
    }
}
