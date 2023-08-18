package D1_SampleQuestion;

import java.util.Scanner;

public class C15_SampleQuestion_10 {

    /*
    Soru 10-)  Klasik Soru
    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
    Kullanıcıya aşağıdaki gibi mesaj verin:

    Eğer VKİ 18.5'ten az ise --> zayıfsınız
    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
    VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!

                ÖRNEK :

                 Ağırlık : 71
                 Yükseklik : 1,72

                ÇIKTI :

                VKİ değeriniz : 23.99945916711736 -> Kilonuz ideal

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        double kg = scan.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz (m):");
        double boy = scan.nextDouble();
        
        double vki = kg / (boy*boy) ;
        
        if (vki >= 30){

            System.out.println("Vki degeriniz:"+vki+"agam obezsin, diyet yap!");
            
        } else if (vki>=25) {

            System.out.println("Vki degeriniz:"+vki+" şişmansınız");
            
        } else if (vki>= 18.5) {
            System.out.println("Vki degeriniz:"+vki+" " +
                    "kilo idealdir");
            
        } else if (vki< 18.5) {
            System.out.println("Vki degeriniz:"+vki+" zayıfsınız");

        }


    }
}
