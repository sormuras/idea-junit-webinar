package test.base.jqwik;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

class PropertyBasedTests {

  @Property
  boolean absoluteValueOfAllNumbersIsPositive(@ForAll int anInteger) {
    return Math.abs(anInteger) >= 0 || anInteger == Integer.MIN_VALUE;
  }
}
