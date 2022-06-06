package Event;

import java.util.Scanner;

public class EventDetails {

	public static void main(String[] args) {
		String nameOfTheEvent;
		String typeOfTheEvent;
		int numberOfPeopleExpected;
		char itIsAPaidEntry;
		double projectExpensesForTheEvent;
		
		Scanner sc = new Scanner (System.in);
	    System.out.print ("Enter the name of event");
	    nameOfTheEvent=sc.nextLine();
	    
	    System.out.print ("Enter the type of the event");
	    typeOfTheEvent=sc.nextLine();
	    
	    System.out.print ("Enter the number of people expected");
	    numberOfPeopleExpected=sc.nextInt();
	    
	    System.out.print ("It is a paid entry?(Type Y or N)");
	     itIsAPaidEntry =sc.next().charAt(0);
	    
	    System.out.print ("Enter thr projected expenses( in lakhs) for this event");
	    projectExpensesForTheEvent=sc.nextDouble();
	    
	    
	    
	    System.out.print ("Event Name:" +nameOfTheEvent+"\n");
	    System.out.print ("Event Type:" +typeOfTheEvent+"\n");
	    System.out.print ("Expected Count:" +numberOfPeopleExpected+"\n");
	    System.out.print ("Paid Entry:" +itIsAPaidEntry+"\n");
	    System.out.print ("Projected Expense:" +projectExpensesForTheEvent+"L"+"\n");
	    
	    

	}

}
