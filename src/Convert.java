
public class Convert {
		private final double dollarQuote = 5.5;
		private final double iof = 0.0586;
		private final double operatingRateInPercentage = 1;
		
		@SuppressWarnings("unused")
		public double buyDollar(double realValue) {
			double dollarValue = realValue / dollarQuote;
			double dollarValueWithIof = dollarValue - (dollarValue * iof);
			double operatingRate = dollarValue * operatingRateInPercentage / 100;
			
			return dollarValueWithIof - operatingRate;
			
	}
		
}
