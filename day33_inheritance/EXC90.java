package day33_inheritance;

public class EXC90 extends DVolvo{

    String model="XC90";
    EXC90(String renk){
        System.out.println(renk + " bir XC 90");
    }
    public static void main(String[] args) {

        EXC90 arb1= new EXC90("Kırmızı");


    }
}
/*
Java'nin class'lara otomatik olarak koydugu
default constructor'in parametresiz oldugu gibi
extends keyword kullanilan class'larda
olusturulan her constructor'in
ilk satirina konulan super() de parametresizdir.
 */








