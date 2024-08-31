package melee_weapons;

public class Fire_dragonsword implements Properties {
    private int damage;
    private int durability;

    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public Fire_dragonsword(int damage, int durability) {
        this.damage = damage;
        this.durability = durability;
    }

    @Override
    public void makeDamage() {
        System.out.println("The Fire Dragonsword will make " + this.damage + " amount of damage");
    }

    @Override
    public void loseDurability() {
        durability -= 1;
        System.out.println("The Fire Dragonsword lost 1 durability and now has " + this.durability + " durability");
    }

    public void igniteEnemies() {
        float fire_damage = damage / 5f;
        System.out.println("The Fire Dragonsword ignites enemies and they now take " + fire_damage + " damage every second");
    }
}
