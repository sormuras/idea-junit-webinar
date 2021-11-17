package test.base.jupiter;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class Sleep implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

  @Override
  public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
    Thread.sleep(1000);
  }

  @Override
  public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
    Thread.sleep(1000);
  }
}
