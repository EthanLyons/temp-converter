package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean repeat;

    do {
      double f;
      double c;
      System.out.print("Enter a temperature in fahrenheit");
      f = input.nextDouble();
      c = (f - 32) * 5 / 9;
      System.out.println(c);
      System.out.print("Convert another?(True/False)? ");
      repeat = input.nextBoolean();
    } while (repeat);
  }
}
