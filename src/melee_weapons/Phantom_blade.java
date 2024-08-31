package melee_weapons;

public class Phantom_blade implements Properties {
    private int damage;
    private int durability;

    public Phantom_blade(int damage, int durability) {
        this.damage = damage;
        this.durability = durability;
    }

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

    @Override
    public void makeDamage() {
        System.out.println("The Phantom Blade will make " + this.damage + " amount of damage");
    }

    @Override
    public void loseDurability() {
        durability -= 5;
        System.out.println("The Fire Dragonsword lost 5 durability and now has " + this.durability + " durability");
    }

    public void fireBlade() {
        float projectile = damage / 10f;
        System.out.println("The Phantom Blade shoots flying blades with " + projectile + " amount of damage");
    }
}
