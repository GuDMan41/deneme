package D1_SampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class C29_SampleQuestion_35 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        ------------------------------------------------------------------------------------------------------------------
Soru 35-)
Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
------------------------------------------------------------------------------------------------------------------
         */
        System.out.println("Lütfen bir isim giriniz :");
        String isim = scanner.nextLine();

        ArrayYazdir(isim);
    }

    private static void ArrayYazdir(String isim) {

        char[] arr = new char[isim.length()];

        for (int i = 0; i <isim.length() ; i++) {

          arr[i]   =  isim.charAt(i);

        }

        System.out.println(Arrays.toString(arr));


    }
}
