package D1_SampleQuestion;

import java.util.Scanner;

public class C14_SampleQuestion_8 {

    /*
    Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
    ipuclari:
    Matematiksel Islemler konusuna bakalim.
    Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir tam sayi giriniz: ");
        int girilenSayi = scan.nextInt();
        int sayi = girilenSayi;
        int rakamlarToplami =  0 ;
        int birinciBasamak = 0 ;
        String sayiBasamaksayisi = sayi+"";

        birinciBasamak=sayi%10;
        rakamlarToplami += birinciBasamak;
        sayi /= 10;
        birinciBasamak = sayi%10;
        rakamlarToplami+= birinciBasamak;
        sayi /= 10 ;
        birinciBasamak = sayi%10;
        rakamlarToplami += birinciBasamak;
        sayi /= 10 ;

        System.out.println("ForLoopsuz sonuc: "+ rakamlarToplami);

    for (int i = 1; i <=sayiBasamaksayisi.length() ; i++) {  //ForLoop'la da yaptim istedigin kadar basamak gir hesabii :D

        birinciBasamak=sayi%10;
        rakamlarToplami += birinciBasamak;
        sayi /= 10;

    }
    System.out.println("Forloop'lu sonuc:   "+rakamlarToplami);






    }
}
