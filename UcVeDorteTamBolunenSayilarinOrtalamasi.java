import java.util.Scanner;

public class UcVeDorteTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args){
        int sayi,toplam=0,sayac=0;
        Scanner input = new Scanner (System.in);
        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();

        System.out.println("Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayılar : ");
        for(int i=1;i<=sayi;i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }

        System.out.println("Girilen sayiya kadar 3 ve 4'e (12'ye) tam bolunen sayılar ve bunlarin ortalamasi : ");
// burada 3 ve 4 yazınca ben kısaca 12'ye bolunen sayılar anladım
        for(int i=1;i<=sayi;i++){
            if(i%12==0){
                System.out.print(" "+i);
                toplam+=i;
                sayac++;
            }
        }
        System.out.print("Ortalamasi : "+toplam/sayac);
        input.close();
    }
}
