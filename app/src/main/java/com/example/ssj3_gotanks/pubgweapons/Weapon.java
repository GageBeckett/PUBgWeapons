package com.example.ssj3_gotanks.pubgweapons;

/**
 * Created by SSJ3_Gotanks on 10/16/2017.
 */

public class Weapon {
    private String name;
    private String description;
    private String damage;
    private String speed;
    private String power;
    private String mag;
    private String TBS;
    private String mode;
    private String ammo;
    public static final Weapon[] WEAPONs = {
            new Weapon("AKM", "Standard map drop", "48", "715", "10000", "30", "0.100s", "Single, Full", "7.62"),
            new Weapon("Groza", "Crate drop", "48", "715", "10000", "30", "0.080s", "Single, Full", "7.62"),
            new Weapon("M16A4", "Standard map drop", "41", "900", "8000", "30", "0.075s", "Single, Burst", "5.56"),
            new Weapon("M416", "Standard map drop", "41", "880", "8500", "30", "0.086s", "Single, Full", "5.56"),
            new Weapon("SCAR-L", "Standard map drop", "41", "870", "9000", "30", "0.096s", "Single, Full", "5.56")
    };

    //Each Weapon has a name and description
    private Weapon(String name, String description, String damage, String speed, String power, String mag, String TBS, String mode, String ammo) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.speed = speed;
        this.power = power;
        this.mag = mag;
        this.TBS = TBS;
        this.mode = mode;
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    public String[] toArray(){
        String[] guns = new String [8];
        guns[0] = this.description;
        guns[1] = this.damage;
        guns[2] = this.speed;
        guns[3] = this.power;
        guns[4] = this.mag;
        guns[5] = this.TBS;
        guns[6] = this.mode;
        guns[7] = this.ammo;

        return guns;
    }
}
