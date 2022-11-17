/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07photonrosacayjillian;

/**
 *
 * @author PHOTON
 */
public class GrassType extends Monster {
    
    
    public GrassType(String n, int hp, int b){
        super(n, "grass", "water", "fire", hp, b);
    }
    
    @Override
    public void rest(){
        hp += maxHP * 0.15;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special(){
        super.special();
        hp += 0.2*maxHP;
    }
    
}
