package day19_arrays;

public class C06_ElemanlariToplaMain {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.
        int[] arr = {3,5,7,10,-5,0};

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                toplam+=arr[i];
            }
        }
        System.out.println("arrayin elementleri toplamı : " + toplam);
    }
}
