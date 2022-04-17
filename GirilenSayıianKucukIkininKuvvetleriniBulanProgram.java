import java.util.Scanner;

// yazılımcı dedigin bence arastırıp ogrenmeyı sevmelı bende burda bu sorunun kısa yolunu buldum ve soruyu oyle yaptım

public class GirilenSayıianKucukIkininKuvvetleriniBulanProgram {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        n = input.nextInt();
    
        System.out.println("Girilen sayiya kadar 4'ün kuvvetleri : ");
        for(int i=0;i<=n;i++){
            System.out.print("  "+(Math.pow(4,i)));
        }
        System.out.println("\nGirilen sayiya kadar 5'in kuvvetleri : ");
        for(int i=0;i<=n;i++){
            System.out.print("  "+(Math.pow(5,i)));
        }
        input.close();
    }
}
