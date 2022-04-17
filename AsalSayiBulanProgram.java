public class AsalSayiBulanProgram {
    public static void main(String[] args){
        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                } 
            }                
            if(kontrol==0)
            {
                System.out.print(sayi+" ");
                sayac++; 
            }
        }
    }
}

// kendim tamamını yapamadim sonra asagidaki sitede sorunun cozumunu buldum ve onu gonderdim.
// https://www.yazilimkodlama.com/java/1-100-arasindaki-asal-sayilari-ekrana-yazdiran-java-programi/