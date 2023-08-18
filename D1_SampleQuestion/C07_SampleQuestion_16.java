package D1_SampleQuestion;

import java.util.Scanner;

public class C07_SampleQuestion_16 {
    public static void main(String[] args) {
        /*
        Soru 16-)
    Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
    -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
    -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
    Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
    Örn:
	 isim1= masa
     isim2= ali
	 Konsol => maalisa
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime1 = scanner.next();
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime2 = scanner.next();

        if (kelime1.length()%2 == 0){

            String YeniKelime = kelime1.substring(0,kelime1.length()/2)+"----"+kelime2+"----"+kelime1.substring(kelime1.length()/2);

            System.out.println(YeniKelime);

        } else {

            System.out.println("son girdiginiz isim, ilk girdiginiz isme eklenemez.");

        }



    }
}
