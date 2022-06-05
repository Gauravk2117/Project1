package Event;

import java.util.Scanner;

public class EventDetails {

	public static void main(String[] args) {
		String s;
		String a;
		int b;
		
		Scanner sc = new Scanner (System.in);
	    System.out.print ("Enter the name of event");
	    s=sc.nextLine();
	    
	    System.out.print ("Enter the type of the event");
	    a=sc.nextLine();
	    
	    System.out.print ("Enter the number of people expected");
	    b=sc.nextInt();
	    
	    System.out.print ("It is a paid entry?(Type Y or N)");
	    char c =sc.next().charAt(0);
	    
	    System.out.print ("Enter thr projected expenses( in lakhs) for this event");
	    double d=sc.nextDouble();
	    
	    
	    
	    System.out.print ("Event Name:" +s+"\n");
	    System.out.print ("Event Type:" +a+"\n");
	    System.out.print ("Expected Count:" +b+"\n");
	    System.out.print ("Paid Entry:" +c+"\n");
	    System.out.print ("Projected Expense:" +d+"L"+"\n");
	    
	    

	}

}
