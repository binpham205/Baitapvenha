
package nhap;
import java.util.Scanner;
public class Processor {
    
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. add student:");
            System.out.println("2. update student by ID::");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Show all students:");
            System.out.println("5. Student with highest GPA:");
            System.out.println("6. Exit:");
            System.out.print("Enter your selection: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudentById();
                    break;
                case 3:
                    studentList.deleteStudentById();
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    studentList.findTopStudent();
                    break;
                case 6:
                    System.out.println("End of program.");
                    break;
                default:
                    System.out.println("Invalid selection. Please select again..");
            }
        } while (choice != 6);
    }
}

