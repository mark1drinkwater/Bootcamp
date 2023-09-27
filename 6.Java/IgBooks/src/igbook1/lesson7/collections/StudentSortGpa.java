/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7.collections;

import java.util.Comparator;

/**
 *
 * @author Mark
 */
public class StudentSortGpa implements Comparator<Student> {

    public static void main(String[] args) {
        
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() < s2.getGpa()) {
            return 1;
        }
        else if (s1.getGpa() > s2.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
