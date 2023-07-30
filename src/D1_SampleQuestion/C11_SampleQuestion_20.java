package D1_SampleQuestion;

import java.util.Scanner;

public class C11_SampleQuestion_20 {
    public static void main(String[] args) {

    /*
    Soru 20-)
    Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
    Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
    yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

   Örnek:
   giriş: ama
   çıkış: Dizede yinelenen karakterler var

   İpucu: İf Else ve Char kullanarak çözebiliriz.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üc karakter olacak sekilde bir isim yaziniz: ");
        String isim = scanner.next();

        char karakter1 = isim.charAt(0);
        char karakter2 = isim.charAt(1);
        char karakter3 = isim.charAt(2);


        if (isim.length() == 3) {

            if (karakter1 == karakter2 || karakter1 == karakter3) {
                System.out.println("Dizede yinelenen karakterler var");
            } else {
                System.out.println("String benzersiz karakterlere sahip");
            }


        } else if (isim.length() > 3) {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }


    }
}
