import java.util.Scanner;

public class KDVtutari {
    public static void main (String[] args){
        double fiyat,kdvTutari=0.0,kdvliTutar=0.0;
        Scanner a = new Scanner (System.in);
        System.out.print("Fiyat : ");
        fiyat = a.nextDouble();
        if (1000 > fiyat && fiyat > 0){
            kdvliTutar = fiyat + fiyat* (0.18);
            kdvTutari = fiyat*(0.18);
        }
        else if (fiyat >1000){
            kdvliTutar = fiyat + fiyat* (0.8);
            kdvTutari = fiyat*(0.8); 
        }
        System.out.println("Fiyat : "+ fiyat);
        System.out.println("Kdvli Tutar : "+ kdvliTutar);
        System.out.println("Kdv Tutari : "+ kdvTutari);
        
        a.close();
    }
}
