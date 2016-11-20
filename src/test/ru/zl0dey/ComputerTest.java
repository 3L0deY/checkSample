package ru.zl0dey;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ru.zl0dey.computing.AttributeId;
import ru.zl0dey.computing.Computer;
import ru.zl0dey.dto.Attribute;
import ru.zl0dey.dto.AttributeGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple ru.zl0dey.computing.Computer.
 */
public class ComputerTest
        extends TestCase {

    private AttributeGroup group;

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

    protected void setUp() {
        List<Attribute> attributes = new ArrayList<Attribute>();
        attributes.add(new Attribute(AttributeId.START_BOIL, 15.2));
        attributes.add(new Attribute(AttributeId.START_BOIL, 28));
        attributes.add(new Attribute(AttributeId.START_BOIL, 43.8));
        attributes.add(new Attribute(AttributeId.START_BOIL, 26.1));
        attributes.add(new Attribute(AttributeId.START_BOIL, 15.8));
        attributes.get(2).setOutSelection(true);
        attributes.get(4).setOutSelection(true);
        group = new AttributeGroup();
        group.setGroupedAttributes(attributes);
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

    public void testCheckSelectionSize() {
        int selectionSize = Computer.getSelectionSize(group);
        assertTrue(selectionSize == 3);
    }

    public void testCheckSelectionAverage() {
        double selectionAverage = Computer.getAverageInSelection(group);
        assertTrue(Double.compare(23.1, selectionAverage) == 0);
    }

    public void testCheckCalculateStandardDeviation() {
        double standardDeviation = Computer.calculateStandardDeviation(group);
        assertTrue(Double.compare(6.9072426, standardDeviation) == 0);
    }

    public void testIsBelongToSelection() {
        Computer.init();
        group.setStandardDeviation(Computer.calculateStandardDeviation(group));
        group.setAverageValue(Computer.getAverageInSelection(group));

        boolean result = Computer.isBelongToSelection(16.2, group);
        assertTrue(result);
        result = Computer.isBelongToSelection(25, group);
        assertTrue(result);
        result = Computer.isBelongToSelection(13.3, group);
        assertFalse(result);
    }
}
