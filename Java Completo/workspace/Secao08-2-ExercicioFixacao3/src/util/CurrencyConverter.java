package util;

public class CurrencyConverter {

	public static double IOF = 1.06;
	public static double dollar;
	public static double dollarQuantity;
	
	public static double amountPaid () {
		
		return dollar * dollarQuantity * IOF;
	}
}
