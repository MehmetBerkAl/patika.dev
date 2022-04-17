import java.util.Scanner;
public class UsluSayiHesaplayanProgram {
    public static void main(String[] args){
        int taban,us,sonuc=1;
        Scanner input = new Scanner (System.in);
        System.out.print("Tabandaki sayiyi giriniz : ");
        taban = input.nextInt();
        System.out.print("Ussunu giriniz : ");
        us = input.nextInt();

        if(us==0){
            System.out.print("Sonuc : 1");
        }
        else if(us>0){
            for(int i=1;i<=us;i++){

                sonuc*=taban;            
            }
            System.out.print("\nSonuc : "+sonuc);            
        }
        else{
            for(int i=-1;i>=us;i--){
                sonuc*=taban;
            }
            System.out.print("\nSonuc : 1/"+sonuc);
        }
        
        input.close();
    }
}