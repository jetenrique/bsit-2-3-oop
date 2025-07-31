import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner malongScanner = new Scanner(System.in);

        System.out.print("Enter ID number: ");
        String ID = malongScanner.nextLine();

        System.out.print("Enter First name: ");
        String fname = malongScanner.nextLine();

        System.out.print("Enter Last name: ");
        String lname = malongScanner.nextLine();

        System.out.print("Enter course: ");
        String course = malongScanner.nextLine();

        System.out.print("Enter section: ");
        String section = malongScanner.nextLine();

        System.out.println("Hello, good day to you, " + fname + " " + lname +
                ", from " + course + " " + section + ".");
        System.out.println(" ");


        System.out.print("Please enter your Midterm Exam Score: ");
        int mES = malongScanner.nextInt();

        System.out.print("Please enter your Final Exam Score: ");
        int fES = malongScanner.nextInt();

        System.out.print("Please enter your Project Score: ");
        int pS = malongScanner.nextInt();

        System.out.print("Please enter your Attendance Score: ");
        int aS = malongScanner.nextInt();

        int overAllScore = mES + fES + pS + aS;
        System.out.println("Your overall score is: " + overAllScore);



        int averageScore = mES + fES + pS + aS % 400;
        int result;
        if (averageScore >= 75) {
            result = 2;
        }
        else{
            result = 1;
        }

        switch(result){
            case 2:
                System.out.println("Passed");
                break;
            case 1:
                System.out.println("Failed");
                break;
        }

        System.out.println("end");


    }
}
