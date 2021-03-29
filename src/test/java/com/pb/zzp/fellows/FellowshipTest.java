package com.pb.zzp.fellows;

import org.junit.Ignore;
import org.junit.Test;

import static com.pb.zzp.fellows.FellowTestFixture.*;
import static org.junit.Assert.fail;

/**
 * Implement provided unit test templates (in the FellowshipAssertionTest class) for existing kod leveraging AssertJ assertions.
 * Follow the instructions (and hints) placed directly in the test templates.
 *
 * Hint. Use the formTheFellowshipOfTheRing() method to get The Fellowship instance.
 * Hint. Pay attention that the Fellowship class implements the Iterable interface. How can it simplify assertion creation?
 * Hint. The FellowTestFixture class contains convenient methods to get particular members of The Fellowship.
 *
 * Please note. You can switch to JUnit 5 for tests by replacing "org.junit.Test" with "org.junit.jupiter.api.Test".
 */
public class FellowshipTest {

    private Fellowship fellowship = formTheFellowshipOfTheRing();

    @Test
    @Ignore
    public void frodoShouldBeMemberOfFellowship() {
        //TODO: Please note also that there is "fellowship" field in this test class to be used
        //TODO: Use frodo() from FellowTestFixture to get Frodo (he is a value object)
        //TODO: Do not use extraction in this test :)
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
        //TODO: maybe there is already an useful method in the Fellowship class?
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
        //TODO: comparison should be done using their names (not references) - maybe extracting(methodReference) could be useful?
        fail("TODO");
    }

    @Test
    @Ignore
    public void shouldContainNineFellowsButNoneGiant() {
        fail("TODO");
    }

    //TODO: Extension 2: Write a few more automatic tests using various AssertJ assertions. Try to take cases which would be hard to implement with
    //      standard JUnit assertions (such as filteredOn, anyOf/allOf, hasFieldOrProperty. In a case of questions/problems do not hesitate to ask the trainer :).


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
