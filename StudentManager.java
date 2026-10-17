import java.util.ArrayList;

public class StudentManager{
    ArrayList<Students> AllStudents = new ArrayList<>();

    public boolean addStudent(Students student){
        AllStudents.add(student);
        if(AllStudents.contains(student)){
            return false;
        }
        else{
            return true;
            
        }
    }

    public Students findStudentId(studentId){
        if(AllStudents.contains(studentId)){
            return AllStudents.studentId.indexof(studentId);
        }
        else
            return null;
    }
}