
public class MethodOverloadingExample {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        System.out.println("Int sum: " + obj.add(5, 10));
        System.out.println("Double sum: " + obj.add(5.5, 3.3));
    }
}
