package ru.zl0dey;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.zl0dey.computing.Computer;

/**
 * Unit test for simple ru.zl0dey.computing.Computer.
 */
public class ComputerTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ComputerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ComputerTest.class);
    }

    /**
     * Return mark "5"
     */
    public void testGetMark5() {
        int mark = Computer.getMark(25);
        assertTrue(mark == 5);

        mark = Computer.getMark(24);
        assertTrue(mark == 5);
    }

    /**
     * Return mark "4"
     */
    public void testGetMark4() {
        int mark = Computer.getMark(26);
        assertTrue(mark == 4);

        mark = Computer.getMark(100);
        assertTrue(mark == 4);

        mark = Computer.getMark(199);
        assertTrue(mark == 4);
    }

    /**
     * Return mark "3"
     */
    public void testGetMark3() {
        int mark = Computer.getMark(200);
        assertTrue(mark == 3);

        mark = Computer.getMark(350);
        assertTrue(mark == 3);

        mark = Computer.getMark(500);
        assertTrue(mark == 3);
    }

    /**
     * Return mark "2"
     */
    public void testGetMark2() {
        int mark = Computer.getMark(501);
        assertTrue(mark == 2);

        mark = Computer.getMark(600);
        assertTrue(mark == 2);
    }
}
