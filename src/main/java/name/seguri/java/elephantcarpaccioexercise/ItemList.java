package name.seguri.java.elephantcarpaccioexercise;

import java.util.List;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

record ItemList(List<Item> items) {
  public MonetaryAmount finalPrice() {
    return items.stream()
        .map(item -> new TaxDecorator().decorate(item))
        .map(item -> new DiscountDecorator().decorate(item))
        .map(Item::finalPrice)
        .reduce(Money.of(0, "USD"), MonetaryAmount::add);
  }
}
