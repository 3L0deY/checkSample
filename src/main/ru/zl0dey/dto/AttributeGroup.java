package ru.zl0dey.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * DTO for AttributeGroup.
 * Created by zlodey on 11/20/16.
 */
public class AttributeGroup {

    private double averageValue;
    private double standardDeviation;
    private List<Attribute> groupedAttributes = new ArrayList<Attribute>();

    /**
     * Gets average value.
     *
     * @return the average value
     */
    public double getAverageValue() {
        return averageValue;
    }

    /**
     * Sets average value.
     *
     * @param averageValue the average value
     */
    public void setAverageValue(double averageValue) {
        this.averageValue = averageValue;
    }

    /**
     * Gets standard deviation.
     *
     * @return the standard deviation
     */
    public double getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets standard deviation.
     *
     * @param standardDeviation the standard deviation
     */
    public void setStandardDeviation(double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    /**
     * Gets grouped attributes.
     *
     * @return the grouped attributes
     */
    public List<Attribute> getGroupedAttributes() {
        return groupedAttributes;
    }

    /**
     * Sets grouped attributes.
     *
     * @param groupedAttributes the grouped attributes
     */
    public void setGroupedAttributes(List<Attribute> groupedAttributes) {
        this.groupedAttributes = groupedAttributes;
    }
}
