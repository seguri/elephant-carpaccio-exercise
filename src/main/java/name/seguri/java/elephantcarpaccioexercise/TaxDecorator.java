package name.seguri.java.elephantcarpaccioexercise;

public class TaxDecorator implements ItemDecorator {

  @Override
  public Item decorate(final Item item) {
    return item.withFinalPrice(item.finalPrice() * (1 + taxRate(item.state())));
  }

  private double taxRate(final String state) {
    return switch (state) {
      case "UT" -> 0.0685;
      case "NV" -> 0.08;
      case "TX" -> 0.0625;
      case "AL" -> 0.04;
      case "CA" -> 0.0825;
      default -> 0.0;
    };
  }
}
