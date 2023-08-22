package D1_SampleQuestion;

import javax.management.MBeanRegistration;
import java.util.Arrays;
import java.util.Scanner;

public class C30_SampleQuestion_36 {

    static Scanner scanner = new Scanner(System.in);
    static int sayac = 0;


    /*
    Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
------------------------------------------------------------------------------------------------------------------
     */

    public static void main(String[] args) {


        System.out.println(Arrays.toString(ArrayOrtadakiElemanBulma()));


    }

    public static int[] ArrayOrtadakiElemanBulma() {

        System.out.println("Olusturmak istediginiz array'in uzunlugunu giriniz:");
        int[] arr = new int[scanner.nextInt()];


        for (int i = 0; i < arr.length; i++) {

            System.out.println("Olusturmak istediginiz tamsayi array'in elemanlarini giriniz:");
            int eleman = scanner.nextInt();

            arr[i] = eleman;
        }

        if (arr.length % 2 == 0) {
            sayac = 2;

        } else {
            sayac = 1;
        }

        int[] ortadakiEleman = new int[sayac];


        for (int i = 0; i < arr.length; i++) {

            if (arr.length % 2 == 0) {

                ortadakiEleman[i] = arr[(arr.length / 2) - 1]; // [1,"2,3",4]
                ortadakiEleman[i + 1] = arr[arr.length / 2];

                break;

            } else {

                ortadakiEleman[i]= arr[arr.length/2]; // [1,"2",3]
                break;

            }


        }

        System.out.print("Girilen array'in ortadaki karakteri/karakterleri(uzunluk cift ise 2 karakter gösterilir) :");


        return ortadakiEleman;
    }


}
