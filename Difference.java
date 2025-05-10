public class EqualityExample {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println("Using == : " + (a == b));         // false
        System.out.println("Using .equals(): " + a.equals(b)); // true

        int x = 5;
        int y = 5;
        System.out.println("Primitive == : " + (x == y));      // true
    }
}