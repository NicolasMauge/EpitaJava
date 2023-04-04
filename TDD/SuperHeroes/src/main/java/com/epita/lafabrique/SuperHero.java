package com.epita.lafabrique;

import java.util.Collections;
import java.util.List;

public class SuperHero extends Humanoid {
    private final List<String> powers;
    private final String superHeroName;

    public SuperHero(Humanoid humanoid, String superHeroName,
                     List<String> powers) {
        super(humanoid.getName(), humanoid.getAge());
        this.powers = powers;
        this.superHeroName = superHeroName;
    }

    public List<String> getPowers() {
        return Collections.unmodifiableList(powers);
    }

    public String getSuperHeroName() {
        return superHeroName;
    }
}

