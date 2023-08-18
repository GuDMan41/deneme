package D1_SampleQuestion;

import java.util.Scanner;

public class C08_SampleQuestion_17 {
    /*
    Soru 17-)
    Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
    Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
    İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
    değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
    Ipucu:
    IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz: ");
        String isim = scanner.next();

        char karakter1 = isim.charAt(0);
        char karakter2 = isim.charAt(1);
        char karakter3= isim.charAt(2);

        if (karakter1==karakter2 || karakter2==karakter3 || karakter1==karakter3){
            System.out.println("Dize yinelenen karakterlere sahip");
        } else {
            System.out.println("Dize benzersiz karakterlere sahip");

        }


    }



}




