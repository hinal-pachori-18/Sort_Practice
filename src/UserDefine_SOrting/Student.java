package UserDefine_SOrting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Student implements Comparable<Student> {
     int age;
     String name;

     Student(int age, String name) {
         this.age = age;
         this.name = name;
     }


     @Override
     public int compareTo(Student o) {
         if (age > o.age) {
             return 1;
         } else {
             return -1;
         }

     }
 }
class Main
{
    public static void main(String[] args) {
        ArrayList <Student> al = new ArrayList<Student>();
        al.add(new Student(12,"kiva"));
        al.add(new Student(44,"laysi"));
        al.add(new Student(22,"mini"));
        //
        for (Student s1 : al){
            System.out.println(s1.age + " " +s1.name);
        }
        //
        Collections.sort(al);
        //After Sorting
        for (Student s1 : al){
            System.out.println(s1.age + " " +s1.name);
        }
    }

}
