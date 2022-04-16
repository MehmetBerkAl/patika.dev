import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,muzik,dersSayisi=0;
        double ortalama=0.0;
        Scanner input = new Scanner (System.in);
        System.out.println("Matematik notunu giriniz : ");
        mat=input.nextInt();
        System.out.println("Fizik notunu giriniz : ");
        fizik=input.nextInt();
        System.out.println("Turkce notunu giriniz : ");
        turkce=input.nextInt();
        System.out.println("Kimya notunu giriniz : ");
        kimya=input.nextInt();
        System.out.println("Muzik notunu giriniz : ");
        muzik=input.nextInt();
        switch(1){
            case(1):
                if(0<mat && mat<100){
                    ortalama+=mat;
                    dersSayisi+=1;}
            case(2):
                if(0<fizik && fizik<100){
                    ortalama+=fizik;
                    dersSayisi+=1;}
            case(3):
                if(0<turkce && turkce<100){
                    ortalama+=turkce;
                    dersSayisi+=1;}
            case(4):
                if(0<kimya && kimya<100){
                    ortalama+=kimya;
                    dersSayisi+=1;}
            case(5):
                if(0<muzik && muzik<100){
                    ortalama+=muzik;
                    dersSayisi+=1;}            
        }
       
        System.out.println("\nPuanlarinizin Toplami : "+ortalama);
        System.out.println("\nDers sayisi : "+dersSayisi);
        ortalama=(ortalama/dersSayisi);
        System.out.println("Ortalamaniz : "+ortalama);
        if(ortalama>55){
            System.out.println("Gecerli ortalamaya sahipsiniz.");;
        }
        else{
            System.out.println("Gecerli ortalamaya sahip degilsiniz.");
        }

        input.close();

    }
}
