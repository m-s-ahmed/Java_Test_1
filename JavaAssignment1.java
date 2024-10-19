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