package br.org.ingress.linkcalculator.model;

public class Resonator {

    private Integer level;

    public Resonator(Integer levelReso) {

        if( levelReso <1 || levelReso >8 ){
            throw new IllegalArgumentException("Resonator level must be a value between 1 and 8.");
        }

        this.level = levelReso;
    }

    public Integer getLevel() {
        return level;
    }

}
