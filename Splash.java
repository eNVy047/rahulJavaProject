import java.util.Scanner;

public class GradingSystem {

    // Method to calculate grade based on score
    public static String calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A+";
        } else if (score >= 80 && score < 90) {
            return "A";
        } else if (score >= 70 && score < 80) {
            return "B";
        } else if (score >= 60 && score < 70) {
            return "C";
        } else if (score >= 50 && score < 60) {
            return "D";
        } else if (score >= 0 && score < 50) {
            return "F";
        } else {
            return "Invalid Score";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grading System");
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String studentName = scanner.next();
            System.out.print("Enter the score of " + studentName + ": ");
            int score = scanner.nextInt();

            String grade = calculateGrade(score);
            System.out.println("Student: " + studentName + ", Score: " + score + ", Grade: " + grade);
        }

        scanner.close();
        System.out.println("Thank you for using the Grading System!");
    }
}
