package D1_SampleQuestion;

import java.util.Scanner;

public class C02_SampleQuestion_11 {
    /*
    Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz.
                Giriş :
		         > Gandalf Grey 563245879632
                Çıktı :
		         > İsim : G****** G***
		         > CCN : **** **** 9632
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz: ");
        String soyIsim = scanner.nextLine();
        System.out.println("Lütfen 16 hane olan kredi karti numaranizi girin: ");
        String kartNo = scanner.next();

        String duzenlenmisIsim = isim.toUpperCase().charAt(0)+ isim.substring(1);
        String duzenlenmisSoyisim = soyIsim.toUpperCase().charAt(0)+ soyIsim.substring(1);



        if (kartNo.length()>16 || kartNo.length()<16){
            System.out.println("Gecersiz kredi karti numarasi");
        } else {
            System.out.println("İsim : "+duzenlenmisIsim.charAt(0)+duzenlenmisIsim.substring(1).replaceAll("\\w","*")+" "
                    +duzenlenmisSoyisim.charAt(0)+duzenlenmisSoyisim.substring(1).replaceAll("\\w","*")+"\n"+
                    "CCN: "+ kartNo.substring(0,4).replaceAll("\\d","*")+" "+ kartNo.substring(4,8).replaceAll("\\d","*")+
                   " "+ kartNo.substring(8,13)+" "+kartNo.substring(13));
        }





    }
}
