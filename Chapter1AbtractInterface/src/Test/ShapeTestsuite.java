package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CircleJUnitTest.class, RectangleJUnitTest.class,
        SquareJUnitTest.class })
public class ShapeTestsuite {

}
