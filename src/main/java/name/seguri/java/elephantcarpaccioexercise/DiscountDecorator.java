package name.seguri.java.elephantcarpaccioexercise;

public class DiscountDecorator implements ItemDecorator {
  @Override
  public Item decorate(final Item item) {
    return item.withFinalPrice(item.finalPrice() * (1 - discountRate(item.finalPrice())));
  }

  private double discountRate(final double price) {
    if (price >= 50000) {
      return 0.15;
    } else if (price >= 10000) {
      return 0.10;
    } else if (price >= 7000) {
      return 0.07;
    } else if (price >= 5000) {
      return 0.05;
    } else if (price >= 1000) {
      return 0.03;
    } else {
      return 0.0;
    }
  }
}
