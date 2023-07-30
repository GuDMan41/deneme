package D1_SampleQuestion;

import java.util.Scanner;

public class C12_SampleQuestion_7 {
    public static void main(String[] args) {
        /*

        Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:( Data Casting -> Auto Widening ve Explicit Narrowing )

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalikli bir sayi giriniz :");
        double girilenSayi = scanner.nextDouble();

        int girilenSayiTam = (int) girilenSayi;

        System.out.println(girilenSayiTam);

        System.out.println("Lütfen ondalikli bir sayi giriniz :");

        float girilenSayi2 = scanner.nextFloat();

        short girilenSayiTam2 = (short)girilenSayi2;

        System.out.println(girilenSayiTam2);






    }



}
