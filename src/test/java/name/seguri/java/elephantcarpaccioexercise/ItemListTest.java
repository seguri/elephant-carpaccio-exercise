package name.seguri.java.elephantcarpaccioexercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ItemListTest {
  @Test
  void test() {
    final var itemList = new ItemList(List.of(new Item(27099, 978, "UT")));

    assertThat(itemList.finalPrice().toString()).hasToString("USD 24070525.51");
  }
}
