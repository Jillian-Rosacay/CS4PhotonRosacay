/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PHOTON
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singer jisung = new Singer("Jisung", 22, 5);
        Singer felix = new Singer("Felix", 22, 4);
        Singer seungmin = new Singer ("Seungmin", 21, 7);
        
        System.out.println(jisung.name + felix.name + seungmin.name);
        System.out.println(jisung.age);
        
        jisung.performForAudience(2);
        jisung.favoriteSong("Charmer");
        
        Song list1 = new Song("God's Menu", "Miroh", "Red Lights");
        
        Venue moa = new Venue("Jisung", "MOA");
        Venue bgc = new Venue("Felix", "BGC");
        Venue pisay = new Venue("Seungmin", "Pisay");
        
        System.out.println(jisung.noOfPerformances);
        System.out.println(jisung.earnings);
        System.out.println(jisung.favoriteSong);
        
        jisung.changeFavSong("Sunshine");
        System.out.println(jisung.favoriteSong);
    }
    
}
