package com.explodeman.qufinder.controller;


import com.explodeman.qufinder.model.content_parser.ContentParser;
import com.explodeman.qufinder.model.content_parser.CsvContentParser;
import com.explodeman.qufinder.model.file_reader.MyFileReaderBasic;
import com.explodeman.qufinder.model.file_reader.MyFileReader;
import com.explodeman.qufinder.model.item_repository.ItemRepository;
import com.explodeman.qufinder.model.item_repository.item_file_repository.ItemFileRepository;
import com.explodeman.qufinder.view.View;
import com.explodeman.qufinder.view.ViewConsole;

import java.io.File;

public class MainFromFile {
  public static void main(String[] args){
    View view = new ViewConsole();
    String path = new File("").getAbsolutePath();
    String fileName = path + "\\resource\\items.csv";
    MyFileReader myFileReader = new MyFileReaderBasic(fileName);
    ContentParser contentParser = new CsvContentParser("#", 2);
    ItemRepository repository = new ItemFileRepository(myFileReader, contentParser);
    Application app = new Application(view, repository);
    app.start();
  }
}
