package test.base.jupiter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
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
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(strings = {"test.base.demo", "test.base.jupiter"})
  void checkIfPackageNameIsPresent(String name) {
    var actual = getClass().getModule().getDescriptor().packages();
    assertTrue(actual.contains(name), actual.toString());
  }

  @Nested
  class TestAssertJ {
    @Test
    void moduleNameIsTestBase() {
      var expected = "test.base";
      var actual = getClass().getModule().getName();
      assertThat(actual).isEqualTo(expected);
    }
  }
}
