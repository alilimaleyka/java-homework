public class Tapsirig17 {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2)); // Mətnlər eynidir.
        System.out.println(s1.equals(s3)); // Biri böyük, digəri isə kiçik hərflərlə yazılıb.
        System.out.println(s1.equalsIgnoreCase(s3)); // Hərflərin ölçüsünə fikir verməsək mətn eynidir.
        System.out.println(s1.equals(" test ".trim())); // Bunu başa düşmədim.
        // Bonus: bunu da əlavə edib nəticəyə baxın:

        String s4 = new String("test");
        System.out.println(s1 = s2); // Bunu başa düşmədim.
        System.out.println(s1 = s4); // Bunu başa düşmədim.

    }
}