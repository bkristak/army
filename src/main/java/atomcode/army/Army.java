package atomcode.army;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Army {
    private Map<String, List<Soldier>> armyMap;

    public Army () {
        this.intializeArmy();
    }

    public void intializeArmy () {

        final List<Soldier> swordsmantList = new ArrayList<>();
        final Swordsman swordman1 = new Swordsman("Swordman-1");
        final Swordsman swordman2 = new Swordsman("Swordman-2");
        swordsmantList.add(swordman1);
        swordsmantList.add(swordman2);

        final List<Soldier> archerList = new ArrayList<>();
        final Archer archer1 = new Archer("Archer-1");
        final Archer archer2 = new Archer("Archer-2");
        final Archer archer3 = new Archer("Archer-3");
        archerList.add(archer1);
        archerList.add(archer2);
        archerList.add(archer3);

        final List<Soldier> spearmanList = new ArrayList<>();
        final Spearman spearman1 = new Spearman("Spearman-1");
        final Spearman spearman2 = new Spearman("Spearman-2");
        spearmanList.add(spearman1);
        spearmanList.add(spearman2);

        final List<Soldier> berserkList = new ArrayList<>();
        final Berserk berserk1 = new Berserk("Berserk-1");
        berserkList.add(berserk1);

        final List<Soldier> knightList = new ArrayList<>();
        final Knight knight1 = new Knight("Knight-1");
        final Knight knight2 = new Knight("Knight-2");
        final Knight knight3 = new Knight("Knight-3");
        knightList.add(knight1);
        knightList.add(knight2);
        knightList.add(knight3);

        this.armyMap = new HashMap<>();
        armyMap.put("Swordman", swordsmantList);
        armyMap.put("Archer", archerList);
        armyMap.put("Spearman", spearmanList);
        armyMap.put("Berserk", berserkList);
        armyMap.put("Knight", knightList);
    }

    public Map<String, List<Soldier>> getArmyMap () {
        return this.armyMap;
    }


}
