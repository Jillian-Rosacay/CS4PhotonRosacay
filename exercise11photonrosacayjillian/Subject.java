package exercise11photonrosacayjillian;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jillian
 */
public class Subject {
    private String name, imgFileName;
    private double units, grade;
    private ArrayList<Subject> subjectList = new ArrayList();
	
    public Subject(String n, String i, double u, double g){
        this.name = n;
        this.imgFileName = i;
        this.units = u;
        this.grade = g;
        subjectList.add(this);
    }
    public String getName() {
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public double getUnits() {
        return units;
    }
    public void setUnits(double units) {
        units = units;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        grade = grade;
    }
}
