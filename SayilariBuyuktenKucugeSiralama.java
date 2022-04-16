import java.util.Scanner;
public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a,b,c;
        System.out.println("1.sayiyi giriniz : ");
        a=input.nextFloat();
        System.out.println("2.sayiyi giriniz : ");
        b=input.nextFloat();
        System.out.println("3.sayiyi giriniz : ");
        c=input.nextFloat();

        if(a<b && a<c){
            if(b<c){
                System.out.println("a < b < c");
            }
            else{
                System.out.println("a < c < b");
            }
        }
        else if(b<c && b<a){
            if(a<c){
                System.out.println("b < a < c");
            }
            else{
                System.out.println("b < c < a");
            }
        }
        else if(c<a && c<b){
            if(a<b){
                System.out.println("c < a < b");
            }
            else{
                System.out.println("c < b < a");
            }
        }

        input.close();
    }
}
