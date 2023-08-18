package D1_SampleQuestion;

import java.util.Scanner;

public class C22_SampleQuestion_28 {
    /*
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------
    Soru-28)
    Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    Örnek:
    Sayı: 1238
    Sayının Tersi: 8321
    İpucu:  Loop kullanabilirsiniz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi = scanner.nextInt();

        String sayiYazi = sayi+"";
        int sayilenght = sayiYazi.length();


        for (int i = sayilenght-1; i >=0 ; i--) {

            System.out.print(sayiYazi.charAt(i));


        }



    }
}
