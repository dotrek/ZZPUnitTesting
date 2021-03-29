package com.pb.zzp.gatherer

import spock.lang.Specification

class FellowshipGathererSpockTest extends Specification{

    def "should return Legolas As the best bowman"() {
        given:
        FellowshipGatherer fellowshipGatherer = new FellowshipGatherer();
        when:
            String bestBowman = fellowshipGatherer.gatherBestBowman();
        then:
            bestBowman == "Legolas"
    }
}
