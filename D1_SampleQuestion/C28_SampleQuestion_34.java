package D1_SampleQuestion;

import java.util.Arrays;

public class C28_SampleQuestion_34 {
    static String digits = "";

    public static void main(String[] args) {
        /*
        ------------------------------------------------------------------------------------------------------------------
Soru 34-)
Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
------------------------------------------------------------------------------------------------------------------
         */

        String str = "555sadas55";


        StringToplama(str);


    }

    private static void StringToplama(String str) {

        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i); // 143


            }

        }


        String[] strArr = digits.split(""); // [1, 4, 3]

        for (int i = 0; i < strArr.length; i++) {

            toplam += Integer.valueOf(strArr[i]);


        }

        System.out.println("Girilen String ifadedeki sayilarin toplamı : " + toplam);


    }


}
