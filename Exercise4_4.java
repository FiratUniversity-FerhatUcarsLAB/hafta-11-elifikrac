public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Bu satir calisir fakat ekrana hicbir sey yazilmaz.
        // getNumber() 42 degerini dondurur AMA siz bu degeri
        // bir degiskene atamadiginiz veya yazdirmadiginiz icin sonuc kaybolur.
        // Yani: "dead code effect" — metot bosuna cagirilmis olur.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Bu kod DERLEME HATASI verir.
        // Cunku sayHello() metodu void'dir (deger DONDURMEZ).
        // Java'da void bir method, + ile matematiksel islemlerde
        // veya herhangi bir ifadede kullanilamaz.
        // Ornek hata: "void type not allowed here".
    }
}
