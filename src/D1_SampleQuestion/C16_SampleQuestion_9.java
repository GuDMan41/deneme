package D1_SampleQuestion;

import java.util.Scanner;

public class C16_SampleQuestion_9 {
    public static void main(String[] args) {
        /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
         Örnek: 2 saat 3 dakika 10 saniye ==>  7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saniyeye çevirmek istediginiz saati; saat,dakika,saniye olarak giriniz: ");
        System.out.print("Saat :");
        int saat = scanner.nextInt();
        System.out.println("Lütfen  dakikayi giriniz:");
        System.out.print("Dakika :");
        int dakika = scanner.nextInt();
        System.out.println("Lütfen saniyeyi giriniz:  ");
        System.out.println("Saniye :");
        int saniye = scanner.nextInt();

        int toplamSaniye = 3600 * saat + 60 * dakika + saniye;
        System.out.println("Girmiş oldugunuz saat, toplam " + toplamSaniye + " saniyedir.");

    }

}