import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args){
        String sifre = "deneme";
        String kullaniciGirisi;
        String secim="E";

System.out.println("Sisteme onceden kaydettigim sifre : "+sifre);
        Scanner input = new Scanner (System.in);
        System.out.print("Sifreyi giriniz :");
        kullaniciGirisi=input.nextLine();

        if(kullaniciGirisi.equals("deneme")&& sifre.equals(sifre)){
            System.out.print("Girdiginiz sifre dogru sisteme hosgeldiniz."); 
        }
        else{
            System.out.print("Sifrenizi sifirlamak ister misiniz ?(E/H) : ");
            kullaniciGirisi = input.nextLine();
            if (kullaniciGirisi.equals(secim)){
                System.out.print("Yeni sifrenizi giriniz : ");
                kullaniciGirisi = input.nextLine();
                if(sifre!=kullaniciGirisi){
                    sifre=kullaniciGirisi;
                    System.out.println("Yeni sifre olusturuldu.");
                    System.out.println("Yeni sifreniz : "+sifre);
                }
                else{
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
            else{
                System.out.print("Sifre degistirmek istenmedi.");
            }            
        }

        input.close();

    }
}