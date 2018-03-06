package com.gareth;

/**
 * Hello world!
 *
 */

import java.util.Collections;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Games edge = new Games("Edgemead");
        Games mont = new Games("Monte Vista");
        Games durb = new Games("Durbanville");
        Games bell = new Games("Bellville");

        Player gareth = new Player("Gareth", "Morgan", 26, "10501", "Bowler");
        gareth.addLocation(edge);
        gareth.addLocation(mont);

        Player bob = new Player("Bob", "Ross", 22, "10205", "Batsman");
        bob.addLocation(bell);
        bob.addLocation(edge);
        bob.addLocation(durb);

        Team team = new Team("EdgemeadXI");
        team.addTeamPlayer(gareth);
        team.addTeamPlayer(bob);

        Coach barry = new Coach("Barry", "Allen", 50);
        barry.addGames(edge);
        barry.addGames(mont);
        barry.addGames(durb);
        barry.addGames(bell);
    }
}
