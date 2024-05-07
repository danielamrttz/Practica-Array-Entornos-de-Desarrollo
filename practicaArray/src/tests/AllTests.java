package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestMaxima.class, testMedia.class, TestMediana.class, TestMinima.class })
public class AllTests {

}
