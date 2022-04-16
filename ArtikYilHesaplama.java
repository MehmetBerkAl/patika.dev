import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args){
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yil giriniz : ");
        yil = input.nextInt();

        if(yil%4==0){
            if(yil%400==0){
                System.out.println(yil+" artik yildir.");
            }
            else{
                System.out.println(yil+" artik yil degildir.");   
            }
        }
        else if(yil%4!=0){
            
                System.out.println(yil+" artik yil degildir.");
            }
            input.close();
        }        
}