package ru.zl0dey.io;

import ru.zl0dey.computing.AttributeId;
import ru.zl0dey.dto.AttributeGroup;
import ru.zl0dey.dto.Organisation;

import java.util.List;
import java.util.Map;

/**
 * Class for import/export data.
 * Created by zlodey on 11/20/16.
 */
public class DataTransfer {

    /**
     * Export xls.
     *
     * @param organisations the organisations
     */
    public static void exportXls(List<Organisation> organisations) {

    }

    /**
     * Import xls.
     *
     * @param organisations   the organisations
     * @param attributeGroups the attribute groups
     * @param args            the args
     */
    public static void importXls(List<Organisation> organisations,
                                 Map<AttributeId, AttributeGroup> attributeGroups, String[] args) {

    }
}
