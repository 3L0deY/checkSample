package ru.zl0dey.computing;

import ru.zl0dey.dto.Attribute;
import ru.zl0dey.dto.AttributeGroup;
import ru.zl0dey.dto.Organisation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class for all calculations.
 * <p>
 * Created by zlodey on 11/20/16.
 */
public final class Computer {

    private static int MARK_5 = 5;
    private static int MARK_4 = 4;
    private static int MARK_3 = 3;
    private static int MARK_2 = 2;
    private static Map<Integer, Double> normalSelection = new HashMap<Integer, Double>(18);

    public static void compute(List<Organisation> organisations, Map<AttributeId, AttributeGroup> attributeGroups) {

    }

    /**
     * Returns mark according rating
     *
     * @param rating for organisation
     * @return mark
     */
    public static int getMark(int rating) {
        if (rating <= 25) {
            return MARK_5;
        } else if (rating > 25 && rating < 200) {
            return MARK_4;
        } else if (rating >= 200 && rating <= 500) {
            return MARK_3;
        } else {
            return MARK_2;
        }
    }

    public static double getAverageInSelection(AttributeGroup group) {
        double summ = 0.0;
        for (Attribute attribute : group.getGroupedAttributes()) {
            if (!attribute.isOutSelection()) {
                summ += attribute.getValue();
            }
        }
        return roundDouble(summ / getSelectionSize(group));
    }

    public static int getSelectionSize(AttributeGroup group) {
        int counter = 0;
        for (Attribute attribute : group.getGroupedAttributes()) {
            if (!attribute.isOutSelection()) {
                counter++;
            }
        }
        return counter;
    }

    public static double calculateStandardDeviation(AttributeGroup group) {
        double standardDeviation,
                average = getAverageInSelection(group),
                tmpSumm = 0.0;

        for (Attribute attribute : group.getGroupedAttributes()) {
            if (!attribute.isOutSelection()) {
                tmpSumm += Math.pow(attribute.getValue() - average, 2);
            }
        }

        standardDeviation = Math.sqrt(tmpSumm / (getSelectionSize(group) - 1));
        return roundDouble(standardDeviation);
    }

    public static boolean isBelongToSelection(double value, AttributeGroup group) {
        double result = Math.abs(value - group.getAverageValue()) / group.getStandardDeviation();
        int selectionSize = getSelectionSize(group);
        return roundDouble(result) < normalSelection.get(selectionSize);
    }

    public static void init() {
        normalSelection.put(3, 1.15);
        normalSelection.put(4, 1.46);
        normalSelection.put(5, 1.67);
        normalSelection.put(6, 1.82);
        normalSelection.put(7, 1.94);
        normalSelection.put(8, 2.03);
        normalSelection.put(9, 2.11);
        normalSelection.put(10, 2.18);
        normalSelection.put(11, 2.23);
        normalSelection.put(12, 2.29);
        normalSelection.put(13, 2.33);
        normalSelection.put(14, 2.37);
        normalSelection.put(15, 2.41);
        normalSelection.put(16, 2.44);
        normalSelection.put(17, 2.48);
        normalSelection.put(18, 2.50);
        normalSelection.put(19, 2.53);
        normalSelection.put(20, 2.56);
    }

    /**
     * Normalize double values.
     *
     * @param value of double
     * @return normal double value
     */
    private static double roundDouble(double value) {
        return (double) Math.round(value * 10000000d) / 10000000d;
    }
}
