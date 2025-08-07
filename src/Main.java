import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner ygotScanner = new Scanner(System.in);

        System.out.print("Enter ID number: ");
        String ID = ygotScanner.nextLine();

        System.out.print("Enter First name: ");
        String fname = ygotScanner.nextLine();

        System.out.print("Enter Last name: ");
        String lname = ygotScanner.nextLine();

        System.out.print("Enter course: ");
        String course = ygotScanner.nextLine();

        System.out.print("Enter section: ");
        String section = ygotScanner.nextLine();

        System.out.println("Hello, good day to you, " + fname + " " + lname +
                ", from " + course + " " + section + ".");
        System.out.println(" ");


        System.out.print("Please enter your Midterm Exam Score: ");
        int mES = ygotScanner.nextInt();

        System.out.print("Please enter your Final Exam Score: ");
        int fES = ygotScanner.nextInt();

        System.out.print("Please enter your Project Score: ");
        int pS = ygotScanner.nextInt();

        System.out.print("Please enter your Attendance Score: ");
        int aS = ygotScanner.nextInt();

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


public class Students {
    String name;
    String course;
    int age;
    double Grade1;
    double Grade2;
    double Grade3;
    double Grade;



    public Students(String name, String course, int age ) {

        this.name = name;
        this.course = course;
        this.age = age;

        System.out.println("New Student '" + name +"'course" + age +"has been added to your Students list");
    }

    public void displayInfo () {
        System.out.println("Name: " + name);
        System.out.println("course: " +  course);
        System.out.println("age:" + age);

    }


    public void calculateGrades () {

        if ( Grade1 >= 90) {
            System.out.println(" the output will be A");
        }

        if (Grade2 >= 80-89) {
            System.out.println("the output will be B");
        }

        if(Grade3 <= 70-79) {
            System.out.println("the output will be C");
        }

        if ( Grade <= 60-69) {
            System.out.println("the output will be D");
        }else {
            System.out.println(" the letter grade: F Failed");
        }
    }
