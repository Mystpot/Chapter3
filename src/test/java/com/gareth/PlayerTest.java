package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;
    Games edge;
    Games mont;


    @Before
    public void setUp() throws Exception {

        player = new Player("Gareth", "Morgan", 26, "10501", "Bowler");
        edge = new Games("Edgemead");
        mont = new Games("Monte Vista");

    }

    @Test
    public void addLocation() {
        player.addLocation(edge);
        player.addLocation(mont);
        assertEquals(2, player.getAmountOfGames());
    }

    @Test
    public void celebrate() {
        assertEquals("How is that one?!!", player.celebrate());
    }

    @Test
    public void encourage() {
        assertEquals("Nice one!!", player.encourage());
    }

    @Test
    public void someDetails() {
        String deets = "Name: Gareth Surname: Morgan Age: 26 Player Number: 10501 Role: Bowler Locations Played:\nEdgemead\nMonte Vista\n";
        player.addLocation(edge);
        player.addLocation(mont);

        assertEquals(deets, player.someDetails());

    }

    @Test
    public void getPlayerNumber() {
        assertEquals("10501", player.getPlayerNumber());
    }


}