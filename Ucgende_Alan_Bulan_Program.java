import java.util.Scanner;

public class Ucgende_Alan_Bulan_Program {
    public static void main(String[] args) {
        int a ,b ,c;
        double u,alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : " );
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : " );
        b = girdi.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        u = ((a+b+c)/2);
        alan = Math.sqrt (u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı : " + alan);


    }
}