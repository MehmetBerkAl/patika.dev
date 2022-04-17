import java.util.Scanner;
public class GirilenSayilardanMinVeMaxDegerleriBulma {
    public static void main(String[] args ){
        int n,sayi,max=1,min=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz : ");
        n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Sayi giriniz : ");
            sayi = input.nextInt();
            if(sayi<min){
                min=sayi;
            }
            if(sayi>max){
                max=sayi;
            }
        }        

        System.out.println("En buyuk sayi :"+max);
        System.out.println("En kucuk sayi :"+min);
        input.close();
    }
}