package atomcode;

import atomcode.army.Army;
import atomcode.army.Soldier;
import atomcode.interfaces.Defensive;
import atomcode.interfaces.Flank;
import atomcode.interfaces.Offensive;

import javax.swing.*;
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
    }


    public static void getFightCommandToSoldiers (String fightCommand, Army army) {
        notification = fightCommand.toUpperCase();
        String divider = "- - - - - " + notification + " - - - - -";
        System.out.println(divider);

        List<Soldier> soldierList = army.getSoldierList();
        for (Soldier soldier : soldierList) {
            String soldierClass = soldier.soldierClass(soldier);
            switch (fightCommand) {
                case "report":
                    soldier.report(soldierClass);
                    break;
                case "offensive strike":
                    if (soldier.getSoldierClass().equals("ADAPTABLE") || soldier.getSoldierClass().equals("OFFENSIVE")) {
                        ((Offensive) soldier).offense();
                    }
                    break;
                case "defensive formation":
                    if (soldier.getSoldierClass().equals("ADAPTABLE") || soldier.getSoldierClass().equals("DEFENSIVE")) {
                        ((Defensive) soldier).defense();
                    }
                    break;
                case "flank":
                    if (soldier instanceof Flank) {
                        ((Flank) soldier).flank();
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + fightCommand);
            }
        }
        System.out.println();
    }
}