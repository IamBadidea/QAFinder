package controller;

import java.util.List;
import model.Item;
import model.ItemRepository;
import view.View;

public class Application {

  private View view;
  private ItemRepository repository;

  private static final String EXIT = "0";

  public Application(View view, ItemRepository repository) {
    this.view = view;
    this.repository = repository;
  }

  public void start() {
    view.output("Для выхода из программа введите " + EXIT);

    while (true) {
      view.output("Введите строку для поиска");
      String userInput = view.input();
      if (userInput.equalsIgnoreCase(EXIT)) {
        break;
      }
      List<Item> items= repository.findByFilter(userInput);
      printItems(items);
    }
    view.output("Программа завершена! Прощайте!");
  }

  private void printItems(List<Item> items) {
    if (items.isEmpty()) {
      view.output("Ничего не найдено, но вы держитесь тут!\n");

      return;
    }


    for (Item item : items) {
      view.output("Вопрос: " + item.getQuestion());
      view.output("Ответ:  " + item.getAnswer());
      view.output("");
    }
  }


}
