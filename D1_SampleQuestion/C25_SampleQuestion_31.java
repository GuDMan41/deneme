package D1_SampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class C25_SampleQuestion_31 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------------------------------------------------------------------
    Soru 31-)
    Kullanıcıdan Arrayin uzunlugunu isteyin.
    Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
------------------------------------------------------------------------------------------------------------------
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Array'in uzunlugunu giriniz: ");
        int uzunluk =scanner.nextInt();


        int [] array = new int[uzunluk];

        Scanner scanner1 = new Scanner(System.in);



        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("Lütfen element giriniz:");
            int eleman = scanner1.nextInt();
            array[i] += eleman;

        }
        System.out.println(Arrays.toString(array));



    }



}
