
class Person {
    String name = "John Doe";
    int age = 40;
}

public class Teacher extends Person {
    String subject = "Mathematics";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.display();
    }
}
