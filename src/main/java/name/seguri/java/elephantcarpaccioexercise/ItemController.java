package name.seguri.java.elephantcarpaccioexercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
  private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

  @PostMapping("/items")
  public String processItemList(@RequestBody final ItemList itemList) {
    final var finalPrice = itemList.finalPrice();
    logger.info("{}", itemList);
    logger.info("{}", finalPrice);
    return String.valueOf(finalPrice);
  }
}
