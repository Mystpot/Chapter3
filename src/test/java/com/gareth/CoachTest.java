package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoachTest {

    Coach teamCoach;
    Games edge;
    Games mont;

    @Before
    public void setUp() throws Exception {

        teamCoach = new Coach("Barry", "Allen", 50);
        edge = new Games("Edgemead");
        mont = new Games("Monte Vista");
    }

    @Test
    public void someDetails() {

        teamCoach.addGames(edge);
        teamCoach.addGames(mont);

    assertEquals("Places coached:\nEdgemeadMonte Vista",teamCoach.someDetails() );
    }

    @Test
    public void addGames() {
        teamCoach.addGames(edge);
        teamCoach.addGames(mont);

        assertEquals(2, teamCoach.getGameAmount());
    }

    @Test
    public void testCelebrate()
    {
        assertEquals("Good job team!", teamCoach.celebrate());
    }

    @Test
    public void testEncouragement()
    {
        assertEquals("You can do it team!!!", teamCoach.encourage());
    }
}