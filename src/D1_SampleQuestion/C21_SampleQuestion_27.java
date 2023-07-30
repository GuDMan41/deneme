package D1_SampleQuestion;

public class C21_SampleQuestion_27 {

    /*
    Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
    ipucu: For Loop ve Char kullanarak çözebilirsiniz.
    örnek:
    Ascii value of a = 97
    Ascii value of b = 98
    Ascii value of c = 99
    Ascii value of d = 100
    ......
----------------------------------------------------------------------------------------------------------------------------------------------------------------
     */

    public static void main(String[] args) {

        Character ilkharf = 'a';
        int ilkHarfDeger = ilkharf;
        Character sonHarf= 'z';
        int sonHarfDeger = sonHarf;



        for (int i = ilkHarfDeger; i <= sonHarfDeger ; i++) {

            System.out.print(i+" ");

        }


    }
}
