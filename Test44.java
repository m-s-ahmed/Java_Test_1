//Problem-2

class Calculator{

	//Adding method
	void add(int n1,int n2,String s){
		int sum=n1+n2;
		System.out.println("Sum is: "+sum);
		}

	void add(float m1,float m2,String s){
		float sum=m1+m2;
		System.out.println("Sum is: "+sum);
		}
	//Subtracting method
	void sub(int n1,int n2,String s){
		int subb=n1-n2;
		System.out.println("Subtraction is: "+subb);
		}

	void sub(float m1,float m2,String s){
		float subb=m1-m2;
		System.out.println("Subtraction is: "+subb);
		}

	//Multiplication method
	void mul(int n1,int n2,String s){
		int mull=n1*n2;
		System.out.println("Multiplication is: "+mull);
		}

	void mul(float n1,float n2,String s){
		float mull=n1*n2;
		System.out.println("Multiplication is: "+mull);
		}

	//Division method
	void div(int n1,int n2,String s){
		int divv=n1/n2;
		System.out.println("Division is: "+divv);
			}

	void div(float n1,float n2,String s){
		float divv=n1/n2;
		System.out.println("Division is: "+divv);
		}
	}

public class Test44{
	public static void main(String[] args){
		Calculator c=new Calculator();

		//Add method calling
		c.add(10,10,"+");
		c.add(10.10f,10.10f,"+");

		System.out.println();

		//Sub method calling
		c.sub(20,10,"-");
		c.sub(20.10f,10.10f,"-");

		System.out.println();

		//Mul method calling
		c.mul(10,10,"*");
		c.mul(10.5f,2.5f,"*");

		System.out.println();

		//Div method calling
		c.div(10,2,"/");
		c.div(20.10f,2.5f,"/");
		}
	}