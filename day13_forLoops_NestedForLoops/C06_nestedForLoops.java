package day13_forLoops_NestedForLoops;

public class C06_nestedForLoops {
    public static void main(String[] args) {
        /*
        çarpım tablosunu aşağıdaki formatta yazdıralım

        1
        2 4
        3 6 9
        4 8 12 16
        satır sayısı input olarak verilecek

         */
int satirSayisi=10;

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println("");
        }

    }
}
