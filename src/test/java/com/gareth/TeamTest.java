package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    Team team;
    Player gareth;
    Player bob;
    Object obj;

    @Before
    public void setUp() throws Exception {
        team = new Team("EdgemeadXI");
        gareth = new Player("Gareth", "Morgan", 26, "10501", "Bowler");
        bob = new Player("Bob", "Ross", 22, "111222", "Batsman");
    }

    @Test
    public void addTeamPlayer() {
        team.addTeamPlayer(gareth);
        team.addTeamPlayer(bob);

        assertEquals(2, team.getNumberOfTeamMembers());
    }

    @Test
    public void getTeamPlayer() {
        team.addTeamPlayer(gareth);
        obj = team.getTeamPlayer("10501");
        assertEquals("Gareth Morgan Bowler", obj.toString());
    }
}