public class Tapsirig3 {
    public static void main(String[] args) {

        final int MIN_KREDIT = 300;
        final int MAX_KREDIT = 50000;
        final double ILLIK_STANDART_FAIZ = 10.9;
        final String BANK_ADI = "ABB";
        final int MAX_KREDIT_MUDDETI = 60;

        System.out.println("Min kredit məbləği: " + MIN_KREDIT + " AZN");
        System.out.println("Max kredit məbləği: " + MAX_KREDIT + " AZN");
        System.out.println("İllik standart faiz: " + ILLIK_STANDART_FAIZ);
        System.out.println("Bankın qısa adı: " + BANK_ADI);
        System.out.println("Max kredit müddəti (ay): " + MAX_KREDIT_MUDDETI);

        MIN_KREDIT = 500; // cannot assign a value to final variable MIN_KREDIT

    }
}
