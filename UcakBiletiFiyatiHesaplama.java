// !!! 24 yas ile 65 yas arasinda nasil bir indirim olacagina dair herhangi bir bilgi verilmemişti bende kendım herhangı bır sey yapmadim bu yuzden o yas araliginda hata veriyo

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args){
        float km,toplamFiyat,indirimFiyati;
        int yas,tip;
        Scanner input = new Scanner(System.in);

        System.out.println("Yasinizi giriniz : ");
        yas = input.nextInt();
        System.out.println("KM cinsinden mesafeyi giriniz : ");
        km = input.nextFloat();
        
        if(km>0 && yas>0){
            System.out.println("""
                1 - Tek gidis
                2 - Gidis donus 
            Yolculuk tipinizi giriniz : """);
            tip = input.nextInt();
            switch(tip){
                case (1):
                    toplamFiyat = (float) (km*0.10); 
                    System.out.println("Indirimden onceki bilet fiyati : "+toplamFiyat);
                    if(yas>0 && 12>yas){
                        indirimFiyati=(float)(toplamFiyat*0.5);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }
                    else if(yas>=12 && 24>yas){
                        indirimFiyati=(float)(toplamFiyat*0.1);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }
                    else if(yas>65){
                        indirimFiyati=(float)(toplamFiyat*0.3);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }
                    break;
                case (2):                    
                    toplamFiyat = (float) (2*km*0.10);
                    toplamFiyat = (float) (km*0.10);
                    toplamFiyat = (float) (toplamFiyat*0.8); 
                    System.out.println("Indirimden onceki bilet fiyati : "+toplamFiyat);                    
                    if(yas>0 && 12>yas){
                        indirimFiyati=(float)(toplamFiyat*0.5);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }
                    else if(yas>=12 && 24>yas){
                        indirimFiyati=(float)(toplamFiyat*0.1);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }
                    else if(yas>65){
                        indirimFiyati=(float)(toplamFiyat*0.3);
                        toplamFiyat=toplamFiyat-indirimFiyati;
                        System.out.println("Indirim tutari : "+indirimFiyati);
                        System.out.println("Toplam odenecek ucret : "+toplamFiyat);
                    }                   
                    break;
                default :
                    System.out.println("Hatali tuslama yaptiniz !");
                    break;
            }
        }
        else{
            System.out.println("Girilen degerleri kontrol ediniz.");
        }

        input.close();
    }
}