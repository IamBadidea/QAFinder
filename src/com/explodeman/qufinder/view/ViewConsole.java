package com.explodeman.qufinder.view;

import java.util.Scanner;

public class ViewConsole implements View {


  public String input() {
    Scanner sc = new Scanner(System.in);
    return sc.next();
  }


  public void output(String message) {
    System.out.println(message);
  }
}
