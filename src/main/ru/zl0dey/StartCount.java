package ru.zl0dey;

import ru.zl0dey.computing.AttributeId;
import ru.zl0dey.computing.Computer;
import ru.zl0dey.computing.Constants;
import ru.zl0dey.dto.Attribute;
import ru.zl0dey.dto.AttributeGroup;
import ru.zl0dey.dto.Organisation;
import ru.zl0dey.io.DataTransfer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Count check sample.
 */
public class StartCount {


    private static Logger logger = Logger.getLogger(Constants.CHECK_SAMPLE_LOGGER);

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);

        if (logger.isLoggable(logger.getLevel())) {
            logger.info("Start checkSample application");
        }

        List<Organisation> organisations = new ArrayList<Organisation>();
        Map<AttributeId, AttributeGroup> attributeGroups = new HashMap<AttributeId, AttributeGroup>();

        if (logger.isLoggable(logger.getLevel())) {
            logger.info("Initialisation...");
        }

        //TODO remove by DataTransfer.importXls(organisations, attributeGroups, args);
        init(organisations, attributeGroups);

        if (logger.isLoggable(logger.getLevel())) {
            logger.info("Initialisation successful. Start computing...");
        }

        Computer.compute(organisations, attributeGroups);

        if (logger.isLoggable(logger.getLevel())) {
            logger.info("Computing finished. Start creating report...");
        }

        DataTransfer.exportXls(organisations);

        if (logger.isLoggable(logger.getLevel())) {
            logger.info("Export finished.");
        }
    }

    private static void init(List<Organisation> organisations, Map<AttributeId, AttributeGroup> attributeGroups) {

        List<Attribute> organisationAttributes = new ArrayList<Attribute>();
        organisationAttributes.add(new Attribute(AttributeId.DENSITY, 786));
        organisationAttributes.add(new Attribute(AttributeId.START_BOIL, 138));
        organisationAttributes.add(new Attribute(AttributeId.DEGREES_10, 165));
        organisations.add(new Organisation("ВУНЦ ВВС ВВА", organisationAttributes));

        organisationAttributes = new ArrayList<Attribute>();
        organisationAttributes.add(new Attribute(AttributeId.DENSITY, 786.5));
        organisationAttributes.add(new Attribute(AttributeId.START_BOIL, 145));
        organisationAttributes.add(new Attribute(AttributeId.DEGREES_10, 159));
        organisations.add(new Organisation("55443-52", organisationAttributes));

        organisationAttributes = new ArrayList<Attribute>();
        organisationAttributes.add(new Attribute(AttributeId.DENSITY, 786));
        organisationAttributes.add(new Attribute(AttributeId.START_BOIL, 143));
        organisationAttributes.add(new Attribute(AttributeId.DEGREES_10, 159));
        organisations.add(new Organisation("62632-А", organisationAttributes));

        organisationAttributes = new ArrayList<Attribute>();
        organisationAttributes.add(new Attribute(AttributeId.DENSITY, 785.9));
        organisationAttributes.add(new Attribute(AttributeId.START_BOIL, 143));
        organisationAttributes.add(new Attribute(AttributeId.DEGREES_10, 155.5));
        organisations.add(new Organisation("УАБ Борисоглебск", organisationAttributes));

        organisationAttributes = new ArrayList<Attribute>();
        organisationAttributes.add(new Attribute(AttributeId.DENSITY, 786.4));
        organisationAttributes.add(new Attribute(AttributeId.START_BOIL, 144.5));
        organisationAttributes.add(new Attribute(AttributeId.DEGREES_10, 160));
        organisations.add(new Organisation("49719-2", organisationAttributes));

        for (AttributeId attrId : AttributeId.values()) {
            List<Attribute> groupedAttributes = new ArrayList<Attribute>();
            for (Organisation organisation : organisations) {
                for (Attribute orgAttr : organisation.getAttributes()) {
                    if (orgAttr.getAttributeId().equals(attrId)) {
                        groupedAttributes.add(orgAttr);
                    }
                }
            }
            AttributeGroup attributeGroup = new AttributeGroup();
            attributeGroup.setGroupedAttributes(groupedAttributes);
            attributeGroups.put(attrId, attributeGroup);
        }

    }
}
