package ru.zl0dey.computing;

import ru.zl0dey.dto.AttributeGroup;
import ru.zl0dey.dto.Organisation;

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
}
