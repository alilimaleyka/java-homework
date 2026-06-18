public class Tapsirig4 {
    public static void main(String[] args) {
        int yas = 25; // Xəta 1: Java case-sensitive-dir, "Int" yox, "int" yazılmalıdır.
        String sehir = "baku"; // Xəta 2: String dəyəri mütləq dırnaq içində yazılmalıdır.
        double kreditMeblegi = 5000; // Xəta 3: Dəyişənin adında boşluq olmaz, camelCase metodu ilə yazılmalıdır.
        boolean aktiv = true; // Xəta 4: Kiçik hərflə "true" yazılmalıdır.
        final int LIMIT = 100;
        //LIMIT = 200; // Xəta 5: Final dəyişənin dəyərini sonradan dəyişmək olmaz.
        System.out.println(yas); // Xəta 6: Sətrin sonunda nöqtə yox, ; olmalıdır.
    }
}
