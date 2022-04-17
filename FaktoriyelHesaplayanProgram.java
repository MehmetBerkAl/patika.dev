import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args){
        int n,r,f1=1,f2=1,f3=1;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("r : ");
        r = input.nextInt();
        for(int i=1;i<=n;i++){
            if(n==0){
                f1=1;
            }
            else{
                f1*=i;
            }            
        }
        for(int i=1;i<=r;i++){
            if(r==0){
                f2=1;
            }
            else{
                f2*=i;
            }
        }
        for(int i=1;i<=(n-r);i++){
            if((n-r)<0){
                System.out.print("n-r < 0");
                break;
            }
            else if((n-r)==0){
                f3=1;
            }
            else{
                f3*=i;
            }
        }

        int c=f1/(f2*(f3));
        System.out.print("n'nin r ile kombinasyon sonucu : "+c);
        input.close();
    }
}
