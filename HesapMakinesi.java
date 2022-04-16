import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        double sayi1,sayi2;
        int islem;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. sayiyi giriniz : ");
        sayi1 = input.nextDouble();
        System.out.print("2. sayiyi giriniz : ");
        sayi2 = input.nextDouble();

        System.out.print("""
        1 - Toplama
        2 - Cikarma
        3 - Carpma
        4 - Bolme        
        Yapmak istediginiz islem numarasini giriniz : """);
        islem= input.nextInt();
        switch(islem){
            case 1:
                System.out.print("Toplama sonucu "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Cikarma sonucu "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.print("Carpma sonucu "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.print("Bolme sonucu "+ (sayi1/sayi2));
                break;
            default:
                System.out.print("Yanlis bir secim yaptiniz !");
                break;
        }
        input.close();
    }
}
