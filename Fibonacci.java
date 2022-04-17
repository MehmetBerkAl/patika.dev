import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        int n,a=0,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli fibonacci serisi yazmak istiyorsunuz : ");
        n = input.nextInt();
        if(n==1){
            System.out.print("0");
        }
        else if(n==2){
            System.out.print("0 1");
        }
        else if(n>2){
            System.out.print(a+" "+b);
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
            System.out.print("\n");
        }
        else{
            System.out.print("Hatali giris yaptiniz.");
        }
        input.close();
    }
}