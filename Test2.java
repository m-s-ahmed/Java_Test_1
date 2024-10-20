//Problem-1-part-2
//Aitakeo problem-1-part-1 ar Student class ar moddhe korte hobe. Sir bolse.
class Test2{

	//CalculateFinalGrade method
	 static int calculateFinalGrade(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			}
		return sum;

		//double avg=((double)sum/4);
		//System.out.println("Average Value: "+sum);
		//System.out.println("Average Value: "+avg);
		}

	//CheckPassStatus method
	static void checkPassStatus(double a){
		if(a>=50){
			System.out.println("Passed");
			}
		else {
			System.out.println("Failed");
			}
		}


	//main method
	public static void main(String[] args){
		int a[]={10,20,30,40};

		int summation=calculateFinalGrade(a);
		System.out.println("Summation is: "+summation);

		double average=summation/a.length;
		System.out.println("Average is: "+average);

		checkPassStatus(average);
		}
}
