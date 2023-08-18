package D1_SampleQuestion;

import java.util.Scanner;

public class C03_SampleQuestion_12 {
    /*
        Soru 12-)
    Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
    Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
    Ipucu:  IF/Else kullanabilirsiniz.
    Örnek:
    İki tamsayı girin:
    25  veya  4567986321453
    46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme
    */
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Lütfen bir sayi giriniz: ");
     long sayi1  = scanner.nextLong();
     System.out.println("Lütfen bir sayi daha giriniz: ");
     long sayi2 = scanner.nextLong();
     long toplam = sayi1+sayi2;

     String kontrol1 = String.valueOf(sayi1);
     String kontrol2 = String.valueOf(sayi2);
     String toplamKontol = String.valueOf(sayi1+sayi2);

    if (kontrol1.length()>10 || kontrol2.length()>10){
        System.out.println("Fazla yuklenme");
    } else if (toplamKontol.length()>10) {
        System.out.println("Fazla yuklenme");

    } else {
        System.out.println("Sayilarin toplami: " + toplamKontol);
    }





    }
}
