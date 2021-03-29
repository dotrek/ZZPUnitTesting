package com.pb.zzp.fellows;

public class FellowBuilder {
    private String name;
    private Fellow.Race race;

    private FellowBuilder() {
    }

    public static FellowBuilder buildAFellow() {
        return new FellowBuilder();
    }

    public FellowBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FellowBuilder withRace(Fellow.Race race) {
        this.race = race;
        return this;
    }

    public Fellow build() {
        return new Fellow(name, race);
    }
}
