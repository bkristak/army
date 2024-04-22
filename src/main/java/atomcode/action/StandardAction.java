package atomcode.action;

import atomcode.army.Soldier;

import java.util.List;
import java.util.Map;

public class StandardAction implements Action{

    @Override
    public void command (String fightCommand, Map<String, List<Soldier>> armyMap) {
        for (Map.Entry<String, List<Soldier>> soldierList : armyMap.entrySet()) {
            String soldierClass = soldierList.getKey();
            for (Soldier soldier : soldierList.getValue()) {
                String soldierName = soldier.getName();
                int soldierDamage = soldier.getDamage();
                String soldierType = soldier.getSoldierType();
                if (soldierType.equals("ADAPTABLE") || fightCommand.toUpperCase().contains(soldierType)) {
                    System.out.println(soldierClass + " " +
                            soldierName + " deals " + soldierDamage +
                            " damage.");
                }
            }
        }
    }
}
