/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise13photonrosacayjillian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jillian
 */
public class SubjectController implements ActionListener, KeyListener{
    private JLabel header, subjectImg, subjectName, subjectUnits, subjectGrade;
    private JTextField searchedSub;
    private JButton previous, next, search;
    private int subIndex, max;
    private Subject currentSubject;
    private static Subject[] subjectList;
   
    public SubjectController(SubjectGUI gui){
        header = gui.getHeader();
        searchedSub = gui.getSearchedSub();
        subjectList = gui.getSubjectList();
        subjectImg = gui.getSubjectImg();
        subjectName = gui.getSubjectName();
        subjectUnits = gui.getSubjectUnits();
        subjectGrade = gui.getSubjectGrade();
        previous = gui.getPrevious();
        next = gui.getNext();
        search = gui.getSearch();      
        previous.addActionListener(this);
        next.addActionListener(this);
        search.addActionListener(this);
        
        currentSubject = Subject.searchSubject(subjectName.getText());
        /*to get currently displayed subject's index and use it to
        determine which are the subjects before and after it*/
        subIndex = Subject.getSubjectIndex(currentSubject);
        max = subjectList.length - 1; /*is used because subIndex++ will exceed array length
        if only (subIndex < subjectList) is used i.e. if array length is 5, 4 can be allowed
        as a subIndex. it will be then increased by 1 which makes it an index of 5 which does
        not exist in the array*/
        
        checkPosition(); // so next and previous buttons can be disabled as needed upon declaration
    } 
    
    /* checks if the first or last subject in the list is being displayed
    so that it can disable the needed buttons*/
    public void checkPosition(){
        if(subIndex == 0){
            previous.setEnabled(false);
            next.setEnabled(true);
            header.setText("There is no more previous subject");
            header.setForeground(Color.RED);
        } else if (subIndex == max){
            previous.setEnabled(true);
            next.setEnabled(false);
            header.setText("There is no more next subject");
            header.setForeground(Color.RED);
        } else {
            previous.setEnabled(true);
            next.setEnabled(true);
            // returns the header to normal
            header.setText("Search for a subject (write full name)");
            header.setForeground(Color.BLACK);
        }
    }
    
    //changes the subject details on screen based on index number
    public void changeSubject(int i){
        Subject c = subjectList[i];       
        subjectImg.setIcon(new ImageIcon(main.class.getResource(c.getImgFileName())));
        subjectName.setText(c.getName());
        subjectUnits.setText(String.valueOf(c.getUnits()));
        subjectGrade.setText(String.valueOf(c.getGrade()));
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == previous){
            subIndex--; // gets index number of prev subject
            changeSubject(subIndex);
            checkPosition();
        }
        if(a.getSource() == next){ 
            subIndex++; // gets index number of next subject
            changeSubject(subIndex);
            checkPosition();
        }
        if(a.getSource() == search){
            String searched = searchedSub.getText();
            try{ 
                subIndex = Subject.getSubjectIndex(Subject.searchSubject(searched));
                changeSubject(subIndex);
                checkPosition();
                header.setText("Subject found!");
                header.setForeground(Color.GREEN);
            }
            catch(NullPointerException e){
                header.setText("Subject does not exist.");
                header.setForeground(Color.RED);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}