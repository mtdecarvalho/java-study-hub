package util_ex_fixacao;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	private static double applyTax(double value) {
		return value * IOF;
	}
	
	public static double convertToReais(double dollarPrice, double dollarQuantity) {
		return (dollarPrice * dollarQuantity) + applyTax(dollarPrice * dollarQuantity);
	}
}
