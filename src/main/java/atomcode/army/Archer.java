package atomcode.army;

import atomcode.interfaces.Defensive;

public class Archer extends Soldier implements Defensive {
    public Archer (String name) {
        super(name, 2, "Archer");
    }

    @Override
    public void defense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }
}
