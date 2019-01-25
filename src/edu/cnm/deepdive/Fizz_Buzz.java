package edu.cnm.deepdive;

public class Fizz_Buzz {

  public static void main(String[] args) {
    String[] computedValues = fizzBuzz(1, 101);
    for (String value: computedValues) {
      System.out.println(value);
    }
  }

  public static String[] fizzBuzz(int start, int end) {
    String[] bins = new String[end - start];
    for (int i = start; i < end; i++) {
      String envelope;
      if (i % 3 == 0) {
        envelope = "Fizz";
      } else {
        envelope = "";
      }
      if (i % 5 == 0) {
        envelope += "Buzz";
      }
      if (envelope.isEmpty()) {
        envelope += i;
      }
      bins[i - start] = envelope;
    }
    return bins;
  }


}
