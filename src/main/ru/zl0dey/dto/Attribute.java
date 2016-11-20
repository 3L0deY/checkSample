package ru.zl0dey.dto;

import ru.zl0dey.computing.AttributeId;

/**
 * DTO for Attribute.
 * Created by zlodey on 11/20/16.
 */
public class Attribute {
    private AttributeId attributeId;
    private double value;
    private double correctResult;
    private boolean outSelection;

    /**
     * Instantiates a new Attribute.
     *
     * @param attributeId the attribute id
     * @param value       the value
     */
    public Attribute(AttributeId attributeId, double value) {
        this.attributeId = attributeId;
        this.value = value;
    }

    /**
     * Gets attribute id.
     *
     * @return the attribute id
     */
    public AttributeId getAttributeId() {
        return attributeId;
    }

    /**
     * Sets attribute id.
     *
     * @param attributeId the attribute id
     */
    public void setAttributeId(AttributeId attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets correct result.
     *
     * @return the correct result
     */
    public double getCorrectResult() {
        return correctResult;
    }

    /**
     * Sets correct result.
     *
     * @param correctResult the correct result
     */
    public void setCorrectResult(double correctResult) {
        this.correctResult = correctResult;
    }

    /**
     * Is out selection boolean.
     *
     * @return the boolean
     */
    public boolean isOutSelection() {
        return outSelection;
    }

    /**
     * Sets out selection.
     *
     * @param outSelection the out selection
     */
    public void setOutSelection(boolean outSelection) {
        this.outSelection = outSelection;
    }
}
