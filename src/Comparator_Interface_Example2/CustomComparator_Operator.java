package Comparator_Interface_Example2;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparator_Operator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int IdCompare = o1.getId().compareTo(
                o2.id);
        int NameCompare = o1.getName().compareTo(
                o2.name);
//
        return (IdCompare == 1) ? NameCompare
                : IdCompare;
    }



    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student(11,"Hinal"));
        a1.add(new Student(12,"jiva"));
        a1.add(new Student(13,"bishanu"));
        a1.add(new Student(14,"Ashi"));
        a1.add(new Student(15,"Kashish"));


        Collections.sort(a1,new CustomComparator_Operator());

        System.out.println("\n AFter SOrting ");
        for (Student s1 :a1){
            System.out.println(s1.id + "  "+s1.name);
        }
    }
}
