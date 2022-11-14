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
public class main {
    public static void main(String[] args) {
        Monster minho = new FireType("minho", 24, 10);
        Monster hyunjin = new GrassType("hyunjin", 22, 3);
        Monster jisung = new WaterType("jisung", 22, 9);
        
        do{
            minho.attack(hyunjin);
            hyunjin.rest();
            hyunjin.attack(minho);
        } while(minho.getHP() == 0 || hyunjin.getHP() == 0);
    }
}
