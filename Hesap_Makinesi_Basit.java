import java.util.Scanner;

public class Hesap_Makinesi_Basit {
    public static void main(String[] args) {
        double n1,n2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz : ");
        select = input.nextInt();

        switch (select) {
            case 1 :
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2 :
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3 :
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4 :
                System.out.println("Bölme : " + ((n2 == 0) ? "Bir Sayı Sıfır İle Bölünemez" : (n1 / n2)));
                break;
            default:
                System.out.println("Yalnış Seçim Yaptınız");
        }
    }
}