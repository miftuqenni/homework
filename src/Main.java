import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student stud = new Student("Akalu", 1, new int[]{95, 89, 84});
        Student student2 = new Student("Fira", 2, new int[]{54, 80, 90});

        // Create Teacher object
        Teacher teacher = new Teacher("Mr.Jemal", "OOP");

        // Create College object
        College college = new College("Tech", new ArrayList<Student>(), new ArrayList<Teacher>());

        // Add students and teacher
        college.getStudents().add(stud);
        college.getStudents().add(student2);
        college.getTeachers().add(teacher);
        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
        // Display student grades
        for (Student student : college.getStudents()) {
            System.out.println(student.getName() + "'s Grades: " + java.util.Arrays.toString(student.getGrades()));
        }
    }
}
