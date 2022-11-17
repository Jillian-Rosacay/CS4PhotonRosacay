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
public class FireType extends Monster {
    public FireType(String n, int hp, int b){
        super(n, "fire", "grass", "water", hp, b);
        this.atk = b*1.3;
        this.def = b*0.7;
    }
    
    @Override
    public void special(){
        super.special();
        atk += 2;
        hp -= 0.1*maxHP;
    }
}
