public class Student{
    private String name;
    private String studentId;
    private double marks;

    public Student(String name, String studentId, double marks){
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade(){
        if(marks >= 90)
            return "A";
        if(marks >= 80)
            return "B";
        if(marks >= 70)
            return "C";
        if(marks >= 60)
            return "D";
        else
            return "F";
    }

}