package com.gareth;

import java.util.ArrayList;
import java.util.List;

public class Player implements TheInterface {

    private String name;
    private String surname;
    private int age;
    private String playerNumber;
    private String role;
    private int amountOfGames;


    private List<Games> locationsPlayed = new ArrayList<Games>();

    Player()
    {

    }

    Player(String name, String surname, int age, String playerNumber, String role)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.playerNumber = playerNumber;
        this.role = role;
        this.amountOfGames = 0;

    }

    public void addLocation(Games location)
    {
        locationsPlayed.add(location);
        amountOfGames++;
    }

    public String celebrate()
    {
        String celebration = "How is that one?!!";

        return celebration;
    }

    public String encourage()
    {
        String encouragement = "Nice one!!";
        return encouragement;
    }

    public String someDetails()
    {
        String location = "";

        for(int i = 0; i<locationsPlayed.size(); i++)
        {
            location = location + locationsPlayed.get(i).getLocation() +"\n";

        }

        return "Name: " + name + " " + "Surname: " + surname + " " + "Age: " + age + " " + "Player Number: "
                + playerNumber + " " + "Role: " + role + " " + "Locations Played:\n" + location;
    }

    public String getPlayerNumber()
    {
        return playerNumber;
    }

    public int getAmountOfGames()
    {
        return amountOfGames;
    }

    public String toString()
    {
        return (name + " " + surname + " " + role);
    }
}
