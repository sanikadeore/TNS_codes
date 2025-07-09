package constructor;

public class EncapsulationConstructor {
	private String name;
    private int age;
    private String studentId;

    // Constructor to initialize Student objects
    public EncapsulationConstructor(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Public getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Public setter methods to modify private variables (with potential validation)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // Example of validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}