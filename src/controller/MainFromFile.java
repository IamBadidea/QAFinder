package controller;

import java.io.File;
import model.ItemFileRepository;
import model.ItemRepository;
import view.View;
import view.ViewConsole;

public class MainFromFile {
  public static void main(String[] args){
    View view = new ViewConsole();
    String path = new File("").getAbsolutePath();
    String fileName = path + "\\resource\\items.txt";
    ItemRepository repository = new ItemFileRepository(fileName);
    Application app = new Application(view, repository);
    app.start();
  }
}
