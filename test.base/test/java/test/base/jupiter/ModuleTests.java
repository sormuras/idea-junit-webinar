package test.base.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@ExtendWith(Sleep.class)
class ModuleTests {

  @Test
  void moduleNameIsTestBase() {
    var expected = "test.base";
    var actual = getClass().getModule().getName();
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(strings = {"test.base.demo", "test.base.jupiter"})
  void checkIfPackageNameIsPresent(String name) {
    var actual = getClass().getModule().getDescriptor().packages();
    Assertions.assertTrue(actual.contains(name), actual.toString());
  }
}
