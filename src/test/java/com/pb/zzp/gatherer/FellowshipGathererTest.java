package com.pb.zzp.gatherer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FellowshipGathererTest {

    @Test
    public void shouldGatherLegolasAsBestBowman() {
        //given
        FellowshipGatherer fellowshipGatherer = new FellowshipGatherer();
        //when
        String bestBowman = fellowshipGatherer.gatherBestBowman();
        //then
        assertEquals("Legolas", bestBowman);
    }
}