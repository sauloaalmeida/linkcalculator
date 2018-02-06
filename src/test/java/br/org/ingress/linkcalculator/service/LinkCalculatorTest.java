package br.org.ingress.linkcalculator.service;

import br.org.ingress.linkcalculator.model.ModType;
import br.org.ingress.linkcalculator.model.Portal;
import br.org.ingress.linkcalculator.model.Resonator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LinkCalculatorTest {


    List<Resonator> resosPortalAgentL8 =
            Arrays.asList(
                    new Resonator(8),
                    new Resonator(7),
                    new Resonator(6),
                    new Resonator(6),
                    new Resonator(5),
                    new Resonator(5),
                    new Resonator(4),
                    new Resonator(4)
            );


    @Test
    public void getModsCombinationOrderByRarity() throws Exception {

        LinkCalculator calculator = new LinkCalculator();

        List<ModType>[] modsCombination  = calculator.getModsCombinationOrderByRarity();

        for (List<ModType> modsType: modsCombination) {

            Portal portalAgentL8 = new Portal(resosPortalAgentL8,modsType);
            System.out.println(portalAgentL8.getLinkRangeInMeters() +";"+ modsType.toString());

        }

    }

    @Test
    public void getModsCombinationByMultiplierResult() throws Exception {

        LinkCalculator calculator = new LinkCalculator();

        List<ModType>[] modsCombination = calculator.getModsCombinationOrderByMultiplierResult();

        for (List<ModType> modsType: modsCombination) {

            Portal portalAgentL8 = new Portal(resosPortalAgentL8,modsType);
            System.out.println(portalAgentL8.getLinkRangeInMeters() +";"+ modsType.toString());

        }

    }

    @Test
    public void getPortalSetupByDistanceOrderByModsRarity() throws Exception {
        LinkCalculator calculator = new LinkCalculator();

        List<String> result = calculator.portalSetupByDistanceOrderByModsRarity(1122);

        Assert.assertEquals(8,result.size());

        System.out.println(result);

    }

    @Test
    public void getPortalSetupByDistanceOrderByModsMultiplier() throws Exception {
        LinkCalculator calculator = new LinkCalculator();

        List<String> result = calculator.portalSetupByDistanceOrderByModsMultiplier(1122);

        Assert.assertEquals(8,result.size());

        System.out.println(result);

    }





}