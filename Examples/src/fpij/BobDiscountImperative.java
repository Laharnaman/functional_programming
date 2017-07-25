package fpij;

import static fpij.Prices.prices;

import java.math.BigDecimal;

public class BobDiscountImperative {

	public static void main(String[] args) {
		BigDecimal discountedPriceTotal = BigDecimal.ZERO;
		for (BigDecimal price : Prices.prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
				discountedPriceTotal =
						discountedPriceTotal.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		System.out.println(discountedPriceTotal);
	}

}
