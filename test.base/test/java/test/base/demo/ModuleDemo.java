package test.base.demo;

public class ModuleDemo {
  public static void main(String[] args) {
    var expected = "test.base";
    var actual = ModuleDemo.class.getModule().getName();

    if (expected.equals(actual)) {
      System.out.println("ModuleDemo");
      return;
    }

    throw new AssertionError("Wrong name?");
  }
}
