package atomcode.action;

import atomcode.army.Army;
import atomcode.army.Soldier;

import java.util.List;
import java.util.Map;

public interface Action {

    public void command(String fightCommand, Map<String, List<Soldier>> armyMap);
}
