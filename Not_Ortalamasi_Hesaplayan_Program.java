import java.util.Scanner;

public class Not_Ortalamasi_Hesaplayan_Program {
    public static void main(String[] args) {
        int mat,fen,muz,trh,trk,kmy ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fen Notunuz : ");
        fen = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muz = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        trh = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        trk = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kmy = inp.nextInt();

        int toplam = (mat+fen+muz+trh+trk+kmy);
        double ortalama = toplam/6.0;

        System.out.println("Not Orlamanız : " + ortalama);

        boolean durum = ortalama >= 60;
        System.out.println(durum ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }

}

