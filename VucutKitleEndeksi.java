import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] arg){
        double kg,metre,indeks;
        Scanner x = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        kg = x.nextDouble();
        System.out.print("Boyunuzu giriniz : ");        
        metre =x.nextDouble();
        indeks=kg/(metre*metre);
        System.out.print("Vucut kitle endeksiniz : "+indeks);
        x.close();

    }
}