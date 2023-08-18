package D1_SampleQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C24_SampleQuestion_30 {
    /*
    --------------------------------------------------------------------------------------------------------------
    Soru 30-)
    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
    ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"
    Yinelenen karakterler : [a, o, k]
    İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
     */

    public static void main(String[] args) {

        String metin = "Javacokkolay";
        String [] arr = metin.split("");
        System.out.println(Arrays.toString(arr));
        String tekrarEdenKarakterler ="";

        for (int i = 0; i <arr.length; i++) {

            if (!tekrarEdenKarakterler.contains(arr[i])&& metin.substring(i+1).contains(arr[i])){
                tekrarEdenKarakterler+= arr [i];
            }



        }
        System.out.println(tekrarEdenKarakterler);
        String[] yinelenenKarakterler=tekrarEdenKarakterler.split("");
        System.out.println(Arrays.toString(yinelenenKarakterler));

        System.out.println("=========================");


        String str="Javacokkolay";

        char[] karakter=str.toCharArray();
        System.out.println(Arrays.toString(karakter)); //kontrol amaçlı
        //[J, a, v, a, c, o, k, k, o, l, a, y]


        List<String> tekrarEdenListesi=new ArrayList<>();
        for (int i = 0; i < karakter.length; i++) {

            for (int j = i+1; j < karakter.length; j++) {

                if (karakter[i]==karakter[j] && !tekrarEdenListesi.contains(String.valueOf(karakter[i]))){
                    tekrarEdenListesi.add(String.valueOf(karakter[i]));
                }
            }
        }
        System.out.println(tekrarEdenListesi);  //[a, o, k]


    }
}
