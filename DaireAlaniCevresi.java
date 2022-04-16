import java.util.Scanner;

public class DaireAlaniCevresi {
    public static void main(String[] args){
        double r,a,pi=3.14,alan;
        Scanner x = new Scanner(System.in);
        System.out.print("Yaricap degerini giriniz : ");
        r = x.nextDouble();
        System.out.print("Merkez aci degerini giriniz : ");
        a = x.nextDouble();
        alan=(pi*(r*r)*a)/360;
        System.out.print("Girilen degerlerle olusturulan dairenin alani : "+alan);
        x.close();
    }

}