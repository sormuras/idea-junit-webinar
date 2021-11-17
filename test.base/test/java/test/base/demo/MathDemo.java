package test.base.demo;

public class MathDemo {
  public static void main(String[] args) {
    if (Math.abs(-1000) < 0) {
      throw new AssertionError("Unexpected");
    }
    System.out.println("MathDemo");
  }
}
