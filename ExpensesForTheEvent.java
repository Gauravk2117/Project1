package Event;

import java.util.Scanner;

public class ExpensesForTheEvent {

	public static void main(String[] args) {
		
		double sum;
		double brandingExpenses;
		double travelExpenses;
		double foodExpenses;
		double logisticsExpenses;
		float percentageOfBrandingExpenses;
		float percentageOfTravelExpenses;
		float percentageOfFoodExpenses;
		float percentageOfLogisticsExpenses;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter branding expenses");
	    brandingExpenses=sc.nextDouble();
	    
	    System.out.print ("Enter travel expenses");
	    travelExpenses=sc.nextDouble();
	    
	    System.out.print ("Enter food expenses");
	    foodExpenses=sc.nextDouble();
	    
	    System.out.print ("Enter logistics expenses");
	    logisticsExpenses=sc.nextDouble();
	    
	    sum=brandingExpenses+travelExpenses+foodExpenses+logisticsExpenses;
	    percentageOfBrandingExpenses=(float) (brandingExpenses/sum*100);
	    percentageOfTravelExpenses=(float) (travelExpenses/sum*100);
	    percentageOfFoodExpenses=(float) (foodExpenses/sum*100);
	    percentageOfLogisticsExpenses=(float) (logisticsExpenses/sum*100);
	    
	    
	   
	    
	    System.out.print ("Total Expenses: Rs." +sum+"\n");
	    
	    System.out.print ("Branding expenses percentage:" +percentageOfBrandingExpenses+"%"+"\n");
	    System.out.print ("Travel expenses percentage:" +percentageOfTravelExpenses+"%"+"\n");
	    System.out.print ("Food expenses percentage:" + percentageOfFoodExpenses+"%"+"\n");
	    System.out.print ("Logistics expenses percentage:" + percentageOfLogisticsExpenses+"%"+"\n");

	}

}
