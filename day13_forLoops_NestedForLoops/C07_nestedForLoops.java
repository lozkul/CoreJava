package day13_forLoops_NestedForLoops;

public class C07_nestedForLoops {
    public static void main(String[] args) {

        // aşağıdaki şekli oluşturan bir program yazınız

        /*
         * *
         * * *
         * * * *
         * * * * *
         */

        int satir=8;

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }


    }
}
