package diego;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TiangleTestException.class, TriangleTestParameterized.class })
public class AllTests {
}
