package atomcode.action;

import atomcode.army.Soldier;

import java.util.List;
import java.util.Map;

public class Report implements Action {

    @Override
    public void command (String fightCommand, Map<String, List<Soldier>> armyMap) {
        for (Map.Entry<String, List<Soldier>> soldierList : armyMap.entrySet()) {
            String soldierClass = soldierList.getKey();
            for (Soldier soldier : soldierList.getValue()) {
                String soldierName = soldier.getName();
                int soldierDamage = soldier.getDamage();
                String soldierType = soldier.getSoldierType();
                System.out.println("Soldier class: " + soldierClass +
                        ", Type: " + soldierType +
                        ", Name: " + soldierName +
                        " = READY FOR THE FIGHT.");
            }
        }
    }
}
