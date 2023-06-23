package name.seguri.java.elephantcarpaccioexercise;

import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

record Item(double price, int quantity, String state, MonetaryAmount finalPrice) {
  Item(final double price, final int quantity, final String state) {
    this(price, quantity, state, Money.of(price * quantity, "USD"));
  }

  public Item withFinalPrice(final MonetaryAmount finalPrice) {
    return new Item(price, quantity, state, finalPrice);
  }
}
