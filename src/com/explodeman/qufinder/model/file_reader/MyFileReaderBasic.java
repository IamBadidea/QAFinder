package com.explodeman.qufinder.model.file_reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReaderBasic implements MyFileReader {
  private final String fileName;

  public MyFileReaderBasic(String fileName) {
    this.fileName = fileName;
  }

  public List<String> read() {
    List<String> strings = new ArrayList<>();
    try {
      java.io.FileReader fr = new java.io.FileReader(fileName);
      Scanner scan = new Scanner(fr);
      while (scan.hasNextLine()) {
        strings.add(scan.nextLine());
      }
      fr.close();
    } catch (IOException ex) {
      throw new IllegalArgumentException("read file error: " + fileName);
    }

    return strings;
  }

}
