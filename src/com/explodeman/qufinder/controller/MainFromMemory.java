package com.explodeman.qufinder.controller;


import com.explodeman.qufinder.model.item_repository.ItemRepository;
import com.explodeman.qufinder.model.item_repository.item_memory_repository.ItemMemoryRepository;
import com.explodeman.qufinder.view.View;
import com.explodeman.qufinder.view.ViewConsole;

public class MainFromMemory {
  public static void main(String[] args){
    View view = new ViewConsole();
    ItemRepository repository = new ItemMemoryRepository();
    Application app = new Application(view, repository);
    app.start();
  }
}
