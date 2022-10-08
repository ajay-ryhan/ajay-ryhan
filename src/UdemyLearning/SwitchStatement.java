package UdemyLearning;

public class SwitchStatement {

    public static void main(String[] args) {

        int studentRollNumber = 0;
        switch (studentRollNumber) {
            case 1:
                System.out.println("Student Name: Ajay");
                System.out.println("Student Roll Number: 01");
                break;
            case 2:
                System.out.println("Student Name: Rifana");
                System.out.println("Student Roll Number: 02");
                break;
            case 3:
                System.out.println("Student Name: Donnavan");
                System.out.println("Student Roll Number: 03");
                break;
            case 4:
                System.out.println("Student Name: Micheal schofield");
                System.out.println("Student Roll Number: 04");
                break;
            default:
                System.out.println("Entered student Roll Number is invalid");
        }
    }
}
