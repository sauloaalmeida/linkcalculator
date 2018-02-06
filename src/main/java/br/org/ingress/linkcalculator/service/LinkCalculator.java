package br.org.ingress.linkcalculator.service;

import br.org.ingress.linkcalculator.model.ModType;
import br.org.ingress.linkcalculator.model.Portal;
import br.org.ingress.linkcalculator.model.Resonator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkCalculator {


    private List<ModType> modsCombinationOrderByRarity[] = new List[]{
            new ArrayList<ModType>(),
            Arrays.asList(ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL),
            Arrays.asList(ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR),
            Arrays.asList(ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.LAVR)
    };

    private List<ModType> modsCombinationOrderByMultiplierResult[] = new List[]{
            new ArrayList<ModType>(),
            Arrays.asList(ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAR,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL),
            Arrays.asList(ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.SBUL,ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.SBUL,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.LAR),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.SBUL,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.SBUL),
            Arrays.asList(ModType.LAVR,ModType.LAVR,ModType.LAVR,ModType.LAVR)
    };

    List<ModType>[] getModsCombinationOrderByRarity(){
        return this.modsCombinationOrderByRarity;
    }

    List<ModType>[] getModsCombinationOrderByMultiplierResult(){
        return this.modsCombinationOrderByMultiplierResult;
    }


    List<Resonator>getMaxAgentsL8Resonators(int totalL8Agents){

        if(totalL8Agents>8 || totalL8Agents<1){
            throw new IllegalArgumentException("Number of agents must be a number between 1 and 8");
        }

        if(totalL8Agents == 1 ){
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(6),
                    new Resonator(6),
                    new Resonator(5),
                    new Resonator(5),
                    new Resonator(4),
                    new Resonator(4)
            );
        }

        if(totalL8Agents == 2 ){
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(6),
                    new Resonator(6),
                    new Resonator(6),
                    new Resonator(6)
            );
        }

        if(totalL8Agents == 3 ) {
            return Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(6),
                    new Resonator(6)
            );
        }

        if(totalL8Agents == 4 ) {
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(7)
            );
        }

        if(totalL8Agents == 5 ) {
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(7),
                    new Resonator(7)
            );
        }

        if(totalL8Agents == 6 ) {
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(7)
            );
        }

        if(totalL8Agents == 7 ) {
            return  Arrays.asList(
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(8),
                    new Resonator(7)
            );
        }

        //if still here, must be eight agents
        return  Arrays.asList(
                new Resonator(8),
                new Resonator(8),
                new Resonator(8),
                new Resonator(8),
                new Resonator(8),
                new Resonator(8),
                new Resonator(8),
                new Resonator(8)
        );

    }

    public List<String> portalSetupByDistanceOrderByModsRarity(Integer distanceInKm) {
        return this.portalSetupByDistance(modsCombinationOrderByRarity, distanceInKm);
    }

    public List<String> portalSetupByDistanceOrderByModsMultiplier(Integer distanceInKm) {
        return this.portalSetupByDistance(modsCombinationOrderByMultiplierResult, distanceInKm);
    }

    List<String> portalSetupByDistance(List<ModType> modsCombination[], Integer distanceInKm) {

        List<String> result = new ArrayList<String>();

        for (int amountAgents=1;amountAgents<=8;amountAgents++){

            for (List<ModType> mods : modsCombination) {

                if (amountAgents == 1 && mods.size() > 2){
                    continue;
                }
                
                Portal portal = new Portal(
                        this.getMaxAgentsL8Resonators(amountAgents),
                        mods
                );
                
                if(portal.getLinkRangeInMeters() >= distanceInKm*1000){
                    result.add(
                            "Agents necessary: " + amountAgents +
                            " Max Link Distance: " + portal.getLinkRangeInMeters()/1000 + "Km" +
                            " Mods Setup: "+mods);
                    break;
                }

            }

        }

        return result;
    }

}
