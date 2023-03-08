/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise13photonrosacayjillian;

import javax.swing.*;

/**
 *
 * @author Jillian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array initialization so array methods can be used in other classes
        /* used because array method in Subject class is private and has no
        getter methods using index number*/
        
        Subject[] subjectList = new Subject[5];
        subjectList[0] = new Subject("Math", "math.png", 4, 1.75);
        subjectList[1] = new Subject("Biology", "biology.png", 3, 2.0);
        subjectList[2] = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        subjectList[3] = new Subject("Physics", "physics.png", 3, 1.75);
        subjectList[4] = new Subject("CS", "computer science.png", 1, 1.5);
        
        JFrame window = new SubjectGUI(subjectList, 0);
        window.setVisible(true);
    }
    
}
