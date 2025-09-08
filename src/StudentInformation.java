public class StudentInformation {
    private String studentfirstname, studentlastname, grade;
    private int ID;

    public StudentInformation(String studentfirstname, String studentlastname, int ID, String grade){
        this.studentfirstname = studentfirstname;
        this.studentlastname = studentlastname;
        this.ID = ID;
        this.grade = grade;
    }

    public String getStudentfirstname() {
        return studentfirstname;
    }

    public String getStudentlastname() {
        return studentlastname;
    }

    public int getID() {
        return ID;
    }

    public String getGrade() {
        return grade;
    }
}
