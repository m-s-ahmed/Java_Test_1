//Assignment-2 = Student information system
//Me

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String studentId;
	String name;
	String grade;
	double gpa;

	Student(String studentId,String name,String grade,double gpa){
		this.studentId=studentId;
		this.name=name;
		this.grade=grade;
		this.gpa=gpa;
		}
	String getStudentId(){
		return studentId;
		}
	String getName(){
		return name;
		}
	String getGrade(){
		return grade;
		}
	double getGpa(){
		return gpa;
		}

	void setGrade(String grade){
		this.grade=grade;
		}
	void setGpa(double gpa){
		this.gpa=gpa;
		}

	void displayInformation(){
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+name);
		System.out.println("Student Grade: "+grade);
		System.out.println("Student Gpa: "+gpa);
		}
	}

class StudentDatabase{
	ArrayList<Student>studentlist=new ArrayList<Student>();

	//Method to add a student to the database
	void addNew(Student s){
		studentlist.add(s);
		System.out.println("Student " + s.getName() + "added to the database.");
		}
	//Method to display all the students in the database
	void displayAllStudents(){

	if(studentlist.isEmpty()){
		System.out.println("No student in the database.");
		}
	else{
		for(Student s:studentlist){
			s.displayInformation();
			}
		}
	}

	void searchStudentById(String studentId){
		boolean found=false;
		for(Student s:studentlist){
			if(s.getStudentId().equalsIgnoreCase(studentId)){
				System.out.println("Student found: ");
				s.displayInformation();
				found=true;
				break;
				}
			}
		if(!found){
			System.out.println("Student with Id" + studentId + "not found.");
			}
		}
}

public class JavaAssignment2{
	public static void main(String[] args){
		StudentDatabase studentdatabase=new StudentDatabase();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do{
			System.out.println("---Student Information System---");
			System.out.println("1. Add a new student");
			System.out.println("2. Display all students");
			System.out.println("3. Search for a student by ID");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
			     case 1:
			     		// Add a new student
			            System.out.print("Enter Student ID: ");
			            String studentID = scanner.nextLine();

			            System.out.print("Enter Student Name: ");
			            String name = scanner.nextLine();

			            System.out.print("Enter Grade (A/B/C/D): ");
			            String grade = scanner.nextLine();

			            System.out.print("Enter GPA: ");
			            double gpa = scanner.nextDouble();

			            Student student = new Student(studentID, name, grade, gpa);
			            studentdatabase.addNew(student);
			            break;

			    case 2:
			            // Display all students
			            studentdatabase.displayAllStudents();
			            break;

			    case 3:
			           // Search for a student by ID
			           System.out.print("Enter Student ID to search: ");
			           String searchID = scanner.nextLine();
			           studentdatabase.searchStudentById(searchID);
			           break;

			    case 4:
			            // Exit the program
			            System.out.println("Exiting the system. Goodbye!");
			            break;

			   default:
			            System.out.println("Invalid choice. Please try again.");
			            }

			        } while (choice != 4);

			        scanner.close();
			    }
			}



