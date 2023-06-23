package name.seguri.java.elephantcarpaccioexercise;

public class TaxDecorator implements ItemDecorator {

  @Override
  public Item decorate(final Item item) {
    return item.withFinalPrice(item.finalPrice().multiply(taxRate(item.state())));
  }

  private double taxRate(final String state) {
    return switch (state) {
      case "UT" -> 1.0685;
      case "NV" -> 1.08;
      case "TX" -> 1.0625;
      case "AL" -> 1.04;
      case "CA" -> 1.0825;
      default -> 1.0;
    };
  }
}
