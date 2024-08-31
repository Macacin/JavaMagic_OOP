package iceandfire_monsters;

public class Simphaly_birds {
    float health;
    float damage;
    boolean spawns;
    String[] bioms_spawn;
    int[] spawn_radius = new int[2];

    public Simphaly_birds(float health, float damage, boolean spawns, String[] bioms_spawn, int[] spawn_radius) {
        this.health = health;
        this.damage = damage;
        this.spawns = spawns;
        this.bioms_spawn = bioms_spawn;
        this.spawn_radius = spawn_radius;
    }

    public Simphaly_birds(float health, float damage) {
        this.health = health;
        this.damage = damage;
    }

    public Simphaly_birds(boolean spawns, String[] bioms_spawn, int[] spawn_radius) {
        this.spawns = spawns;
        this.bioms_spawn = bioms_spawn;
        this.spawn_radius = spawn_radius;
    }

    public Simphaly_birds() {
    }

    public float getHealth() {
        return health;
    }

    public float getDamage() {
        return damage;
    }

    public boolean isSpawns() {
        return spawns;
    }

    public String[] getBioms_spawn() {
        return bioms_spawn;
    }

    public int[] getSpawn_radius() {
        return spawn_radius;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void buff_by_biome() {
        for (int i=0; i < (this.bioms_spawn.length); i++) {
            if (bioms_spawn[i].equals("swamp")) {
                this.damage += 5f;
                this.health *= 2f;
            } else if (bioms_spawn[i].equals("pine_forest")) {
                this.damage += 3f;
                this.health *= 1.5f;
            } else {
                this.damage *= 0.8f;
                this.health *= 0.8f;
            }
        }
        System.out.printf("The bird now has %f damage and %f\n", this.damage, this.health);
    }

    public float[] boss_warning() {
        if ((this.damage >= 10) && (this.health >= 60)) {
            System.out.printf(
                    "This bird with the following stats: (damage: %f, health: %f) seems to be a boss! Be careful!\n",
                    this.damage, this.health);
        }
        return (new float[]{this.damage, this.health});
    }


}
