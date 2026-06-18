public class Tapsirig6 {
    public static void main(String[] args) {

        int a = 17;
        int b = 5;
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b)); // Burda nəticə səhvdir, ona görə ki, 17/5= tam ədəd deyil, sadəcə int yazdığımız üçün məcburən tam ədə verib.Double olmalı idi.
        System.out.println("a%b = " + (a%b)); // Burda da nəticə səhvdir, ona görə ki, 17%5= tam ədəd deyil, sadəcə int yazdığımız üçün məcburən tam ədə verib.Double olmalı idi.

    }
}
