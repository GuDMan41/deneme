package D1_SampleQuestion;

public class C19_SampleQuestion_25 {

    /*
    Soru 25-)
    Alfabeyi konsola yazdırın.
    örnek:
    a b c .. .. .. .. y z
    ipucu: char kullanmak iyi bir fikir olabilir
     */

    public static void main(String[] args) {



        char ilkharf = 'a';
        char sonharf = 'z';

        for (int i = ilkharf; i <=sonharf ; i++) {


            System.out.print(ilkharf+" ");
            ilkharf++;
        }


    }
}
