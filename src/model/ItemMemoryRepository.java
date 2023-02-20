package model;

import java.util.ArrayList;
import java.util.List;

public class ItemMemoryRepository implements ItemRepository {

  private static List<Item> items = createItems();

  @Override
  public List<Item> findByFilter(String find) {
    String findLc = find.toLowerCase();
    List<Item> result = new ArrayList<>();
    for (Item item : items) {
      if (item.getQuestion().toLowerCase().contains(findLc)) {
        result.add(item);
      }
    }
    return result;
  }

  private static List<Item> createItems() {
    List<Item> items = new ArrayList<>();
    items.add(new Item("Кот?", "Да"));
    items.add(new Item("Алексей", "Филипп"));
    items.add(new Item("Ирек", "Сергей"));
    items.add(new Item("Сколько будет 1 + 1", "2"));
    items.add(new Item("Сколько будет 2 + 2", "4"));
    return items;
  }
}
