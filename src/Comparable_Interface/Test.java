package Comparable_Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(2,"Hinal",22);
        Student s2 = new Student(3,"Jinal",50);
        Student s3 = new Student(1,"Pinal",33);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        for (Student str: list
             ) {
            System.out.println(str.id + str.name +str.age);
        }
    }
}
