
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]);
//		double vatRate = 0.1;
		double expenseRate = 0.3;
//		double vat = valueOfSupply*vatRate;0
//		double total = valueOfSupply+vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i=0;
		while(i < dividendRates.length) {
			System.out.println("Dividend: "+(income*dividendRates[i]));
				i=i+1;
		}
		
	}

}
