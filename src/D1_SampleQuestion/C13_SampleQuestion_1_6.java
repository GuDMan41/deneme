package D1_SampleQuestion;

import java.util.Scanner;

public class C13_SampleQuestion_1_6 {
    /*
    Soru 1-)   SOUT/SYSO
    Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.Ipuclari:
    * r=7;
    * Pi=3.14
    * Dairenin Cevresi : 2*Pi*r
    * Dairenin Alani : Pi*r*r
    */

    public static void main(String[] args) {

        int r = 7 ;
        double Pi = 3.14 ;

        System.out.println("Daireinin cevresi: "+r*Pi*2);
        System.out.println("Daireni  alani : " + Pi*r*r);


        System.out.println("=====================================================");


        /*
         Soru-2)   SOUT/SYSO
     Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
     Ipuclari:
    * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
    * Dikdortgenin Alani : uzun kenar * kisa kenar
         */


        double kisaKenar = 5;
        double uzunKenar = 10;

        System.out.println("Dikdörtgenin cevresi : "+ 2*(uzunKenar+kisaKenar));
        System.out.println("Dikdörtgenin alani :"+ uzunKenar*kisaKenar);

        System.out.println("=====================================================");

        /*
        Soru 3-)   SCANNER
         Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
         */

        Scanner scanner = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        while (sayac<5){
            System.out.println("Lütfen bir sayi giriniz");
            int girilenSayi = scanner.nextInt();
            toplam += girilenSayi;
            sayac++;

        }
        System.out.println(toplam/sayac);

        System.out.println("====================================");

       /* Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.*/

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scanner2.nextInt();

        System.out.println((sayi*sayi*sayi)/2);

        /*
        Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        Ipuclari:Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
         */


        scanner2 = new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunlugunu giriniz: ");
        int kareKenarUzunlugu = scanner2.nextInt();

        System.out.println("Karenin cevresi: "+ kareKenarUzunlugu*4);
        System.out.println("Karenin alani:  "+ kareKenarUzunlugu*kareKenarUzunlugu);

        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram olarak hesaplayın
        Ipuclari:
    ·   Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

         */

        scanner2 = new Scanner(System.in);
        System.out.println("Lütfen günde kac bardak çay ictiginizi belirtiniz:  ");
        int cayBardagi = scanner2.nextInt();
        System.out.println("Lütfen günde ne kadar seker kullandiginizi belirtiniz: ");
        int seker = scanner2.nextInt();
        double gramSeker = seker*1.5 ;
        double kgSeker = gramSeker/1000 ;

        System.out.println("Bir yılda kullandiginiz seker :"+kgSeker*365+" kg ");
        System.out.println("Bir yılda içtiginiz cay(bardak):"+ cayBardagi*365+" bardak");




    }










































}
