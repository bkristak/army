package atomcode;

import atomcode.action.Action;
import atomcode.action.Report;
import atomcode.action.SpecialAction;
import atomcode.action.StandardAction;
import atomcode.army.Army;

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

        fightCommand = "chopp";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "block";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "smash";
        getFightCommandToSoldiers(fightCommand, army);

        fightCommand = "fire";
        getFightCommandToSoldiers(fightCommand, army);
    }


    public static void getFightCommandToSoldiers (String fightCommand, Army army) {
        notification = fightCommand.toUpperCase();
        String divider = "- - - - - " + notification + " - - - - -";
        System.out.println(divider);

        if (fightCommand.equals("report")) {
            reportCommand(fightCommand, army);
            System.out.println();
        } else if (fightCommand.equals("offensive strike") || fightCommand.equals("defensive formation")) {
            standardCommand(fightCommand, army);
            System.out.println();
        } else {
            specialCommand(fightCommand, army);
            System.out.println();
        }
    }

    public static void reportCommand(String fightCommand, Army army) {
        Action reportAction = new Report();
        reportAction.command(fightCommand, army.getArmyMap());
    }

    public static void standardCommand(String fightCommand, Army army) {
        Action standardAction = new StandardAction();
        standardAction.command(fightCommand, army.getArmyMap());
    }

    public static void specialCommand(String fightCommand, Army army) {
        Action specialAction = new SpecialAction();
        specialAction.command(fightCommand, army.getArmyMap());
    }

}