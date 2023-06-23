package name.seguri.java.elephantcarpaccioexercise;

import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

public class DiscountDecorator implements ItemDecorator {
  private static final MonetaryAmount FIFTY_THOUSAND = Money.of(50000, "USD");
  private static final MonetaryAmount TEN_THOUSAND = Money.of(10000, "USD");
  private static final MonetaryAmount SEVEN_THOUSAND = Money.of(7000, "USD");
  private static final MonetaryAmount FIVE_THOUSAND = Money.of(5000, "USD");
  private static final MonetaryAmount ONE_THOUSAND = Money.of(1000, "USD");

  @Override
  public Item decorate(final Item item) {
    return item.withFinalPrice(discountRate(item.finalPrice()));
  }

  private MonetaryAmount discountRate(final MonetaryAmount finalPrice) {
    if (finalPrice.isGreaterThanOrEqualTo(FIFTY_THOUSAND)) {
      return finalPrice.multiply(0.85);
    } else if (finalPrice.isGreaterThanOrEqualTo(TEN_THOUSAND)) {
      return finalPrice.multiply(0.9);
    } else if (finalPrice.isGreaterThanOrEqualTo(SEVEN_THOUSAND)) {
      return finalPrice.multiply(0.93);
    } else if (finalPrice.isGreaterThanOrEqualTo(FIVE_THOUSAND)) {
      return finalPrice.multiply(0.95);
    } else if (finalPrice.isGreaterThanOrEqualTo(ONE_THOUSAND)) {
      return finalPrice.multiply(0.97);
    } else {
      return finalPrice;
    }
  }
}
