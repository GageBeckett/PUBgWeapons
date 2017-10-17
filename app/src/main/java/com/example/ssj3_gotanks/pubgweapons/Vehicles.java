package com.example.ssj3_gotanks.pubgweapons;

/**
 * Created by SSJ3_Gotanks on 10/16/2017.
 */

public class Vehicles {
    private String name;
    private String capacity;
    private String topSpeed;
    private String type;
    public static final Vehicles[] Vehicles = {
            new Vehicles("Buggy", "2", "100Km/H", "Land"),
            new Vehicles("UAZ", "5", "90Km/H", "Land"),
            new Vehicles("Motorcycle", "2", "130Km/H", "Land"),
            new Vehicles("Dacia", "4", "110Km/H", "Land"),
            new Vehicles("PG-117", "5", "90Km/H", "Water")
    };

    //Each Weapon has a name and description
    private Vehicles(String name, String capacity, String topSpeed, String type) {
        this.name = name;
        this.capacity = capacity;
        this.topSpeed = topSpeed;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    public String[] toArray(){
        String[] Vehicle = {
                this.name, this.capacity, this.topSpeed, this.type
        };

        return Vehicle;
    }
}
