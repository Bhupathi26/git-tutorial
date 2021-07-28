import java.util.Scanner;
class IncomeTax {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Tax Calculator: " + "---------WELCOME--------");
		System.out.println("Enter Total persons count:");
		 int n1=sc.nextInt();
		 String names[]=new String[100];
		 long incomes[]=new long[100];
		 for(int i=1; i<=n1; i++){
			 System.out.println("Enter name"+ i); 
			 names[i]=sc.next();
			 System.out.println("Enter income"+ i);
			 incomes[i]=sc.nextLong();
		 }	
	
		 for(int i=1; i<=n1;i++){
			 String name=names[i];
			 long income=incomes[i];
			 calculateTax(name,income);
		 }
	}
	public static void calculateTax(String name,long income){
		double tax;
		if(income>=300000){
			tax=0.2*income;
			System.out.println(name+" tax is:"+tax);
		}
		else if(income>=100000 && income<300000)
		{
			tax=0.1*income;
			System.out.println(name+" tax is:"+tax);
		}
		else if(income<100000)
			{
			System.out.println(name+" tax is:"+"0");
		}
		
	}
}
