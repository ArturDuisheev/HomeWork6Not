public class Boss extends GameEntity {

    private WeaponType weapon;

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return "Damage: " + getDamage() + " Health: " + getHealth() + " Weapon Type: " + WeaponType.gunShot + " Weapon Name: " + getWeaponName();


    }
}