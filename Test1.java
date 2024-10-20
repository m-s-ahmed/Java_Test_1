//Problem-1:

class Student{
	String name;
	int age;
	String grade;

	//Default Constructor
	Student(){
		this.name="Unknown";
		this.age=00;
		this.grade="Undefinied";
		}

	//Parameterized Constructor
	Student(String name,int age, String grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
		}

	//Display Student Details
	void displayInformation(){
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Grade: "+grade);
		}

}




public class Test1{
	public static void main(String[] args){
		//Object create with default constructor and display them
		Student st1=new Student();
		st1.displayInformation();

		System.out.println();

		//Object create with parameterized constructor and display them
		Student st2=new Student("Md.Sajid Ahmed",23,"A+");
		st2.displayInformation();

		}
}