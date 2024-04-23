package atomcode.army;

import atomcode.interfaces.Defensive;
import atomcode.interfaces.Offensive;

public abstract class Soldier {
    private String name;
    private final int damage;
    private final String soldierType;
    private String soldierClass;

    public Soldier(String name, int damage, String soldierType) {
        this.name = name;
        this.damage = damage;
        this.soldierType = soldierType;
        this.soldierClass = soldierClass(this);
    }

    public String soldierClass (Soldier soldier) {
        if (soldier instanceof Offensive && soldier instanceof Defensive) {
            return "ADAPTABLE";
        } else if (soldier instanceof Offensive && !(soldier instanceof Defensive)) {
            return "OFFENSIVE";
        } else if (soldier instanceof Defensive && !(soldier instanceof Offensive)) {
            return "DEFENSIVE";
        }
        return "unknown";
    }
    public void report (String soldierClass) {
        soldierClass = soldierClass(this);
        System.out.println("Soldier" + soldierType + " " + name + " here! Type - " + soldierClass);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getSoldierType () {
        return soldierType;
    }

    public String getSoldierClass () {return soldierClass;}

}
