import java.util.Scanner;

public class ConvertDollar {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Convert convert = new Convert();
				
				System.out.println("Enter the amount in reais to be converted: ");
					String realValueString = sc.nextLine();
				
				System.out.println("Value of the dollar today: ");
					String dollarQuoteString = sc.nextLine();
					
					
				double realValue;
			    double dollarQuote;
			    try {
			    	realValue = Double.parseDouble(realValueString.replace(",", "."));
			    	dollarQuote = Double.parseDouble(dollarQuoteString.replace(",", "."));
			    } catch (NumberFormatException e){
			    	System.out.println("Invalid input. Please enter numbers only.");
			        return;
			    }
				
			    double dollarValue = convert.buyDollar(realValue, dollarQuote);
				System.out.printf("Value in Dollar: %.2f", dollarValue);
		}	
			
	}
}
