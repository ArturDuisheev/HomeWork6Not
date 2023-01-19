public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setWeaponName("AK47");
        boss.setHealth(700);
        boss.setDamage(40);
        System.out.println(boss.info());
    }

}