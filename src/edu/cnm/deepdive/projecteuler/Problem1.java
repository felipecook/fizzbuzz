package edu.cnm.deepdive.projecteuler;

public class Problem1 {

  public static void main(String[] args) {
    System.out.println(fizzBuzzSum(1, 1000));
  }

  public static long fizzBuzzSum(int start, int end) {
    long sum = 0;
    // TODO Iterate from start (inclusive) to end (exclusive); if current value
    //  is divisible by 3 or 5, add it to sum.
    for (int i = start; i < end; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}

/*
Alternate solution for this problem using a ternary operator:

public static String[] fizzBuzz(int start, int end) {
        String[] bins = new String[end - start];
        for (int i = start; i < end; i++)
                 String envelope = (i % 3 == 0) ? "Fizz" : "";
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
 */