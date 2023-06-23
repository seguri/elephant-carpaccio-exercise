package name.seguri.java.elephantcarpaccioexercise;

record Item(double price, int quantity, String state, double finalPrice) {
  Item(final double price, final int quantity, final String state) {
    this(price, quantity, state, price * quantity);
  }

  public Item withFinalPrice(final double v) {
    return new Item(price, quantity, state, v);
  }
}
