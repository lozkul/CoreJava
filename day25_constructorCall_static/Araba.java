package day25_constructorCall_static;

public class Araba {

    int yil;
    String marka;

    Araba(){
        yil=2015;
    }


    public Araba(int yil, String marka) {
        this();
        this.yil = yil;
        this.marka = marka;

    }

    public Araba(int yil) {
        this(yil, "toyota");
        this.yil = yil;
    }

    public static void main(String[] args) {


        Araba arb3= new Araba(2018, "Volvo");
        System.out.println(arb3);

        Araba arb2= new Araba(2020);
        System.out.println(arb2);


        Araba arb1= new Araba();
        System.out.println(arb1);


    }

    @Override
    public String toString() {
        return "Araba özellikleri :" +
                " yil=" + yil +
                ", marka='" + marka;
    }
}
