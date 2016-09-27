import java.util.Scanner;
import java.text.DecimalFormat;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How much is the freshman year tuition?");
		double yearOneCost = s.nextDouble();
		
		System.out.println("What is the percent increase in tutition going into the 2nd year?");
		double yearTwoInc = s.nextDouble();
		
		System.out.println("What is the percent increase in tutition going into the 3rd year?");
		double yearThreeInc = s.nextDouble();
		
		System.out.println("What is the percent increase in tutition going into the 4th year?");
		double yearFourInc = s.nextDouble();
		
		double yearTwoCost = yearOneCost*(1+(yearTwoInc/100));
		double yearThreeCost = yearTwoCost*(1+(yearThreeInc/100));
		double yearFourCost = yearThreeCost*(1+(yearFourInc/100));
		
		double totalCost = yearOneCost + yearTwoCost + yearThreeCost + yearFourCost;
		
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println("The total four year cost of tuition is " + money.format(totalCost));
		s.close();
		
	}
}