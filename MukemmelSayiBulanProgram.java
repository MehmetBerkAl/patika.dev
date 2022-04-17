import java.util.*;
public class MukemmelSayiBulanProgram {
    public static void main(String[] args){
        int n,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        n = input.nextInt();

        for(int i=1;i<n;i++){
            if(n%i==0){
                toplam+=i;
            }
        }

        if(toplam==n){
            System.out.print(n+" sayisi mukemmel sayidir.");
        }
        else{
            System.out.print(n+" sayisi mukemmel sayi degildir.");
        }
        input.close();
    }
}