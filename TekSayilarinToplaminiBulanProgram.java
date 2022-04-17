// cift ve 4 ün kati yazınca ben kısacası 4 ün katı olan degerleri soruyorsunuz diye anlıyorum umarım yanlış anlamıyorumdur.

import java.util.Scanner;
public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args){
        int toplam=0,sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();
        while(sayi%2==0){
            if(sayi%4==0){
                toplam+=sayi;
                System.out.print(sayi+" sayisi 12'ye tam bolunur.\n");
            }
            System.out.print("Sayi giriniz : ");
            sayi = input.nextInt();
        }
        System.out.print("Toplam : "+toplam);
        input.close();
    }
}
