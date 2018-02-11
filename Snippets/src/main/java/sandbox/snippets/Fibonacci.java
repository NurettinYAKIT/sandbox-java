package sandbox.snippets;

public class Fibonacci {

  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();

    long start = System.currentTimeMillis();
    System.out.println(fib.fib(40));
    long end = System.currentTimeMillis();
    System.out.println("Fib Calculates in : " + (end - start));

    long startm = System.currentTimeMillis();
    System.out.println(fib.fibWithMemo(40));
    long endm = System.currentTimeMillis();
    System.out.println("Fib with mem Calculates in : " + (endm - startm));
  }

  public int fibWithMemo(int i) {
    int memo[] = new int[i + 1];

    // base
    memo[0] = 0;
    memo[1] = 1;

    return calculateWithMemo(i, memo);
  }

  private int calculateWithMemo(int i, int memo[]) {
    if (i == 0) {
      return 0;
    }
    if (i == 1) {
      return 1;
    } else if (memo[i] != 0) {
      return memo[i];
    } else {
      memo[i] = calculateWithMemo(i - 1, memo) + calculateWithMemo(i - 2, memo);
      return memo[i];
    }

  }

  public int fib(int i) {
    if (i <= 0) {
      return 0;
    }
    if (i == 1) {
      return 1;
    }
    return fib(i - 1) + fib(i - 2);
  }

}
