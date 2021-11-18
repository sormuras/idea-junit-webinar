package test.base.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(test.base.demo.HelloDemo.class)
class HelloSuite {}
