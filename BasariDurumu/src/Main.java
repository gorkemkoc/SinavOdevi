import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı Soyadınızı Giriniz");
        String adSoyad = input.nextLine();

        System.out.println("Quiz Puanınızı Giriniz");
        int quiz = input.nextInt();


        System.out.println("Vize Puanınızı Giriniz");
        int vize = input.nextInt();

        System.out.println("Final Puanınızı Giriniz");
        int Final = input.nextInt();

        int ortalama = (int) (quiz * 0.1 + vize * 0.3 + Final * 0.6);



        if (ortalama >= 85 && ortalama <=100)
        {
            System.out.println("Sayın" +" "+ adSoyad + " Not Ortalamanız : AA");
        }

        else if (ortalama >= 70 && ortalama < 85)
        {
            System.out.println("Sayın" +" "+ adSoyad + " Not Ortalamanız : BB");
            System.out.println("Sınıfı Geçtiniz");
        }

        else if (ortalama >= 60 && ortalama <70)
        {
            System.out.println("Sayın" +" "+ adSoyad + " Not Ortalamanız : DD");
            System.out.println("Sınıfı Geçtiniz");
        }

        else if (ortalama >= 45 && ortalama < 60)
        {
            System.out.println("Sayın" +" "+ adSoyad + " Not Ortalamanız : CC");
            System.out.println("Sınıfı Geçtiniz");
        }

        else if (ortalama >= 0 && ortalama < 45)
        {
            System.out.println("Sayın"  +" "+ adSoyad + " Not Ortalamanız : FF");
            System.out.println("Sınıfta Kaldınız");
        }


        else
        {
            System.out.println("Lütfen Quiz, Vize, Final İçin Geçerli Bir Not Giriniz");
        }


    }
}
