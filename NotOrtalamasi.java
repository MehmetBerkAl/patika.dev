import java.util.Scanner; 

public class NotOrtalamasi {
    public static void main (String[] args ){
        int math,pys,chem,turk,his,music;
        float avarage;

        Scanner a = new Scanner(System.in);        
        System.out.print("Matematik : ");
        math = a.nextInt();
        Scanner b = new Scanner(System.in);        
        System.out.print("Fizik : ");
        pys = b.nextInt();
        Scanner c = new Scanner(System.in);        
        System.out.print("Kimya : ");
        chem = c.nextInt();
        Scanner d = new Scanner(System.in);        
        System.out.print("Turkce : ");
        turk = d.nextInt();
        Scanner e = new Scanner(System.in);        
        System.out.print("Tarih : ");
        his = e.nextInt();
        Scanner f = new Scanner(System.in);        
        System.out.print("Muzik : ");
        music = f.nextInt();

        avarage = (math+pys+chem+turk+his+music)/6;
        System.out.println("Ortalama : "+avarage);        
        a.close(); // bu close ları yapmadigimda problem olusuyordu.
        b.close();
        c.close();
        d.close();
        e.close();
        f.close();
    }
}

/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan 
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. */