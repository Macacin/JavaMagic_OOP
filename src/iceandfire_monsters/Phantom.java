package iceandfire_monsters;

import java.util.Random;

public class Phantom {
    float health;
    float damage;
    boolean spawns_when_chest_opened;
    boolean spawns_only_when_night;
    int spawn_rate;
    String[] special_abilities = new String[3];

    public Phantom(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Phantom(int health, int damage, boolean spawns_when_chest_opened, boolean spawns_only_when_night, int spawn_rate, String[] special_abilities) {
        this.health = health;
        this.damage = damage;
        this.spawns_when_chest_opened = spawns_when_chest_opened;
        this.spawns_only_when_night = spawns_only_when_night;
        this.spawn_rate = spawn_rate;
        this.special_abilities = special_abilities;
    }

    public float getHealth() {
        return health;
    }

    public float getDamage() {
        return damage;
    }

    public boolean isSpawns_when_chest_opened() {
        return spawns_when_chest_opened;
    }

    public boolean isSpawns_only_when_night() {
        return spawns_only_when_night;
    }

    public int getSpawn_rate() {
        return spawn_rate;
    }

    public String[] getSpecial_abilities() {
        return special_abilities;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public String team_up(Simphaly_birds simphaly_birds) {
        int wants_to_team = new Random().nextInt(0, 10);
        for (int i = 0; i < this.special_abilities.length; i++) {
            if (special_abilities[i] == null) {
                return "This Phantom doesn't have any special_abilities.";
            } else {
                if (special_abilities[i].equals("Leader") &&
                        (simphaly_birds.getDamage() <= 2.0f) &&
                        (simphaly_birds.getHealth() <= 10.0f) &&
                        (wants_to_team > 5)) {
                    return "This Phantom became the chief of the weak ones!";
                } else if (special_abilities[i].equals("Leader") &&
                        (simphaly_birds.getDamage() <= 2.0f) &&
                        (simphaly_birds.getHealth() <= 10.0f) &&
                        (wants_to_team <= 5)) {
                    return "This Phantom isn't in the mood of helping the peasant ones.";
                } else if (!special_abilities[i].equals("Leader")) {
                    return "This Phantom doesn't posses leadership skills";
                }
            }
        }
        return "";
    }
}
