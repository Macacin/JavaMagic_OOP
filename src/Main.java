import iceandfire_monsters.Dragon;
import iceandfire_monsters.Phantom;
import iceandfire_monsters.Simphaly_birds;
import iceandfire_monsters.Spell;
import melee_weapons.Fire_dragonsword;
import melee_weapons.Phantom_blade;

public class Main {
    public static void main(String[] args) {
        Simphaly_birds bird_1 = new Simphaly_birds();
        Simphaly_birds bird_2 = new Simphaly_birds(80, 15);
        Simphaly_birds bird_3 = new Simphaly_birds(true, new String[]{"swamp", "desert", "pine_forest"}, new int[]{12, 16});
        Simphaly_birds bird_4 = new Simphaly_birds(5, 2, true, new String[]{"desert"}, new int[]{2, 4});

        Phantom phantom1 = new Phantom(120, 20);
        Phantom phantom2 = new Phantom(200, 30, false, true, 1, new String[]{"Warlord", "Leader"});

        bird_3.setHealth(20);
        bird_3.setDamage(5);
        bird_3.buff_by_biome();

        bird_2.boss_warning();

        phantom2.team_up(bird_4);

        Dragon dragon1 = new Dragon("Small Flamey", 1, "fire", false);
        Dragon dragon2 = new Dragon("Average Icy", 3, "ice", true);
        Dragon dragon3 = new Dragon("Wise Stormlord", 5, "storm", true);

        Spell spell1 = new Spell("Puke", 1);
        Spell spell2 = new Spell("Ice machinegun", 6);
        Spell spell3 = new Spell("Storm hadooken", 7);

        dragon1.castSpell(spell1);
//        dragon1.castSpell(spell3);
//        dragon2.castSpell(spell1);
//        dragon2.castSpell(spell2);
//        dragon3.castSpell(spell2);
        dragon3.castSpell(spell3);

        Phantom_blade blade1 = new Phantom_blade(12, 1000);
        Fire_dragonsword fsword1 = new Fire_dragonsword(16, 2000);

        blade1.fireBlade();
        blade1.loseDurability();
        blade1.makeDamage();

        fsword1.igniteEnemies();
        fsword1.loseDurability();
        fsword1.makeDamage();
    }
}