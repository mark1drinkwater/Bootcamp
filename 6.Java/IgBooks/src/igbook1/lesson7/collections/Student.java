/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mark
 */
public class Student implements Comparable<Student> {

    private String name;
    private Long id;
    private double gpa = 0.0;

    public Student(String name, Long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }
    
    public Double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return getName();
    }

    public static void main(String[] args) {
        Set<Student> studentList = new TreeSet<>();

        studentList.add(new Student("Thomas Jefferson", 1111L, 5.8));
        studentList.add(new Student("George Washington", 3333L, 3.4));
        studentList.add(new Student("John Adams", 222222222222222222L, 1.9));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

//    @Override
//    // Sort name in ascending order
//    public int compareTo(Student s) {        
//        int result = this.getName().compareTo(s.getName());
//        
//        if (result > 0) {
//            return 1;
//        } else if (result < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
       
    // Sort gpa in ascending order
    @Override
        public int compareTo(Student s) {        
        int result = this.getGpa().compareTo(s.getGpa());
        // 3 1 2
        // 3.(1)
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
// Sort the name in descending order.
//        public int compareTo(Student s) {        
//        int result = this.getName().compareTo(s.getName());
//        
//        if (result < 0) {
//            return 1;
//        } else if (result > 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

}
