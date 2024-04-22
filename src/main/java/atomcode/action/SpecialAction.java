package atomcode.action;

import atomcode.army.Soldier;

import java.util.List;
import java.util.Map;

public class SpecialAction implements Action {

    @Override
    public void command (String fightCommand, Map<String, List<Soldier>> armyMap) {
        for (Map.Entry<String, List<Soldier>> soldierList : armyMap.entrySet()) {
            String soldierClass = soldierList.getKey();
            for (Soldier soldier : soldierList.getValue()) {
                String specialAbility = soldier.getSpecialAbility();
                if (specialAbility.contains(fightCommand)) {
                    System.out.println(soldierClass + " formation is " + specialAbility + ".");
                }
            }
        }
    }
}
