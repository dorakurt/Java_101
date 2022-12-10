import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int select = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Kullanıcı adı veya Şifre hatalı !");
            System.out.print("Değiştirmek İster misiniz ? \n1-Evet\n2-Hayır\nSeçiminiz : ");
            select = input.nextInt();
        }
        switch (select) {
            case 1 :
            System.out.print("Yeni Şifrenizi Giriniz : ");
            newPassword = input.next();
            if (newPassword.equals(password)){
                System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu : " + newPassword);
            }
            break;
            case 2 :
            System.out.println("Tercih Sizin...");
            break;
        }
    }
}