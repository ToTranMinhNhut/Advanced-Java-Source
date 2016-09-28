package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JUnitestCountEmployeeHaveSalaryHigherX.class,
        JUnitGetAverageSalary.class,
        JUnitTestCountEmployeeHaveXStringInFullName.class,
        JUnitTestGetAverageAgeEmployee.class, JUnitTestGetMaximumSalary.class,
        JUnitTestGetMinimumSalary.class })
public class JUnitTestsSuiteEmployees {

}
