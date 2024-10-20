//Assignment-1 = Fruit and Vegetable management system
//Mehedi+Dhrubo
import java.util.ArrayList;
import java.util.Scanner;

class Item{
	String name;
	String type;
	double price;
	int quantity;

	Item(String name, String type, double price,int quantity){
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		}

	 String getName(){
			return name;
		}
	String getType(){
			return type;
		}
	double getPrice(){
			return price;
		}
	void setQuantity(int q){
			quantity=quantity+q;
		}
	int getQuantity(){
			return quantity;
		}

	}

class Inventory{
	Scanner scanner=new Scanner(System.in);
	ArrayList<Item>itemList=new ArrayList<Item>();

	void addItem(Item item){
		itemList.add(item);
		}
	void displayItems(){
		for(Item item:itemList){
			System.out.print("Item Name: ");
			System.out.println(item.getName());
			System.out.print("Item Type: ");
			System.out.println(item.getType());
			System.out.print("Item Price: ");
			System.out.println(item.getPrice());
			System.out.print("Item Quantity: ");
			System.out.println(item.getQuantity());
			System.out.println();
			}
		}
	void categoryWiseDisplay(){
		System.out.println("----Fruit items are----");
		for(Item item:itemList){
			if(item.getType().equalsIgnoreCase("Fruit")){
				System.out.print("Item Name: ");
				System.out.println(item.getName());
				System.out.print("Item Type: ");
				System.out.println(item.getType());
				System.out.print("Item Price: ");
				System.out.println(item.getPrice());
				System.out.print("Item Quantity: ");
				System.out.println(item.getQuantity());
				System.out.println();
				}
			}
		System.out.println("----Vegetable items are----");
		for(Item item:itemList){
			if(item.getType().equalsIgnoreCase("Vegetable")){
				System.out.print("Item Name: ");
				System.out.println(item.getName());
				System.out.print("Item Type: ");
				System.out.println(item.getType());
				System.out.print("Item Price: ");
				System.out.println(item.getPrice());
				System.out.print("Item Quantity: ");
				System.out.println(item.getQuantity());
				System.out.println();
				}
			}
		}
	void search_item(){
		System.out.println("Which item you want to search: ");
		String name=scanner.next();
		for(Item item:itemList){
			if(item.getType().equalsIgnoreCase(name)){
				System.out.print("Item Name: ");
				System.out.println(item.getName());
				System.out.print("Item Type: ");
				System.out.println(item.getType());
				System.out.print("Item Price: ");
				System.out.println(item.getPrice());
				System.out.print("Item Quantity: ");
				System.out.println(item.getQuantity());
				System.out.println();
				}
			}
		}
	void purchase_sell(){
		System.out.println("Select the number what you want to do \n1.Purchase\n2.Sell");
		int choice=scanner.nextInt();
		System.out.println("Which item ");
		String itemchoice=scanner.next();
		for(Item item:itemList){
			if(item.getName().equalsIgnoreCase(itemchoice)){
				if(choice==1){
				System.out.println("Enter quantity: ");
				int q=scanner.nextInt();
				item.setQuantity(q);
				return;
				}
				else if(choice==2){
				System.out.println("Enter Quantity: ");
				int q=scanner.nextInt();
				item.setQuantity((-1)*q);
				return;
				}
				else{
				System.out.println("You entered invalid choice");
				}
			}
		}
	}
}

//Testing part

class JavaAssignment1{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Inventory in=new Inventory();

		System.out.println("Number of item you want to add in inventory: ");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++){
			System.out.println("Please enter the "+ i +" item name: ");
			String iname=scanner.next();
			System.out.println("Please enter the "+ i +"item type: ");
			String itype=scanner.next();
			System.out.println("Please enter the "+ i +"item price: ");
			double iprice=scanner.nextDouble();
			System.out.println("Please enter the "+ i +"item quantity: ");
			int iquantity=scanner.nextInt();

			//inventory object create kore tar moddhe in koriye dibo
			in.addItem(new Item(iname,itype,iprice,iquantity));
			}
		in.displayItems();
		in.categoryWiseDisplay();
		in.search_item();
		in.purchase_sell();
		System.out.println("After purchase or sell inventory updated list are : ");
		in.displayItems();
		}
	}


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



//Assignment 3
//Creating Vehicle Class
//Me

class Vehicle{
	//Instance variable for vehicle class
	String brand;
	String model;
	int year;

	//Vehicle  class constructor
	Vehicle(String brand, String model, int year){
			this.brand=brand;
			this.model=model;
			this.year=year;
		}

	//Method for print
	void displayVehicleDetails(){
			System.out.println("Brand: "+brand);
			System.out.println("Model: "+model);
			System.out.println("Year: "+year);
		}
}

//Creating car class which extends parent class Vehicle
class Car extends Vehicle{
		//Instance variable for car class
		String color;
		int numdoor;

		//Car class constructor
		Car(String brand,String model,int year,String color,int numdoor){

			//Taking parent class instance varible using super keyword
			super(brand,model,year);
			this.color=color;
			this.numdoor=numdoor;
		}

		//Method for print which is overloaded method
		void displayVehicleDetails(String color){

				//parent class print method call using super keyword
				super.displayVehicleDetails();
				System.out.println("Color: "+color);
				System.out.println("Number of door: "+numdoor);

			}
	}

//Truck Class

class Truck extends Vehicle{
		//Instance variable for Truck class
		int wheel;

		//Truck class constructor
		Truck(String brand, String model, int year, int wheel){
				super(brand,model,year);
				this.wheel=wheel;
			}

		//Method for print which are overloaded
		void displayVehicleDetails(int wheel){
				super.displayVehicleDetails();
				System.out.println("Number of wheels are: "+wheel);
			}
	}

//Bike class

class Bike extends Vehicle{
		//Instance variable for Bike class
		int wheel;
		int cc;

		//Bike class constructor
		Bike(String brand, String model, int year, int wheel, int cc){
				super(brand,model,year);
				this.wheel=wheel;
				this.cc=cc;
			}

		//Method for print which are overloaded
		void displayVehicleDetails(int cc){
				super.displayVehicleDetails();
				System.out.println("Number of wheels are: "+wheel);
				System.out.println("CCs are: "+cc);
			}
	}


//For testing part

public class JavaAssignment3{
	public static void main(String[] args){

		//Object of Car class
		Car car1=new Car("Toyota","Version2",2010,"Black",4);
		car1.displayVehicleDetails();
		car1.displayVehicleDetails("Black");

		System.out.println();

		//Object for Truck Class
		Truck truck1=new Truck("Mahindra","AB-10",2015,10);
		truck1.displayVehicleDetails();
		truck1.displayVehicleDetails(10);

		System.out.println();

		//Object for Bike class
		Bike bike1=new Bike("Yamaha","FZ-S",2022,2,150);
		bike1.displayVehicleDetails();
		bike1.displayVehicleDetails(150);


	}
}