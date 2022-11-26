package day13_forLoops_NestedForLoops;

public class C05_NestedForLoops {
    public static void main(String[] args) {

        // aşağıdaki şekli oluşturan bir program yazınız

        /*
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
          */

        int satirSayisi=4;
        int sutunSayisi=8;


        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= sutunSayisi; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
