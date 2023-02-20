package model;

import java.util.List;

public interface ItemRepository {
  List<Item> findByFilter(String find);
}
