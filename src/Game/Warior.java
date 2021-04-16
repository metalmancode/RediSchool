package Game;

public class Warior {
    protected int health;
    protected int damagePoints;
    protected Weapon weapon;
    protected String name;

    public Warior() {
        health = 100;
        damagePoints = 5;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Warior warior) {

        if (weapon == null) {
            System.out.println("weapon is null");


        } else {
            System.out.println("weapon is not null. " + weapon.name + " selected!");
            damagePoints = weapon.damagePoint;
            System.out.println("new damagePoint is : " + damagePoints + " because " + weapon.name + " is selected");

        }
        warior.defend(damagePoints);
    }

    public void defend(int damage) {
        System.out.println(this.getName() + " health befor attack is: " + this.health);
        System.out.println(this.getName() + " DamagePoints is now " + damage);
        this.health = this.health - damage;
        System.out.println(this.getName() + " new health after attack is " + this.health);
        System.out.println("--------------------------------------------------");
    }


}
