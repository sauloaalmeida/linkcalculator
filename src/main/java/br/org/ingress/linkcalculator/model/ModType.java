package br.org.ingress.linkcalculator.model;

public enum ModType {

    LAR(2.0),
    SBUL(5.0),
    LAVR(7);

    private double defaultMultiplier;

    ModType(double multiplier) {

        this.defaultMultiplier = multiplier;
    }

    public double getDefaultMultiplier() {
        return this.defaultMultiplier;
    }
}
