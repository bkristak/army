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

    @Override
    public void specialAbility (String fightCommand, String SPECIAL_ABILITY) {
        SPECIAL_ABILITY = "precision";
        if (fightCommand.equals(SPECIAL_ABILITY)) {
            System.out.println(getSoldierType() + " " + getName() + " takes careful aim, delivering a precise shot.");
        }
    }
}
