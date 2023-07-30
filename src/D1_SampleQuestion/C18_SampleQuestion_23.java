package D1_SampleQuestion;

import java.util.Scanner;

public class C18_SampleQuestion_23 {

    public static void main(String[] args) {
        /*
        Soru 23-)Girdi olarak bir tamsayı kabul eden ve bu tam sayının
        faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        Örnek:Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen faktoryel degerini hesaplamak istediginiz tam sayiyi giriniz:");

        int girilenSayi = scanner.nextInt();
        faktoryelHesapla(girilenSayi);
        int sonuc = faktoryelHesapla(girilenSayi);
        System.out.println(sonuc);




    }


    public static int faktoryelHesapla(int tamsayi) {


        int faktoryel = 1;
        int sayac = 0;

        for (int i = 1; i <= tamsayi; i++) {

            faktoryel *= i;
            sayac++;


        }
        int sonuc = faktoryel;


        return sonuc;
    }


}
