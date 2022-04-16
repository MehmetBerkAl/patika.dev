import java.util.Scanner; // kullanicidan deger alabilmek icin bu kutuphaneyi ekklememiz gerekiyor.

public class Baslangic{ // Buradaki Baslangic yazisi dosya adi ile ayni adda olmalidir.
    public static void main(String[] args) {        
            System.out.print("Merhaba Dunya !\n"); // println yazdigimizda cumle sonunda alt satira gecis yapar.
            int a;
            Scanner input = new Scanner(System.in); // alacagimiz degeri hangi ifadeye  atamak istiyorsak onu burada tamnımlıyoruz. (input)
            a=input.nextInt(); // a yı integer cinsinden tanımladigimiz icin burada input.nextInt() yazdik
            System.out.print("A sayisini giriniz : ");            
            System.out.println(a);
            input.close();
// eger ondalikli deger girersek araya virgul koymaliyiz nokta koyarsak hata verecektir.
        }

    }