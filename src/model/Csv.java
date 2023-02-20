package model;

import java.util.LinkedList;
import java.util.List;

public class Csv {

  private Csv(){}

  public static List<String[]> convert(List<String> strings, String delimiter){
    List<String[]> result = new LinkedList<>();
    for (String string : strings) {
      String[] array = string.split(delimiter);
      result.add(array);
    }
    return result;
  }
}
