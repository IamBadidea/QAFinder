package model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractItemRepository implements ItemRepository{


  public AbstractItemRepository() {
  }

  @Override
  public List<Item> findByFilter(String find) {
    String findLc = find.toLowerCase();
    List<Item> result = new ArrayList<>();
    for (Item item : getItems()) {
      if (item.getQuestion().toLowerCase().contains(findLc)) {
        result.add(item);
      }
    }
    return result;
  }

  protected abstract List<Item> getItems();
}
