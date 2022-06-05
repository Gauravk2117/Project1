package Event;

import java.util.Scanner;

public class TradeFair {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter the total number of people");
		a=sc.nextInt();
		
		 System.out.print ("Number of attendees on day 1: " +(a/3.5)+"\n");
		 System.out.print ("Number of attendees on day 2: " +(a/3.5*2)+"\n");
		 System.out.print ("Number of attendees on day 3: " +(a/3.5/2)+"\n");

	}

}
