package br.org.ingress.linkcalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Portal {

    private List<Resonator> resonators = new ArrayList<Resonator>(8);
    private List<ModType> mods = new ArrayList<ModType>(4);

    public Portal(List<Resonator> resonatorsInit) {

        if(resonatorsInit == null){
            throw new IllegalArgumentException("The param List of resonators can't be null");
        }

        if(resonatorsInit.size() > 8){
            throw new IllegalArgumentException("It's not possible more then 8 resonators in a portal");
        }

        this.resonators = resonatorsInit;

    }

    public Portal(List<Resonator> resonatorsParam, List<ModType> modsInit){

        this(resonatorsParam);

        if(modsInit == null){
            throw new IllegalArgumentException("The param List of mods can't be null");
        }

        if(mods.size() > 4 ){
            throw new IllegalArgumentException("It's not possible more then 4 mods in a portal");
        }

        if(resonatorsParam.size()==0 && modsInit.size()>0){
            throw new IllegalArgumentException("It's not possible deploy a mod in a portal without resonators");
        }

        this.mods = modsInit;

    }

    Integer getResonatorsSum(){
        int total = 0;

        for (Resonator reso : resonators ) {
           total += reso.getLevel();
        }

        return total;
    }


    double getExactPortalLevel() {
        return this.getResonatorsSum().doubleValue()/8;
    }

    public Integer getLinkRangeInMeters(){

        Double linkRange = getMultiplierValueForMods() * getLinkRangeForPortalLevelOnly().doubleValue();

        return linkRange.intValue();

    }

    Integer getLinkRangeForPortalLevelOnly() {
        Double result = (160.0 * Math.pow(this.getExactPortalLevel(),4));

        return result.intValue() ;
    }

    Double getMultiplierValueForMods(){

        Double multiplierResult = 1.0;

        if(mods.size() > 0){
            multiplierResult = mods.get(0).getDefaultMultiplier();
        }

        if(mods.size()>1){
            multiplierResult += mods.get(1).getDefaultMultiplier() * 0.25;
        }

        if(mods.size()>2){
            multiplierResult += mods.get(2).getDefaultMultiplier() * 0.125;
        }

        if(mods.size()>3){
            multiplierResult += mods.get(3).getDefaultMultiplier() * 0.125;
        }

        return multiplierResult;
    }
}
