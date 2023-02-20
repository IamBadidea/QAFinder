package model;

import java.util.ArrayList;
import java.util.List;

public class ItemFileRepository extends AbstractItemRepository {


  private final List<Item> items;

  public ItemFileRepository(String fileName) {
    items = createItems(fileName);
  }

  @Override
  protected List<Item> getItems() {
    return items;
  }

  private List<Item> createItems(String fileName) {

    List<Item> items = new ArrayList<>();
    List<String> strings = FileReader.read(fileName);
    List<String[]> list = Csv.convert(strings, "#");
    for (String[] array : list) {
      if (array.length != 2) {
        throw new IllegalArgumentException("Illegal format CSV");
      }
      Item item = new Item(array[0], array[1]);
      items.add(item);
    }
    return items;
  }
}
