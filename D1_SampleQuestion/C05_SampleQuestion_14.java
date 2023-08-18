package D1_SampleQuestion;

import java.util.Scanner;

public class C05_SampleQuestion_14 {
    /*
         Soru 14-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Lütfen bir harf giriniz");
        char karakter = scanner.next().charAt(0);

        int sayac = 0 ;
        int index = 0 ;


        while (index<isim.length()){
            if (isim.charAt(index) == karakter){
                sayac++;
            }
            index++;
        }

        System.out.println(karakter+" sayisi "+ sayac +" adettir.");






    }
}
