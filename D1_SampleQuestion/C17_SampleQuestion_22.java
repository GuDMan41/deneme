package D1_SampleQuestion;

import java.util.Scanner;

public class C17_SampleQuestion_22 {
    public static void main(String[] args) {
       /*

        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. tamsayıyı giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("lütfen 2. tamsayıyı giriniz: ");
        int sayi2= scan.nextInt();

        int ebob=0;

        for (int i = 1; i <sayi1 || i<sayi2 ; i++) {
            System.out.println(i);

            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }

        int ekok= (sayi1*sayi2)/ebob;

        System.out.println("Girilen sayının EBOB'u: " + ebob);
        System.out.println("Girilen sayının EKOK'u: " + ekok);

    }
}