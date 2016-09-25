package base;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TuitionCalc {
	public static void main (String[] args) {
		DecimalFormat money = new DecimalFormat("$0,000.00");
		Scanner s = new Scanner(System.in);
		System.out.println("What's the tuition for year 1?");
		double tuition = s.nextDouble();
		double sum = tuition;
		for (int years = 2; years < 5; years++) {
			System.out.println("You pay " + money.format(tuition) +".");
			System.out.println("What's the percent increase for year " + years + "?");
			tuition *= ((s.nextDouble())/100 + 1);
			sum += tuition;
		}
		System.out.println("You pay " + money.format(sum) + " in total. Congrats!");
		s.close();
		return;
	}
	
}