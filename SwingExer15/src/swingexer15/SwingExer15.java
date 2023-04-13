/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingexer15;

import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Lauan 03
 */
public class SwingExer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStream s1 = SwingExer15.class.getClassLoader().getResourceAsStream("swingexer15/student1.csv");
        InputStreamReader s1r = new InputStreamReader(s1);
        BufferedReader reader = new BufferedReader(s1r);
        
        String line;
        
        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");
            new Subject(details[0], details[1], Double.parseDouble(details[2]), Double.parseDouble(details[3]));
        }
        
        reader.close();
        
        new Menu();
    }
    
}
