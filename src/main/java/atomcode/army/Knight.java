package atomcode.army;

import atomcode.interfaces.Flank;
import atomcode.interfaces.Offensive;

public class Knight extends Soldier implements Offensive, Flank {

    public Knight (String name) {
        super (name, 5, "Knight");
    }

    @Override
    public void offense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void flank() {
        System.out.println(getSoldierType() + " " + getName() + " is flanking.");
    }
}
