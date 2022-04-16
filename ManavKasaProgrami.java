import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] arg){
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double fiyat=0,kilo;
        Scanner x = new Scanner(System.in);
        System.out.print("Kac kilo armut alacaksiniz : ");
        kilo = x.nextDouble();
        fiyat+=kilo*armut;
        System.out.print("Kac kilo elma alacaksiniz : ");
        kilo = x.nextDouble();
        fiyat+=kilo*elma;
        System.out.print("Kac kilo domates alacaksiniz : ");
        kilo = x.nextDouble();
        fiyat+=kilo*domates;
        System.out.print("Kac kilo muz alacaksiniz : ");
        kilo = x.nextDouble();
        fiyat+=kilo*muz;
        System.out.print("Kac kilo patlican alacaksiniz : ");
        kilo = x.nextDouble();
        fiyat+=kilo*patlican;
        System.out.print("Aldiginiz urunlerin toplam fiyati : "+fiyat);
        x.close();
    }
}
