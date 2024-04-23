package atomcode.army;


import atomcode.interfaces.Defensive;
import atomcode.interfaces.Offensive;

public class Swordsman extends Soldier implements Offensive, Defensive {

    public Swordsman (String name) {
        super (name, 3, "Swordsman");
    }

    @Override
    public void defense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void offense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }
}
