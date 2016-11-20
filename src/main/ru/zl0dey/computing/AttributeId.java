package ru.zl0dey.computing;

/**
 * Identify id for attributes.
 * Created by zlodey on 11/20/16.
 */
public enum AttributeId {
    DENSITY(5),
    START_BOIL(7),
    DEGREES_10(4);

    private int reproducibility;

    AttributeId(int reproducibility) {
        this.reproducibility = reproducibility;
    }

    public int getReproducibility() {
        return this.reproducibility;
    }
}
