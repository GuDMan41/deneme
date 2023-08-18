package D1_SampleQuestion;

public class C23_SampleQuestion_29 {
    /*
    -------------------------------------------------------------------------------------------------------------
Soru29-)
    1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
    İpucu: Loop kulanabilirsiniz
--------------------------------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        int toplam = 0;
        int ilkSayi = 1;
        int sonSayi = 100;

        for (int i = ilkSayi; i <= sonSayi ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }




}
