package at.bals.swing.calculator;

public class Converter {
	private double DOLLAR_EXCHANGE_RATE = 1.38;
	private double FRANCS_EXCHANGE_RATE = 1.42;
	public static final String DOLLAR = "Dollar";
	public static final String FRANCS = "Francs";

	public double convert(int iVal, String currency) {

		switch (currency) {
		case DOLLAR:
			return iVal * DOLLAR_EXCHANGE_RATE;

		case FRANCS:
			return iVal * FRANCS_EXCHANGE_RATE;

		default:
			return iVal;
		}
	}
}
