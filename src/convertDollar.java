import java.util.Scanner;

public class convertDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Convert convert = new Convert();
			System.out.println("Enter the amount in reais to be converted: ");
			double realValue = sc.nextInt();
			double dollarValue = convert.buyDollar(realValue);
			System.out.printf("Value in Dollar: %.2f", dollarValue);
			sc.close(); 
	}
}
