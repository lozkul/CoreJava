package day08_switchStatements_StringManipulation;

public class C14_substringTestenYazma {
    public static void main(String[] args) {
        // verilen dort basamakli bir string'i terse ceviren bir program yaziniz
        String  str="Java";
        String tersStr= str.substring(3) +
                str.substring(2,3)+
                str.substring(1,2)+
                str.substring(0,1);
        System.out.println(tersStr);
    }
}