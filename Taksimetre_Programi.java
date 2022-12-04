import java.util.Scanner;

public class Taksimetre_Programi {
    public static void main(String[] args) {

    int km;
        double perKm = 2.20, tutar,startPrice = 10;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç Km Gidildi ? : ");
        km = girdi.nextInt();

        tutar = (startPrice+(km * perKm));
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toptlam Tutar : " + tutar + " TL");


    }
}