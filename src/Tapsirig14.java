public class Tapsirig14 {
    public static void main(String[] args) {

int n = 84;

boolean cutMu = n % 2 == 0;
boolean musbetMi = n > 0;
boolean uceBolunur = n % 3 == 0;
boolean yeddiyeBolunur = n % 7 == 0;
boolean hemUcHemYeddi = (n % 3 == 0) && (n % 7 == 0);
boolean ondanBoyukYuzdenKicik = n > 10 && n < 100;

System.out.println("Ədəd: " + n);
System.out.println("Cüt mi?: " + cutMu);
System.out.println("Müsbət mi?: " + musbetMi);
System.out.println("3-ə bölünür?: " + uceBolunur);
System.out.println("7-yə bölünür?: " + yeddiyeBolunur);
System.out.println("Həm 3-ə, həm 7-yə bölünür?: " + hemUcHemYeddi);
System.out.println("10-dan böyük, 100-dən kiçik?: " + ondanBoyukYuzdenKicik);


n = 105;

cutMu = n % 2 == 0;
musbetMi = n > 0;
uceBolunur = n % 3 == 0;
yeddiyeBolunur = n % 7 == 0;
hemUcHemYeddi = (n % 3 == 0) && (n % 7 == 0);
ondanBoyukYuzdenKicik = n > 10 && n < 100;

System.out.println("Ədəd: " + n);
System.out.println("Cüt mi?: " + cutMu);
System.out.println("Müsbət mi?: " + musbetMi);
System.out.println("3-ə bölünür?: " + uceBolunur);
System.out.println("7-yə bölünür?: " + yeddiyeBolunur);
System.out.println("Həm 3-ə, həm 7-yə bölünür?: " + hemUcHemYeddi);
System.out.println("10-dan böyük, 100-dən kiçik?: " + ondanBoyukYuzdenKicik);

    }
}