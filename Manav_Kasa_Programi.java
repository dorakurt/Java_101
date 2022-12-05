import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domat=1.11,muz=0.95,balcan=5.0,toplam;
        double kgarmut,kgelma,kgdomat,kgmuz,kgbalcan;


        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        kgarmut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        kgelma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        kgdomat = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        kgmuz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        kgbalcan = input.nextDouble();

        toplam = ((kgarmut*armut)+(kgelma*elma)+(kgdomat*domat)+(kgmuz*muz)+(kgbalcan*balcan));
        System.out.print("Toplam Tutar : " + toplam + " TL");


    }
}