package D1_SampleQuestion;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class C26_SampleQuestion_32 {
    /*
    Soru 32-)
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz array'in uzunlugunu giriniz:");
        int lenght = scanner.nextInt();
        int [] duzArr = new int[lenght];

        int [] tersArr = new int[lenght];


        for (int i = 0; i <duzArr.length ; i++) {
            System.out.println("Lütfen array'in elementlerini giriniz:");
            int element = scanner.nextInt();
            duzArr[i] += element;
        }

        for (int i = 0; i <duzArr.length ; i++) {

            tersArr[lenght-1] += duzArr[i];
            lenght--;

        }

        System.out.println(Arrays.toString(tersArr));



    }
}
