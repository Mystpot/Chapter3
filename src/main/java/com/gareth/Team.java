package com.gareth;

import java.util.HashMap;
import java.util.Map;


public class Team {

    private String nameOfTeam;
    private int numberOfTeamMembers;

    private Map playerMap = new HashMap();

    Team()
    {

    }

    Team(String nameOfTeam)
    {
        this.nameOfTeam = nameOfTeam;
        numberOfTeamMembers = 0;
    }

    public void addTeamPlayer(Player player)
    {
        playerMap.put(player.getPlayerNumber(), player);
        numberOfTeamMembers++;

    }

    public int getNumberOfTeamMembers()
    {
        return numberOfTeamMembers;
    }

    public Object getTeamPlayer(String key)
    {
        return playerMap.get(key);
    }
}
