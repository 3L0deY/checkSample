package ru.zl0dey;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple ru.zl0dey.StartCount.
 */
public class StartCountTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StartCountTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(StartCountTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
