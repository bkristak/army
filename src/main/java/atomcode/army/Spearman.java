package atomcode.army;

import atomcode.interfaces.Defensive;

public class Spearman extends Soldier implements Defensive {
    public Spearman (String name) {
        super(name, 4, "Spearman");
    }

    @Override
    public void defense () {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }
}
