import java.util.Scanner;

public class Etkinlik_Onerme {
    public static void main(String[] args) {

        int sıcaklık;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz : ");
        sıcaklık = input.nextInt();

        if (sıcaklık <= 5 ){
            System.out.println("Kayak Yapabilirsiniz...");
        }
        if ((sıcaklık > 5) && (sıcaklık <= 15)){
            System.out.println("Sinemaya Gidebilirsiniz...");
        }
        if ((sıcaklık > 15) && (sıcaklık <= 25)){
            System.out.println("Pikniğe Gidebilirsiniz...");
        }
        if (sıcaklık > 25){
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }
    }
}