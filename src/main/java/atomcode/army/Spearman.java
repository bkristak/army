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

    @Override
    public void specialAbility (String fightCommand, String SPECIAL_ABILITY) {
        SPECIAL_ABILITY = "phalanx";
        if (fightCommand.equals(SPECIAL_ABILITY)) {
            System.out.println(getSoldierType() + " " + getName() + " adopts phalanx formation.");
        }
    }
}
