package br.org.ingress.linkcalculator.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PortalTest {

    @Test(expected = IllegalArgumentException.class)
    public void instaciateMoreThan8ResosFail(){

        Portal portal = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                )
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void instaciateWithNullListOfResosFail(){

        Portal portal = new Portal(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void instaciateWithoutResosAndWithMods(){

        Portal portal = new Portal(
                new ArrayList<Resonator>(),
                Arrays.asList(ModType.LAR)
        );
    }


    @Test(expected = IllegalArgumentException.class)
    public void instaciateWithNullListOfModsFail(){

        Portal portal = new Portal(null);
    }

    @Test
    public void instaciatePortalWithResosOnlySuccess(){

        Portal portal = new Portal(
                Arrays.asList(
                new Resonator(1),
                new Resonator(1),
                new Resonator(1),
                new Resonator(1),
                new Resonator(1),
                new Resonator(1),
                new Resonator(1),
                new Resonator(1)
                )
        );
    }

    @Test
    public void getResonatorsSumSuccessTestSuccess(){

        Portal portalL1 = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                )
        );

        Assert.assertEquals(8L,portalL1.getResonatorsSum().longValue());


        Portal portalL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8)
                )
        );

        Assert.assertEquals(64L,portalL8.getResonatorsSum().longValue());

        Portal portalAgentLevel8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(7),
                        new Resonator(6),
                        new Resonator(6),
                        new Resonator(5),
                        new Resonator(5),
                        new Resonator(4),
                        new Resonator(4)
                )
        );

        Assert.assertEquals(45L,portalAgentLevel8.getResonatorsSum().longValue());


    }

    @Test
    public void getExactPortalLevelSuccessTest(){

        Portal portalL1 = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                )
        );
        Assert.assertEquals(1.0,portalL1.getExactPortalLevel(),0);



        Portal portalL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8)
                )
        );
        Assert.assertEquals(8.0, portalL8.getExactPortalLevel(),0 );


        Portal portalAgentLevel8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(7),
                        new Resonator(6),
                        new Resonator(6),
                        new Resonator(5),
                        new Resonator(5),
                        new Resonator(4),
                        new Resonator(4)
                )
        );
        Assert.assertEquals(5.625,portalAgentLevel8.getExactPortalLevel(),0);

    }


    @Test
    public void getLinkRangeForPortalLevelOnlySuccessTest(){

        Portal portalL1 = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                )
        );
        Assert.assertEquals(160L, portalL1.getLinkRangeForPortalLevelOnly().longValue());


        Portal portalL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8)
                )
        );
        Assert.assertEquals(655360L, portalL8.getLinkRangeForPortalLevelOnly().longValue());


        Portal portalAgentL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(7),
                        new Resonator(6),
                        new Resonator(6),
                        new Resonator(5),
                        new Resonator(5),
                        new Resonator(4),
                        new Resonator(4)
                )
        );
        Assert.assertEquals(160180, portalAgentL8.getLinkRangeForPortalLevelOnly().longValue());


    }

    @Test
    public void getLinkRangeInMetersWithoutMods(){

        Portal portalL1 = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                )
        );
        Assert.assertEquals(160L, portalL1.getLinkRangeInMeters().longValue());


        Portal portalL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8)
                )
        );
        Assert.assertEquals(655360L, portalL8.getLinkRangeInMeters().longValue());


        Portal portalAgentL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(7),
                        new Resonator(6),
                        new Resonator(6),
                        new Resonator(5),
                        new Resonator(5),
                        new Resonator(4),
                        new Resonator(4)
                )
        );
        Assert.assertEquals(160180, portalAgentL8.getLinkRangeInMeters().longValue());


    }

    @Test
    public void getLinkRangeInMetersWithMods(){

        Portal portalL1 = new Portal(
                Arrays.asList(
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1),
                        new Resonator(1)
                ),
                Arrays.asList(
                        ModType.LAR,
                        ModType.LAR,
                        ModType.LAR,
                        ModType.LAR
                        )
        );
        Assert.assertEquals(480L, portalL1.getLinkRangeInMeters().longValue());


        Portal portalL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8),
                        new Resonator(8)
                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.LAVR,
                        ModType.LAVR,
                        ModType.LAVR
                )
        );
        Assert.assertEquals(6881280L, portalL8.getLinkRangeInMeters().longValue());


        Portal portalAgentL8 = new Portal(
                Arrays.asList(
                        new Resonator(8),
                        new Resonator(7),
                        new Resonator(6),
                        new Resonator(6),
                        new Resonator(5),
                        new Resonator(5),
                        new Resonator(4),
                        new Resonator(4)
                ),
                Arrays.asList(
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.SBUL
                )
        );
        Assert.assertEquals(1201350, portalAgentL8.getLinkRangeInMeters().longValue());


    }


    @Test
    public void getMultiplierValueForModsLARTest(){

        Portal portalLAR1x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                        new Resonator(1)
                        )

                ),
                Arrays.asList(ModType.LAR)
        );
        Assert.assertEquals(2.0,portalLAR1x.getMultiplierValueForMods(),0.0);

        Portal portalLAR2x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                    ),
                    Arrays.asList(
                            ModType.LAR,
                            ModType.LAR
                    )
        );
        Assert.assertEquals(2.5,portalLAR2x.getMultiplierValueForMods(),0.0);


        Portal portalLAR3x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAR,
                        ModType.LAR,
                        ModType.LAR
                )
        );
        Assert.assertEquals(2.75,portalLAR3x.getMultiplierValueForMods(),0.0);


        Portal portalLAR4x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAR,
                        ModType.LAR,
                        ModType.LAR,
                        ModType.LAR
                )
        );
        Assert.assertEquals(3.0,portalLAR4x.getMultiplierValueForMods(),0.0);

    }


    @Test
    public void getMultiplierValueForModsLAVRTest(){

        Portal portalLAVR1x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(ModType.LAVR)
        );
        Assert.assertEquals(7.0,portalLAVR1x.getMultiplierValueForMods(),0.0);

        Portal portalLAVR2x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.LAVR
                )
        );
        Assert.assertEquals(8.75,portalLAVR2x.getMultiplierValueForMods(),0.0);


        Portal portalLAVR3x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.LAVR,
                        ModType.LAVR
                )
        );
        Assert.assertEquals(9.625,portalLAVR3x.getMultiplierValueForMods(),0.0);


        Portal portalLAVR4x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.LAVR,
                        ModType.LAVR,
                        ModType.LAVR
                )
        );
        Assert.assertEquals(10.5,portalLAVR4x.getMultiplierValueForMods(),0.0);

    }


    @Test
    public void getMultiplierValueForModsSBULTest(){

        Portal portalSBUL1x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(ModType.SBUL)
        );
        Assert.assertEquals(5.0,portalSBUL1x.getMultiplierValueForMods(),0.0);

        Portal portalSBUL2x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.SBUL,
                        ModType.SBUL
                )
        );
        Assert.assertEquals(6.25,portalSBUL2x.getMultiplierValueForMods(),0.0);


        Portal portalSBUL3x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.SBUL
                )
        );
        Assert.assertEquals(6.875,portalSBUL3x.getMultiplierValueForMods(),0.0);


        Portal portalSBUL4x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.SBUL
                )
        );
        Assert.assertEquals(7.5,portalSBUL4x.getMultiplierValueForMods(),0.0);

    }

    @Test
    public void getMultiplierValueForModsMixedTest(){



        Portal portalMixedMods2x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.SBUL,
                        ModType.LAR
                )
        );
        Assert.assertEquals(5.5,portalMixedMods2x.getMultiplierValueForMods(),0.0);


        Portal portalMixedMods3x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.SBUL,
                        ModType.LAR
                )
        );
        Assert.assertEquals(8.5,portalMixedMods3x.getMultiplierValueForMods(),0.0);


        Portal portalMixedMods4x = new Portal(
                new ArrayList<Resonator>(
                        Arrays.asList(
                                new Resonator(1)
                        )

                ),
                Arrays.asList(
                        ModType.LAVR,
                        ModType.SBUL,
                        ModType.SBUL,
                        ModType.LAR
                )
        );
        Assert.assertEquals(9.125,portalMixedMods4x.getMultiplierValueForMods(),0.0);

    }



}