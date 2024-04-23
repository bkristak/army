package atomcode.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldierList;

    public Army () {
        this.intializeArmy();
    }

    public void intializeArmy () {
        soldierList = new ArrayList<>();

        final Soldier swordman1 = new Swordsman("Swordman-1");
        soldierList.add(swordman1);
        final Soldier swordman2 = new Swordsman("Swordman-2");
        soldierList.add(swordman2);
        final Soldier archer1 = new Archer("Archer-1");
        soldierList.add(archer1);
        final Soldier archer2 = new Archer("Archer-2");
        soldierList.add(archer2);
        final Soldier archer3 = new Archer("Archer-3");
        soldierList.add(archer3);
        final Soldier spearman1 = new Spearman("Spearman-1");
        soldierList.add(spearman1);
        final Soldier spearman2 = new Spearman("Spearman-2");
        soldierList.add(spearman2);
        final Soldier berserk1 = new Berserk("Berserk-1");
        soldierList.add(berserk1);
        final Soldier knight1 = new Knight("Knight-1");
        soldierList.add(knight1);
        final Soldier knight2 = new Knight("Knight-2");
        soldierList.add(knight2);
        final Soldier knight3 = new Knight("Knight-3");
        soldierList.add(knight3);
    }

    public List<Soldier> getSoldierList () {
        return this.soldierList;
    }


}
