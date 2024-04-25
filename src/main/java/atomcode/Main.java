package atomcode;

import atomcode.army.Army;
import atomcode.army.Soldier;
import atomcode.interfaces.Defensive;
import atomcode.interfaces.Offensive;

import java.util.List;

public class Main {
    private final static Army army = new Army();
    private static String fightCommand;
    private static String notification;

    public static void main(String[] args) {
        fightCommand = "report";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "offensive strike";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "defensive formation";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "flank";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "phalanx";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "frenzy";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "dual-strike";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "precision";
        getFightCommandToSoldiers(fightCommand, army);
    }


    public static void getFightCommandToSoldiers (String fightCommand, Army army) {
        notification = fightCommand.toUpperCase();
        String divider = "- - - - - " + notification + " - - - - -";
        System.out.println(divider);

        List<Soldier> soldierList = army.getSoldierList();
        String specialAbility = "";

        for (Soldier soldier : soldierList) {
            String soldierClass = soldier.soldierClass(soldier);

           if (fightCommand.equals("report")) {
               soldier.report(soldierClass);
           } else if (fightCommand.equals("offensive strike") && soldier instanceof Offensive) {
               ((Offensive) soldier).offense();
           } else if (fightCommand.equals("defensive formation") && soldier instanceof Defensive) {
               ((Defensive) soldier).defense();
           } else {
               soldier.specialAbility(fightCommand, specialAbility);
           }
        }
        System.out.println();
    }
}