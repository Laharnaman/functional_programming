package fpij;

import java.math.BigDecimal;
import static fpij.BobPrices.prices2;
import static fpij.BobPrices.prices;

public class BobDiscountFunctional {

	public static void main(String[] args) {

		BigDecimal discountedPriceTotal = prices2.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(discountedPriceTotal);
		
		// throws runtime java.lang.UnsupportedOperationException prices2.add(new BigDecimal("99"));
		
		BigDecimal discountedPriceTotal2 = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(discountedPriceTotal2);
		 // also throws runtime java.lang.UnsupportedOperationException prices.add(new BigDecimal("99"));
	}

}
