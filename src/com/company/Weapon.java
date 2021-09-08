package com.company;

public class Weapon {
    private String WeaponType;
    private String WeaponName;

    public Weapon(){

    }
    public Weapon(String WeaponType,String WeaponName){
    this.WeaponType = WeaponType;
    this.WeaponName = WeaponName;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }
    public String getWeaponType(){
        return WeaponType;
    }

    public void setWeaponType(String weaponType){
        weaponType = weaponType;
    }
}

