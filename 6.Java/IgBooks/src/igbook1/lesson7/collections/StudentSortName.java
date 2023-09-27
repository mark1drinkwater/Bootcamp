package igbook1.lesson7.collections;

import java.util.Comparator;

public class StudentSortName implements Comparator<Student> {

    public static void main(String[] args) {
        
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());      
        return result;
    }
    
}
