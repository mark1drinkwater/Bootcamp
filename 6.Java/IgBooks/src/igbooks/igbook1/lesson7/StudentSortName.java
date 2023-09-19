/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbooks.igbook1.lesson7;

import java.util.Comparator;

/**
 *
 * @author Mark
 */
public class StudentSortName implements Comparator<Student> {

    public static void main(String[] args) {
        
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());      
        return result;
    }
    
}
