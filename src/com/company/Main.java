package com.company;

public class Main {

    public static void main(String[] args) {
	Heroes heroes = new Heroes();
	Boss boss = new Boss();
	boss.setHp(500);
	boss.setDamage(100);

        System.out.println("Здоровье босса: " + boss.getHp() + " HP ");
        System.out.println("Урон босса: " + boss.getDamage() + " damage");
	Weapon weapon = new Weapon("Босс выбрал вид оружия: Водянной", "Босс выбрал оружие: Пулемет");
        System.out.println(weapon.getWeaponType());
        System.out.println(weapon.getWeaponName());
        System.out.println(heroes.getDefenceType());

    }
}
