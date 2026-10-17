import java.util.ArrayList;

public class StudentManager{
    ArrayList<Student> AllStudents = new ArrayList<>();

    public boolean addStudent(Student student){
        AllStudents.add(student);
        if(AllStudents.contains(student)){
            return false;
        }
        else{
            return true;
            
        }
    }

    public Student findStudentId(studentId){
        if(AllStudents.contains(studentId)){
            return AllStudents.studentId.indexof(studentId);
        }
        else
            return null;
    }
}