package com.pb.zzp.fellows;

import org.junit.Ignore;
import org.junit.Test;

import static com.pb.zzp.fellows.FellowTestFixture.*;
import static org.junit.Assert.fail;

public class FellowshipTest {

    private Fellowship fellowship = formTheFellowshipOfTheRing();

    @Test
    @Ignore
    public void frodoShouldBeMemberOfFellowship() {
        //TODO: Please note also that there is "fellowship" field in this test class to be used
        //TODO: Use frodo() from FellowTestFixture to get Frodo (he is a value object)
    }

    @Test
    @Ignore
    public void sauronShouldNotBeInFellowship() {
        //TODO: fix the fellowship fixture if needed
        fail("TODO");
    }

    @Test
    @Ignore
    public void shouldContainFourHobbits() {
        //TODO: check if any actual class contains helpful functionality
        fail("TODO");
    }

    @Test
    @Ignore
    public void aragornShouldBeBeforeBoromir() {
        //TODO verify list index
        fail("TODO");
    }

    @Test
    @Ignore
    public void shouldNotContainDuplicatedFellows() {
        //TODO: fix the fellowship members if needed
        fail("TODO");
    }

    @Test
    @Ignore
    public void humanPartOfFellowshipShouldContainJustPeopleWithNameAragornAndBoromir() {
        //TODO: comparison should be done using their names
        fail("TODO");
    }

    @Test
    @Ignore
    public void shouldContainNineFellowsButNoneGiant() {
        fail("TODO");
    }

    private Fellowship formTheFellowshipOfTheRing() {
        return new Fellowship(
                buildFrodo(),
                buildSam(),
                buildMerry(),
                buildPippin(),
                buildGandalf(),
                buildLegolas(),
                buildGimli(),
                buildGandalf(),
                buildAragorn(),
                buildSauron(),
                buildBoromir()
        );
    }
}
