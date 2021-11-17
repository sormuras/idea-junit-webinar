package test.base.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.base.demo.ModuleDemo;

class ModuleTests {

  @Test
  void moduleNameIsTestBase() {
    var expected = "test.base";
    var actual = ModuleDemo.class.getModule().getName();
    Assertions.assertEquals(expected, actual);
  }
}
