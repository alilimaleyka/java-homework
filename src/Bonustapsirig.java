public class Bonustapsirig {
    public static void main(String[] args) {

        String musteriAdi = "Leyla Əlizadə";
        int yas = 36;
        double ayliqGelir = 1400.0;

        double kreditMeblegi = 10000.0;
        int muddetAy = 24;
        double illikFaiz = 12.0;
        boolean kreditTarixi = true;

        final int MIN_YAS = 21;
        final int MAX_YAS = 65;
        final double MIN_GELIR = 800.0;
        final double MIN_KREDIT_MEBLEGI = 300.0;
        final double MAX_KREDIT_MEBLEGI = 50000.0;
        final double MAX_GELIRE_NISBET = 40.0;

        double umumiFaiz = kreditMeblegi * (illikFaiz / 100);
        double umumiOdenis = kreditMeblegi + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddetAy;
        double gelireNisbet = (ayliqOdenis / ayliqGelir) * 100;

        boolean yasSerti = yas >= MIN_YAS && yas <= MAX_YAS;
        boolean gelirSerti = ayliqGelir > MIN_GELIR;
        boolean meblegSerti = kreditMeblegi >= MIN_KREDIT_MEBLEGI && kreditMeblegi <= MAX_KREDIT_MEBLEGI;
        boolean gelireNisbetSerti = gelireNisbet < MAX_GELIRE_NISBET;

        boolean kreditTesdiqlenir = yasSerti && gelirSerti && meblegSerti && gelireNisbetSerti && kreditTarixi;

        System.out.println("===== MÜŞTƏRİ KREDİT HESABATI =====");

        System.out.println("Müştəri adı: " + musteriAdi);
        System.out.println("Yaş: " + yas);
        System.out.println("Aylıq gəlir: " + ayliqGelir + " AZN");
        System.out.println("Kredit məbləği: " + kreditMeblegi + " AZN");
        System.out.println("Müddət: " + muddetAy + " ay");
        System.out.println("İllik faiz: " + illikFaiz + "%");
        System.out.println("Kredit tarixi yaxşıdır mı? " + kreditTarixi);

        System.out.println("----- Hesablamalar -----");

        System.out.println("Ümumi faiz: " + umumiFaiz + " AZN");
        System.out.println("Ümumi ödəniş: " + umumiOdenis + " AZN");
        System.out.println("Aylıq ödəniş: " + ayliqOdenis + " AZN");
        System.out.println("Gəlirə nisbət: " + gelireNisbet + "%");

        System.out.println("----- Yoxlamalar -----");

        System.out.println("Yaş şərti ödənilir mi? " + yasSerti);
        System.out.println("Gəlir şərti ödənilir mi? " + gelirSerti);
        System.out.println("Məbləğ şərti ödənilir mi? " + meblegSerti);
        System.out.println("Gəlirə nisbət 40%-dən azdır mı? " + gelireNisbetSerti);
        System.out.println("Kredit təsdiqlənir mi? " + kreditTesdiqlenir);
    }
}

