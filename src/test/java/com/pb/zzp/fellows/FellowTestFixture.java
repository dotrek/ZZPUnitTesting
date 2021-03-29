package com.pb.zzp.fellows;

import static com.pb.zzp.fellows.FellowBuilder.buildAFellow;

public class FellowTestFixture {

    public static Fellow buildFrodo() {
        return buildAFellow().withName("Frodo").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow buildSam() {
        return buildAFellow().withName("Sam").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow buildMerry() {
        return buildAFellow().withName("Merry").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow buildPippin() {
        return buildAFellow().withName("Pippin").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow buildGandalf() {
        return buildAFellow().withName("Gandalf").withRace(Fellow.Race.MAIAR).build();
    }

    public static Fellow buildLegolas() {
        return buildAFellow().withName("Legolas").withRace(Fellow.Race.ELF).build();
    }

    public static Fellow buildGimli() {
        return buildAFellow().withName("Gimli").withRace(Fellow.Race.DWARF).build();
    }

    public static Fellow buildAragorn() {
        return buildAFellow().withName("Aragorn").withRace(Fellow.Race.MAN).build();
    }

    public static Fellow buildBoromir() {
        return buildAFellow().withName("Boromir").withRace(Fellow.Race.MAN).build();
    }

    public static Fellow buildSauron() {
        return buildAFellow().withName("Sauron").withRace(Fellow.Race.AINUR).build();
    }
}
