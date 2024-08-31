package iceandfire_monsters;

public class Dragon {

    String name;
    int stage;
    String type;
    boolean isFlying;

    public Dragon(String name, int stage, String type, boolean isFlying) {
        this.name = name;
        if (stage < 1 || stage > 5) {
            throw new IllegalArgumentException("Invalid dragon stage");
        }
        this.stage = stage;

        if (type.equals("fire") || type.equals("ice") || type.equals("storm")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid dragon type");
        }
        this.isFlying = isFlying;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    public String getType() {
        return type;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void castSpell(Spell spell) {
        if (this.stage == 1) {
            if (spell.getPower() == 1) {
                System.out.printf(this.name + " casted a very weak spell named %s \n", spell.getTitle());
            } else {
                throw new IllegalArgumentException(this.name + " is too weak to cast " + spell.getTitle());
            }
        } else if (this.stage == 2) {
            if (spell.getPower() == 2) {
                System.out.printf(this.name + " casted a weak spell named %s \n", spell.getTitle());
            } else if (spell.getPower() < 2) {
                System.out.printf(this.name + " doesn't want to bother anyone with such a pitiful magic, called %s\n", spell.getTitle());
            } else {
                throw new WeakException(this.name + " is too weak to cast " + spell.getTitle());
            }
        } else if (this.stage == 3) {
            if (spell.getPower() == 3) {
                System.out.printf(this.name + " casted a spell %s with a fraction of true power\n", spell.getTitle());
            } else if (spell.getPower() < 3) {
                System.out.printf(this.name + " doesn't want to bother anyone with such a pitiful magic, called %s\n", spell.getTitle());
            } else {
                throw new WeakException(this.name + " is too weak to cast " + spell.getTitle());
            }
        } else if (this.stage == 4) {
            if (spell.getPower() == 4 || spell.getPower() == 5) {
                System.out.printf(this.name + " casted a powerful spell %s\n", spell.getTitle());
            } else if (spell.getPower() < 4) {
                System.out.printf(this.name + " doesn't want to bother anyone with such a pitiful magic, called %s\n", spell.getTitle());
            } else {
                throw new WeakException(this.name + " is too weak to cast " + spell.getTitle());
            }
        } else {
            if (spell.getPower() == 6 || spell.getPower() == 7) {
                System.out.printf(this.name + " casted a spell %s, filled with the true dragon power\n", spell.getTitle());
            } else if (spell.getPower() < 6) {
                System.out.printf(this.name + " doesn't want to bother anyone with such a pitiful magic, called %s\n", spell.getTitle());
            }
        }
    }
}