package es.upm.miw.iwvg.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import es.upm.miw.iwvg.junit.solution.DecimalCollectionTest;
import es.upm.miw.iwvg.junit.solution.FractionTest;
import es.upm.miw.iwvg.junit.solution.UserTest;

@RunWith(Suite.class)
@SuiteClasses({
    PointTest.class, 
    DecimalCollectionTest.class,
    FractionTest.class,
    UserTest.class
})
public class AllIwvgJunittests {

}
