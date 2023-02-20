package controller;

import model.ItemMemoryRepository;
import model.ItemRepository;
import view.View;
import view.ViewConsole;

public class Main {
  public static void main(String[] args){
    View view = new ViewConsole();
    ItemRepository repository = new ItemMemoryRepository();
    Application app = new Application(view, repository);
    app.start();
  }
}
