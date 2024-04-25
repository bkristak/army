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

    @Override
    public void specialAbility (String fightCommand, String SPECIAL_ABILITY) {
        SPECIAL_ABILITY = "frenzy";
        if (fightCommand.equals(SPECIAL_ABILITY)) {
            System.out.println(getSoldierType() + " " + getName() + " enters a state of frenzy.");
        }
    }
}
