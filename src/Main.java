import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
        ArrayList<StudentInformation> studentInformations = new ArrayList<>();
        for(;;){
                System.out.println(":::Welcome to Grade Ranker:::\n" +
                        "Type “Enter” to enter a student into the system\n" +
                        "Type “Display” to display the ranking\n" +
                        "Type “Exit” to end the season");
        String input = in.readLine();
        if (input.equalsIgnoreCase("exit")){
            System.out.println("::Exiting Grade Ranker::");
            break;
                }
        if (input.equalsIgnoreCase("enter")){
            addStudent(studentInformations,in);
        }
        if (input.equalsIgnoreCase("display")){
            displayStudent(studentInformations);
        }

        }

    }
    public static void addStudent(ArrayList<StudentInformation> studentInformations, BufferedReader in) throws IOException {
        String firstname = getFirstName(in);
        String lastname = getLastName(in);
        int ID = getID(in);
        String grade = getGrade(in);
        studentInformations.add(new StudentInformation(firstname,lastname,ID,grade));
        System.out.println("Student Added");

    }
    public static String getFirstName(BufferedReader in) throws IOException {
        System.out.println("Enter the students first name: ");
        String input = in.readLine();
        String firstname = input;
        System.out.println(firstname);
        return firstname;
    }

    public static String getLastName(BufferedReader in) throws IOException {
        System.out.println("Enter the students last name: ");
        String input = in.readLine();
        String lastname = input;
        System.out.println(lastname);
        return lastname;
    }

    public static int getID(BufferedReader in) throws IOException {
        System.out.println("Enter the students ID name: ");
        String input = in.readLine();
        int ID = Integer.parseInt(input);
        System.out.println(ID);
        return ID;
    }

    public static String getGrade(BufferedReader in) throws IOException {
        System.out.println("Enter the students grade: ");
        String input = in.readLine();
        String grade = input;
        System.out.println(grade);
        return grade;
    }

    public static void displayStudent(ArrayList<StudentInformation> listofstudents){
        String[] grader = {"A+","A","B","C"};
        for (String grade : grader){
        for (StudentInformation student: listofstudents){
            if(student.getGrade().equalsIgnoreCase(grade)){
                System.out.println(student.getStudentfirstname() + " " +
                        student.getStudentlastname() + " " +
                        student.getID()+ " " +
                        student.getGrade());

            }}


        }
    }

}


