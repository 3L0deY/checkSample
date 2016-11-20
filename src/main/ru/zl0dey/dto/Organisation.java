package ru.zl0dey.dto;

import java.util.List;

/**
 * DTO for Organisation.
 * Created by zlodey on 11/20/16.
 */
public class Organisation {
    private String name;
    private int rating;
    private List<Attribute> attributes;

    /**
     * Instantiates a new Organisation.
     *
     * @param name       the name
     * @param attributes the attributes
     */
    public Organisation(String name, List<Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets rating.
     *
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets rating.
     *
     * @param rating the rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Gets attributes.
     *
     * @return the attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes.
     *
     * @param attributes the attributes
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
