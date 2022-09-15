/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHOTON
 */
public class Venue {
    String name, venue;
    
    public Venue(String n, String v){
        name = n;
        venue = v;
        System.out.println(n + " will perform at " + v +"!");
    }
}
