package D1_SampleQuestion;

import java.util.Arrays;

public class C27_SampleQuestion_33 {
    /*
    Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
     */

    public static void main(String[] args) {
        String str = "ALİ ATA BaK!";

        String[] arr = new String[str.length()];

        // [J, a, v, a,  , C, a, n, d, i, r, .]

        arr = str.split("");


        String[] tersArr = new String[arr.length];


        for (int i = 0; i < tersArr.length; i++) {

            tersArr[i] = arr[tersArr.length - i - 1];


        }

        System.out.println("String ifadenin ters cevirilmiş Array hali : " + Arrays.toString(tersArr));


    }
}
