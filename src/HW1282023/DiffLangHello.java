package HW1282023;

public class DiffLangHello {
    String hello(String county) {
        if (county == "USA") {
            return "Hello";
        } else if (county == "Japan") {
            return "Knnoichiwa";
        } else if (county == "France") {
            return "Bonjour";
        }
        return county;
    }

    public static void main(String[] args) {
        DiffLangHello lang=new DiffLangHello();
        System.out.println(lang.hello("USA"));
        System.out.println(lang.hello("Japan"));
        System.out.println(lang.hello("Fracne"));
    }
}