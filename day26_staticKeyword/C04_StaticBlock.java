package day26_staticKeyword;

public class C04_StaticBlock {
    static int sayi;
    C04_StaticBlock(){
        System.out.println("constructor çalıştı");
    }

    static {
        System.out.println("static blok çalıştı");
        sayi=40;
    }

    public static void main(String[] args) {
        C04_StaticBlock obj1= new C04_StaticBlock();

        System.out.println("sayı : " + sayi);
    }

}
