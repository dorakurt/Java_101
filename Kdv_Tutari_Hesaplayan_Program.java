import java.util.Scanner;

public class Kdv_Tutari_Hesaplayan_Program {
    public static void main(String[] args) {
        double tutar,kdvOran1 = 0.18, kdvOran2 = 0.08, kdvliTutar,kdvTutar,kdvOran;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : " );
        tutar = input.nextDouble();

        kdvTutar = tutar >1000 ? tutar * kdvOran2 : tutar * kdvOran1;
        kdvliTutar = kdvTutar + tutar;
        kdvOran = tutar>1000 ? kdvOran2 : kdvOran1;

        System.out.println("KDV'siz Tutar : " + tutar );
        System.out.println("KDV Oranı : " + kdvOran );
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " +kdvliTutar);


    }
}