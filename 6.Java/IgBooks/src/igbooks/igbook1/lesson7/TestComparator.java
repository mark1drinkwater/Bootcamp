/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbooks.igbook1.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mark
 */
public class TestComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        studentList.add(new Student("Thomas Jefferson", 1111L, 2.8));
        studentList.add(new Student("John Addams", 2222L, 3.8));
        studentList.add(new Student("George Washington", 3333L, 3.5));

        System.out.println("******* Students sorted by Name in ascending order **** ");
        
        Collections.sort(studentList, sortName);
        for (Student st: studentList) {
            System.out.println(st);
        }
        
        System.out.println("\n\n ******* Students sorted by GPA in descending order **** ");
        
        Collections.sort(studentList, sortGpa);
        for (Student st: studentList) {
            System.out.println(st);
        }
    }
    
}
