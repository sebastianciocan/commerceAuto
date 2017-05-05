package suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.CreateAccFuncTest;
import test.LoginFuncTest;
import test.TestTheMenuItems;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateAccFuncTest.class,
        LoginFuncTest.class,
        TestTheMenuItems.class
})
public class TestSuite {
}
