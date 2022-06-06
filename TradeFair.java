package Event;

import java.util.Scanner;

public class TradeFair {

	public static void main(String[] args) {
		
		int totalNumberOfPeople;
		int numberOfAttendeesOnDay1;
		int numberOfAttendeesOnDay2;
		int numberOfAttendeesOnDay3;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter the total number of people");
		totalNumberOfPeople=sc.nextInt();
		
		numberOfAttendeesOnDay1=(int) (totalNumberOfPeople/3.5);
		numberOfAttendeesOnDay2=(int) (totalNumberOfPeople/3.5*2);
		numberOfAttendeesOnDay3=(int) (totalNumberOfPeople/3.5/2);		
		
		
		 System.out.print ("Number of attendees on day 1: " +numberOfAttendeesOnDay1+"\n");
		 System.out.print ("Number of attendees on day 2: " +numberOfAttendeesOnDay2+"\n");
		 System.out.print ("Number of attendees on day 3: " +numberOfAttendeesOnDay3+"\n");

	}

}
