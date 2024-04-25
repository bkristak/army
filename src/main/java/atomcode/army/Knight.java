package atomcode.army;

import atomcode.interfaces.Offensive;

public class Knight extends Soldier implements Offensive {

    public Knight (String name) {
        super (name, 5, "Knight");
    }

    @Override
    public void offense() {
        System.out.println(getSoldierType() + " " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void specialAbility (String fightCommand, String SPECIAL_ABILITY) {
        SPECIAL_ABILITY = "flank";
        if (fightCommand.equals(SPECIAL_ABILITY)) {
            System.out.println(getSoldierType() + " " + getName() + " is flanking.");
        }
    }
}
