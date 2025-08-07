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

student.java

public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;

        System.out.println("New Student '" + name + "' (" + course + ", Age " + age + ") has been added.\n");
    }

    public void displayInfo() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}

 main.java 
     
public class Main {
    public static void main(String[] args) {
        // Create 3 Student objects
        Student s1 = new Student("Alice", 20, "BSIT", 90, 85, 88);
        Student s2 = new Student("Bob", 19, "BSCS", 70, 72, 68);
        Student s3 = new Student("Charlie", 21, "BSIS", 55, 60, 58);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            System.out.println("====================================");
            s.displayInfo();
            double avg = s.calculateAverage();
            System.out.printf("Average Grade : %.2f\n", avg);
            System.out.println("Letter Grade  : " + s.getLetterGrade());
            System.out.println("Status        : " + (s.isPassing() ? "PASSING" : "FAILING"));
            if (s.isPassing()) {
                passingCount++;
            }
            System.out.println("====================================\n");
        }

        // Display summary
        System.out.println("Summary:");
        System.out.println("Total students passing: " + passingCount + " out of " + students.length);
    }
}
