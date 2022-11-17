/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07photonrosacayjillian;

import java.util.ArrayList;

/**
 *
 * @author PHOTON
 */
public class Location {
    private String name;
    private ArrayList<Character> personList;
    private String localSpecialty;

    public Location(String n){
        this.name = n;
        this.localSpecialty = null;
        this.personList = new ArrayList<>();
    }
    public Location(String n, String s){
        this.name = n;
        this.localSpecialty = s;
        this.personList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Character> getPersonList(){
        return personList;
    }
    public void addPerson(Character c){
        personList.add(c);
    }
    public void removePerson(Character c){
        personList.remove(c);
    }
}
