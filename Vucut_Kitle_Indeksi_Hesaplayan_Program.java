import java.util.Scanner;

public class Vucut_Kitle_Indeksi_Hesaplayan_Program {
    public static void main(String[] args) {
        double kg,boy,vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        vki = (kg/(boy*boy));

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        
    }
}