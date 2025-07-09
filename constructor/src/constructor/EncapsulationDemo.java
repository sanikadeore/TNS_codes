package constructor;

import java.util.Scanner;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        EncapsulationConstructor student1 = new EncapsulationConstructor(name, age, studentId);

        System.out.println("\nStudent Information:");
        student1.displayStudentInfo();

        System.out.print("\nEnter new age for the student: ");
        int newAge = scanner.nextInt();
        student1.setAge(newAge); 

        System.out.println("\nUpdated Student Information:");
        student1.displayStudentInfo();

        scanner.close(); 
    }
}