import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args){
        double km,ucret=10;
        Scanner x = new Scanner(System.in);
        System.out.print("Kac km yol gittiniz : ");
        km = x.nextDouble();

        ucret += km*(2.20);

        if (ucret >= 0 && 20 >= ucret){
            System.out.println("Ucret : 20");
        }
        else {
            System.out.println("Ucret : "+ucret);
        }
    
        x.close();
    
    }
}