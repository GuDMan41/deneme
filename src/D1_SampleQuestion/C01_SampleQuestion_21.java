package D1_SampleQuestion;

import java.util.Scanner;

public class C01_SampleQuestion_21 {
    /*
    Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year
     Bir aydaki gün sayısını bulmak için bir Java programı yazın
	 Örnek:
     Bir ay numarası girin: 2
     Bir yıl girin: 2016
     Şubat 2016'da 29 gün vardır
     ipucu:
     Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
     Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
     ipucu2:
     ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
     1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
     Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
     2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
     Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ay numarasi girin: ");
        int ayNo = scanner.nextInt();
        System.out.println("lütfen hangi yıl olduğunu giriniz: ");
        int yil= scanner.nextInt();


        switch (ayNo){
            case 1 :
                System.out.println("31");
                break;
            case 2:
                artikYil(yil);
                break;
            case 3 :
                System.out.println("31");
                break;
            case 4 :
                System.out.println("30");
                break;
            case 5 :
                System.out.println("31");
                break;
            case 6 :
                System.out.println("30");
                break;
            case 7 :
                System.out.println("31");
                break;
            case 8 :
                System.out.println("31");
                break;
            case 9 :
                System.out.println("30");
                break;
            case 10 :
                System.out.println("31");
                break;
            case 11 :
                System.out.println("30");
                break;
            case 12 :
                System.out.println("31");
                break;

            default:
                System.out.println("yanlis bir ay numarası girdiniz");
        }

    }

    public static void artikYil (int yil) {



        if (!(yil%100==0) && yil%4 == 0) {

            System.out.println("29");

        }else if(yil%100==0 && yil%400 == 0){
            System.out.println("29");

        }else  {
            System.out.println("28");

        }





        }



}
