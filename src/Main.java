import java.io.BufferedReader;
import java.io.IOException;
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
                        "Type “Get Student” to get a students information\n" +
                        "Type “Exit” to end the season");
        String input = in.readLine();
        if (input.equalsIgnoreCase("exit")){
            System.out.println("::Exiting Grade Ranker::");
            break;
                }
        else if (input.equalsIgnoreCase("enter")){
            addStudent(studentInformations,in);
        }
         else if (input.equalsIgnoreCase("display")){
            displayStudent(studentInformations);
        }
        else if (input.equalsIgnoreCase("get student")){
            getStudent(studentInformations,in);
        }
        else  {System.out.println("Command invalid\n" + "Please enter a valid command");
        }

        }

    }
    public static void addStudent(ArrayList<StudentInformation> studentInformations, BufferedReader in) throws IOException {
        String firstname = getFirstName(in);
        String lastname = getLastName(in);
        int ID = getID(in);
        String grade = getGrade(in);
        int CheckedID = checkDuplicates(studentInformations, in, ID);
        studentInformations.add(new StudentInformation(firstname,lastname,CheckedID,grade));
        System.out.println("Student Added");

    }
    public static int checkDuplicates(ArrayList<StudentInformation> students, BufferedReader in, int ID) throws IOException {
        for (StudentInformation studentInformation : students){
            if(studentInformation.getID() == ID){
                System.out.println("Invalid ID");
                int newID = getID(in);
                return newID;
            }
        }
        return ID;
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
        while (true){
        System.out.println("Enter the students 4 digit ID: ");
        String input = in.readLine();
        try {
        int ID;
         ID  = Integer.parseInt(input);
            System.out.println(ID);
            int NewID = checkIDLength(ID, in);
            return NewID;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid Student ID");
            throw new RuntimeException(e);
        }
    }
    }

    public static int checkIDLength(int ID, BufferedReader in) throws IOException {
        String number2string = String.valueOf(ID);
        String regex = "^\\d{4}$";
        if (number2string.matches(regex)){
            System.out.println("Student ID is valid");
            return ID;
        } else {
            System.out.println("Student ID is invalid. Try Again");
            int newID = getID(in);
            return newID;
        }

    }

    public static String getGrade(BufferedReader in) throws IOException {
        System.out.println("Enter the students grade: ");
        String grade = gradeValidator(in);
        System.out.println(grade);
        return grade;
    }
    public static String gradeValidator(BufferedReader in) throws IOException {
        String input = in.readLine();
        if (input.equalsIgnoreCase("a+")|| input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b") ||input.equalsIgnoreCase("c") || input.equalsIgnoreCase("fail")){
            return input;} else {
            System.out.println("Please enter a valid grade:\n" +
                    "A+ = highest grade\n" +
                    "A \n" +
                    "B\n" +
                    "C\n" +
                    "Fail = Lowest");
            String newinput = getGrade(in);
            return newinput;

        }
    }

    public static void displayStudent(ArrayList<StudentInformation> listofstudents){
        String[] grader = {"A+","A","B","C","Fail"};
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

    public static void getStudent(ArrayList<StudentInformation> listofstudents, BufferedReader in) throws IOException {
        System.out.println("Enter Students unique ID");
        String input = in.readLine();
        int ID = Integer.parseInt(input);
        boolean found;
        for (StudentInformation student : listofstudents){
            if (student.getID() == ID){
                found = true;
                System.out.println(student.getStudentfirstname() + " " +
                        student.getStudentlastname() + " " +
                        student.getID()+ " " +
                        student.getGrade());
            } else if (found = false){
                System.out.println("Student not found");
                break;
        }}
    }

}


