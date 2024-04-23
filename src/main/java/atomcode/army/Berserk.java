package atomcode.army;

import atomcode.interfaces.Defensive;

public class Berserk extends Soldier implements Defensive {
    public Berserk(String name) {
        super(name, 3, "Berserk");
    }


    @Override
    public void defense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }
}
