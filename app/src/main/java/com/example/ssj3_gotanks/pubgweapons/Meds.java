package com.example.ssj3_gotanks.pubgweapons;

/**
 * Created by SSJ3_Gotanks on 10/16/2017.
 */

public class Meds {
    private String name;
    private String capacity;

    public static final Meds[] meds = {
            new Meds("Med Kit", "20"),
            new Meds("First Aid Kit", "10"),
            new Meds("Bandage", "2"),
            new Meds("Energy Drink", "4"),
            new Meds("Painkillers", "10")
    };

    public Meds(String name, String capacity){
        this.name = name;
        this.capacity = capacity;
    }
}
