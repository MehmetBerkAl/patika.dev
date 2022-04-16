import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        double a,b,c,u,alan;
        Scanner x = new Scanner(System.in); 
        System.out.println("1.kenarin degerini giriniz : ");
        a=x.nextDouble();
        System.out.println("2.kenarin degerini giriniz : ");
        b=x.nextDouble();
        System.out.println("3.kenarin degerini giriniz : ");
        c=x.nextDouble();

        u=(a+b+c)/2;

        alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani : "+alan);
        x.close();
    }
}
