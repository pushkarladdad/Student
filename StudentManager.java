import java.util.ArrayList;

public class StudentManager{
    ArrayList<Student> AllStudents = new ArrayList<>();

    public boolean addStudent(Student student){
        AllStudents.add(student);
        if(AllStudents.contains(student)){
            return true;
        }
        else{
            return false;
        }
    }

    public Student findStudentId(String studentId){
        for(Student student : AllStudents){
            if(student.getStudentId().equals(studentId)){
                return student;
            }
        }
        return null;
    }

    public void DisplayAllStudents(){
        for(Student student : AllStudents){
            System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId() + ", Marks: " + student.getMarks() + ", Grade: " + student.getGrade());
        }
    }

    public boolean updateStudentMarks(String studentId, double newMarks){
        Student temp = findStudentId(studentId);
        if(temp != null){
            temp.setMarks(newMarks);
            return true;
        }
        return false;
    }

    public boolean removeStudent(String studentId){
        Student temp = findStudentId(studentId);
        if(temp != null){
            AllStudents.remove(temp);
            return true;
        }
        return false;
    }   
}