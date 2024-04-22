package atomcode.army;

public abstract class Soldier {
    private String name;
    private final int damage;
    private final String specialAbility;
    private final String soldierType;

    public Soldier(String name, int damage, String specialAbility, String soldierType) {
        this.name = name;
        this.damage = damage;
        this.specialAbility = specialAbility;
        this.soldierType = soldierType;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public String getSoldierType () {
        return soldierType;
    }
}
