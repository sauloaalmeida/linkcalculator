package br.org.ingress.linkcalculator.model;

import org.junit.Assert;
import org.junit.Test;

public class ResonatorTest {


    @Test(expected = IllegalArgumentException.class)
    public void instaciateInvalidResoGreaterThen8(){
        Resonator resoLvl9 = new Resonator(9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void instaciateInvalidResoSmallerThen1(){
        Resonator resoLv0 = new Resonator(0);
    }


    @Test
    public void getLevelSuccessTest() throws Exception {

        Resonator resoLvl1 = new Resonator(1);
        Assert.assertEquals(1L, resoLvl1.getLevel().longValue());

        Resonator resoLvl2 = new Resonator(2);
        Assert.assertEquals(2L, resoLvl2.getLevel().longValue());

        Resonator resoLvl3 = new Resonator(3);
        Assert.assertEquals(3L, resoLvl3.getLevel().longValue());

        Resonator resoLvl4 = new Resonator(4);
        Assert.assertEquals(4L, resoLvl4.getLevel().longValue());

        Resonator resoLvl5 = new Resonator(5);
        Assert.assertEquals(5L, resoLvl5.getLevel().longValue());

        Resonator resoLvl6 = new Resonator(6);
        Assert.assertEquals(6L, resoLvl6.getLevel().longValue());

        Resonator resoLvl7 = new Resonator(7);
        Assert.assertEquals(7L, resoLvl7.getLevel().longValue());

        Resonator resoLvl8 = new Resonator(8);
        Assert.assertEquals(8L, resoLvl8.getLevel().longValue());

    }


}