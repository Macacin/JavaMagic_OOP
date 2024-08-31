package iceandfire_monsters;

public class Spell {
    private String title;
    private int power;

    public Spell(String title, int power) {
        this.title = title;
        if (power < 1 || power > 7) {
            throw new IllegalArgumentException("Invalid power value of " + power);
        }
        this.power = power;
    }

    public Spell() {
    }

    public String getTitle() {
        return title;
    }

    public int getPower() {
        return power;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPower(int power) {
        if (power < 1 || power > 7) {
            throw new IllegalArgumentException("Invalid power value of " + power);
        }
        this.power = power;
    }
}
