/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHOTON
 */
public class Singer {
    String name, favoriteSong;
    int age, noOfPerformances;
    double earnings;
    
    public Singer(String n, int a, int nOPr){
        name = n;
        age = a;
        noOfPerformances = nOPr;
    }
    
    public void favoriteSong(String f){
        favoriteSong = f;
    }
    
    public void changeFavSong(String c){
        favoriteSong = c;
    }
    
    public void performForAudience(int p){
        noOfPerformances += 1;
        earnings += 100 * p;
    }
}
