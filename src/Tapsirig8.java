public class Tapsirig8 {
    public static void main(String[] args) {

        int c0 = 0;
        double f0Int = c0 * 9/5 + 32;
        double f0Double = c0 * 9.0/5 + 32;

        System.out.println("0°C int çevirmə ilə = " + f0Int + "°F");
        System.out.println("0°C double çevirmə ilə = " + f0Double + "°F");


        int c100 = 100;
        double f100Int = c100 * 9/5 + 32;
        double f100Double = c100 * 9.0 /5 + 32;

        System.out.println("100°C int çevirmə ilə = " + f100Int + "°F");
        System.out.println("100°C double çevirmə ilə = " + f100Double + "°F");


        int c37 = 37;
        double f37Int = c37 * 9/5 + 32;  //Burada cavab düzgün alınmır, çünki 9 və 5 int olduğu üçün bölmə tam ədəd kimi aparılır.
        double f37Double = c37 * 9.0/5 + 32; //Düzgün variant budur, çünki 9.0 double olduğu üçün nəticə ondalıqlı hesablanır.

        System.out.println("37°C int çevirmə ilə = " + f37Int + "°F");
        System.out.println("37°C double çevirmə ilə = " + f37Double + "°F");

    }
}

