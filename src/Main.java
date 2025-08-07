public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Jose", 20, "BSIT", 90, 85, 88);
        Student s2 = new Student("Enrique", 19, "BSIT", 70, 72, 68);
        Student s3 = new Student("Kyrie", 21, "BSIT", 55, 60, 58);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            System.out.println("");
            s.displayInfo();
            double avg = s.calculateAverage();
            System.out.printf("Average Grade : %.2f\n", avg);
            System.out.println("Letter Grade  : " + s.getLetterGrade());
            System.out.println("Status        : " + (s.isPassing() ? "PASSING" : "FAILING"));
            if (s.isPassing()) {
                passingCount++;
            }
            System.out.println("");
        }


        System.out.println("Summary:");
        System.out.println("Total students passing: " + passingCount + " out of " + students.length);
    }
}
