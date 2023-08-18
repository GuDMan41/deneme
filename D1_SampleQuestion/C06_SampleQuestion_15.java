package D1_SampleQuestion;

import java.util.Scanner;

public class C06_SampleQuestion_15 {


        /*
         Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
         Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
         Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
         Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
         Loopun içerisinde StringM methodlarından  yararlanalım!
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 5 harfli bir kelime giriniz :");


        boolean kelime5denBuyukMu = true;


        while (kelime5denBuyukMu) {

            scanner = new Scanner(System.in);
            String kelime = scanner.nextLine();
            if (!(kelime.length() >= 5)) {
                System.out.println("Lütfen 5 harfli bir kelime giriniz:");
                kelime5denBuyukMu = true;
            } else {

                kelime = kelime.substring(kelime.length() - 3) + kelime.substring(kelime.length() - 3);

                System.out.println(kelime);
            }


        }


    }

}
