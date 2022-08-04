import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntrinsicValue {
	static double opCashminus2;
	static double opCashminus1;
	static double opCashCurrent;
	static double capEx2;
	static double capEx1;
	static double capExCurrent;
	static double growthRate1;
	static double growthRate2;
	static double a;
	static double b;
	static double fifthCash;
	static double tenthCash;
	static double terminalValue;
	static double terminalGrowthRate;
	static double discountRate;

	public static void averageOperatingCashFlow() {
		System.out.println("Enter the last three years Operating Cash: ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 years before Operating Cash");
		opCashminus2 = s.nextDouble();
		System.out.println("Enter last year  Operating Cash");
		opCashminus1 = s.nextDouble();
		System.out.println("Enter current year  Operating Cash");
		opCashCurrent = s.nextDouble();
		a = (opCashminus2 + opCashminus1 + opCashCurrent) / 3;
		s.close();

	}

	public static void averageCapitalExpenditure() {
		System.out.println("Enter the last three years Capital Expenditure: ");
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 2 years before Capital Expenditure: ");
		capEx2 = s.nextDouble();
		System.out.println("Enter last year Capital Expenditure: ");
		capEx1 = s.nextDouble();
		System.out.println("Enter current year Capital Expenditure: ");
		capExCurrent = s.nextDouble();
		b = (capEx2 + capEx1 + capExCurrent) / 3;
		s.close();

	}

	public static void rate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the growth rate for first five years");
		growthRate1 = sc.nextDouble();
		System.out.println("Enter the growth rate for first last years");
		growthRate2 = sc.nextDouble();
		System.out.println("Enter the terminal growth rate for first five years");
		terminalGrowthRate = sc.nextDouble();
		System.out.println("Enter the discount  rate for first five years");
		discountRate = sc.nextDouble();

	}

	public static void FCF() {
		System.out.println("The future cash flow is as follows: ");
		for (int i = 1; i <= 5; i++) {
			double sum = a * Math.pow((1 + growthRate1), i);
			System.out.println("The future cash flow for " + i + "th year is " + sum);

		}
		fifthCash = a * Math.pow((1 + growthRate1), 5);

		for (int i = 6; i <= 10; i++) {
			System.out.println(
					"The future cash flow for " + i + "th year is " + fifthCash * Math.pow((1 + growthRate1), i));
		}
		tenthCash = a * Math.pow((1 + growthRate1), 10);

		terminalValue = tenthCash * (1 + terminalGrowthRate) / ((discountRate - terminalGrowthRate) / 100);

	}

	public static void main(String[] args) {
		List list = new ArrayList<>();

		averageOperatingCashFlow();
		averageCapitalExpenditure();
		rate();

		FCF();

	}

}
