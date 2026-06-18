public class Tapsirig16 {
    public static void main(String[] args) {

 String metn = " Salam, ABB Bank! ";

System.out.println("Uzunluğu (trim-siz) : " + metn.length());
System.out.println("trim() sonra uzunluğu : " +metn.trim().length());
System.out.println("Böyük hərflərlə : " + metn.toUpperCase());
System.out.println("Kiçik hərflərlə : " + metn.toLowerCase());
System.out.println("\"ABB\" var mı? " + metn.contains("ABB")); // /" bu işarəni araşdırıb tapdım, dırnaq işarəsinin belə yazıldığını bilmirdim.
System.out.println("\"bank\" var mı? " + metn.contains("bank"));
System.out.println("\"Bank\"-ı \"Kredit\"-lə əvəz et: " + metn.replace("Bank", "Kredit"));
System.out.println("trim() sonra \"Salam\" ilə başlayır mi? " + metn.trim().startsWith("Salam"));

    }
}

