package com.gareth;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Coach {

    private String name;
    private String surname;
    private int age;
    int amountOfGames;

    private Set<Games> locationCoached = new HashSet<Games>();

    Coach()
    {

    }

    Coach(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.amountOfGames = 0;
    }

    public String celebrate()
    {
        String celebration = "Good job team!";

        return celebration;
    }

    public String encourage()
    {
        String encouragement = "You can do it team!!!";
        return encouragement;
    }

    public String someDetails()
    {
        String placesCoached = "Places coached:\n";

        Iterator<Games> iterator = locationCoached.iterator();

        while(iterator.hasNext())
        {
            placesCoached += iterator.next().getLocation();
        }

        return placesCoached;
    }

    public void addGames(Games game)
    {
        locationCoached.add(game);
        amountOfGames++;
    }

    public int getGameAmount()
    {
        return amountOfGames;
    }
}
