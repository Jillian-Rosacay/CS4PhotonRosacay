/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise13photonrosacayjillian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.GroupLayout.Alignment.*;
import java.util.ArrayList;

/**
 *
 * @author Jillian
 */
public class SubjectGUI extends JFrame{
    private JLabel header, subjectImg, subjectName, subjectUnits, subjectGrade,
            nameLabel, unitsLabel, gradeLabel;
    private JTextField searchedSub;
    private JButton previous, next, search;
    private SubjectController controller;
    private Subject[] subjectList;
    
    private JPanel main, northPanel, southPanel;
    
    public SubjectGUI(Subject subList[], int index){
        super("Subject List");
        
        subjectList = subList.clone(); //so this class has copy of the array too
        
        header = new JLabel("Search for a subject (write full name)");
        searchedSub = new JTextField(10);
        previous = new JButton("Previous");
        next = new JButton("Next");
        search = new JButton("Search");
        nameLabel = new JLabel("Subject: ");
        subjectName = new JLabel(subList[index].getName());
        unitsLabel = new JLabel("Units: ");
        subjectUnits = new JLabel(String.valueOf(subList[index].getUnits()));
        gradeLabel = new JLabel("Grade: ");
        subjectGrade = new JLabel(String.valueOf(subList[index].getGrade()));
        subjectImg = new JLabel();
        ImageIcon img = new ImageIcon(main.class.getResource(subList[index].getImgFileName()));
        subjectImg.setIcon(img);
        
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        northPanel.add(header);
        northPanel.add(searchedSub);
        northPanel.add(search);
        
        main = new JPanel();
        GroupLayout layout = new GroupLayout(main);
        main.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(subjectImg)
                .addComponent(nameLabel)
                .addComponent(unitsLabel)
                .addComponent(gradeLabel))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(subjectName)
                .addComponent(subjectUnits)
                .addComponent(subjectGrade))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(subjectImg)
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(nameLabel)
                .addComponent(subjectName))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(unitsLabel)
                .addComponent(subjectUnits))
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(gradeLabel)
                .addComponent(subjectGrade))
        );
        
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        southPanel.add(previous);
        southPanel.add(next);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 300);
        this.setLayout(new BorderLayout(10, 10));
        this.add(northPanel, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        
        controller = new SubjectController(this);
    }
    
    public JLabel getHeader(){
        return header;
    }
    
    public JTextField getSearchedSub(){
        return searchedSub;
    }
    
    public JButton getSearch(){
        return search;
    }
    
    //since I can't edit Subject class, I decided to put it here :)
    public Subject[] getSubjectList(){
        return subjectList;
    }
    
    public JLabel getSubjectImg(){
        return subjectImg;
    }
    
    public JLabel getSubjectName(){
        return subjectName;
    }
    
    public JLabel getSubjectUnits(){
        return subjectUnits;
    }
    
    public JLabel getSubjectGrade(){
        return subjectGrade;
    }
    
    public JButton getPrevious(){
        return previous;
    }
    
    public JButton getNext(){
        return next;
    }
}
