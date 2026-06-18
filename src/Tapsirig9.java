public class Tapsirig9 {
    public static void main(String[] args) {

        int sayi = 583;
        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;
        int reqemlerinCemi = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println( "Ədədin yüzləri: " + yuzler);
        System.out.println("Ədədin onları: " + onlar);
        System.out.println("Ədədin birləri: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + reqemlerinCemi);


        sayi = 907;
        yuzler = sayi / 100;
        onlar = (sayi % 100) / 10;  // 907 ədədinin onluq mərtəbəsi olmadığı üçün 0 çıxır, yəni cavab düzdür.
        birler = sayi % 10;
        reqemlerinCemi = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println( "Ədədin yüzləri: " + yuzler);
        System.out.println("Ədədin onları: " + onlar);
        System.out.println("Ədədin birləri: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + reqemlerinCemi);

    }
}