package name.seguri.java.elephantcarpaccioexercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.List;
import org.junit.jupiter.api.Test;

class ItemListTest {
  @Test
  void test() {
    final var itemList = new ItemList(List.of(new Item(27099, 978, "UT")));

    assertThat(itemList.finalPrice()).isCloseTo(24070526, within(0.5));
  }
}
