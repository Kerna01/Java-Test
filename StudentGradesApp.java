
import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesApp {
    static HashMap<String, Double> studentGrades = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Grades System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Grade");
            System.out.println("3. View All Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateGrade();
                case 3 -> viewRecords();
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();
        studentGrades.put(name, grade);
        System.out.println("Student added!");
    }

    static void updateGrade() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            System.out.print("Enter new grade: ");
            double grade = scanner.nextDouble();
            studentGrades.put(name, grade);
            System.out.println("Grade updated!");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void viewRecords() {
        System.out.println("\n--- All Student Records ---");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + " - " + studentGrades.get(name));
        }
    }
}
