import java.util.Scanner;

public class Pratik_Sinif_Gecme {
    public static void main(String[] args) {
        double mat,fiz,tur,kim,muz,average;
        int toplamnot = 0, toplamders = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Girin : ");
        mat = input.nextDouble();
        if ((mat >= 0) && (mat <= 100)){
            toplamnot += mat;
            toplamders++;
        }       System.out.print("Fizik Notunuzu Girin : ");
        fiz = input.nextDouble();
        if ((fiz >= 0) && (fiz <= 100)){
            toplamnot += fiz;
            toplamders++;
        }       System.out.print("Türkçe Notunuzu Girin : ");
        tur = input.nextDouble();
        if ((tur >= 0) && (tur <= 100)){
            toplamnot += tur;
            toplamders++;
        }       System.out.print("Kimya Notunuzu Girin : ");
        kim = input.nextDouble();
        if ((kim >= 0) && (kim <= 100)){
            toplamnot += kim;
            toplamders++;
        }       System.out.print("Müzik Notunuzu Girin : ");
        muz = input.nextDouble();
        if ((muz >= 0) && (muz <= 100)){
            toplamnot += muz;
            toplamders++;
        }
        average = (toplamnot / toplamders);
        if (average > 55){
            System.out.println("Sınıfı Geçtiniz, Tebrikler...");
        }   else {
            System.out.println("Sınıfta kaldınız...");
        }System.out.println("Ortalamanız : " + average)
    }
}