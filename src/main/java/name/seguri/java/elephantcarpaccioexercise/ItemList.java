package name.seguri.java.elephantcarpaccioexercise;

import java.util.List;

record ItemList(List<Item> items) {
  public double finalPrice() {
    return items.stream()
        .map(item -> new TaxDecorator().decorate(item))
        .map(item -> new DiscountDecorator().decorate(item))
        .mapToDouble(Item::finalPrice)
        .sum();
  }
}
