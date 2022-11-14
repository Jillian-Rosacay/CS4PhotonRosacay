/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06photonrosacayjillian;

/**
 *
 * @author PHOTON
 */
public class WaterType extends Monster {
    
    
    public WaterType(String n, int hp, int b){
        super(n, "water", "fire", "grass", hp, b);
        this.atk = b*0.7;
        this.def = b*1.3;
    }
    
    @Override
    public void special(){
        super.special();
        def += 2;
        maxHP -= 0.1*maxHP;
    }
}
