package Event;

import java.util.Scanner;

public class ExpensesForTheEvent {

	public static void main(String[] args) {
		
		double sum;
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter branding expenses");
	    double a=sc.nextDouble();
	    
	    System.out.print ("Enter travel expenses");
	    double b=sc.nextDouble();
	    
	    System.out.print ("Enter food expenses");
	    double c=sc.nextDouble();
	    
	    System.out.print ("Enter logistics expenses");
	    double d=sc.nextDouble();
	    
	    sum=a+b+c+d;
	    
	    System.out.print ("Total Expenses: Rs." +sum+"\n");
	    
	    System.out.print ("Branding expenses percentage:" +(a/sum*100)+"%"+"\n");
	    System.out.print ("Travel expenses percentage:" +(b/sum*100)+"%"+"\n");
	    System.out.print ("Food expenses percentage:" +(c/sum*100)+"%"+"\n");
	    System.out.print ("Logistics expenses percentage:" +(d/sum*100)+"%"+"\n");

	}

}
