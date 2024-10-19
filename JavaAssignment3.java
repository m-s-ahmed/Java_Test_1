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