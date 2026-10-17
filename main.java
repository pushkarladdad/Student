import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int accept;
        int choice=0;
        do{
            System.out.println("1. Add Student");
            System.out.println("2. Search for a Student");
            System.out.println("3. Update Student Marks");
            System.out.println("4. View list of all Students");
            System.out.println("5. Exit");
            accept = sc.nextInt();
            switch (accept) {
                case 1:
                    System.out.println("Enter Student Name: ");
                    String name = sc.next();
                    System.out.println("Enter Student ID: ");
                    String studentId = sc.next();
                    System.out.println("Enter student marks: ");
                    int marks = sc.nextInt();
                    Student student = new Student(name, studentId, marks);
                    manager.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter Student ID to search:");
                    String searchId = sc.next();
                    Student SearchStudent = manager.findStudentId(searchId);
                    if(SearchStudent != null){
                        System.out.println("Name: " + SearchStudent.getName() + ", Student ID: " + SearchStudent.getStudentId() + ", Marks: " + SearchStudent.getMarks() + ", Grade: " + SearchStudent.getGrade());
                    }
                    break;
                case 3:
                    System.out.println("Enter Student ID to update marks:");
                case 5:
                    choice = choice +1;
                    break;
                default:
                    break;
            }
        }while (choice <=1);
    }
}
