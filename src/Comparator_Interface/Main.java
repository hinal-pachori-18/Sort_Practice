package Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        Employee e1 = new Employee(101,"Tinesh");
        Employee e2 = new Employee(104,"Suresh");
        Employee e3 = new Employee(102,"Manish");
        Employee e4 = new Employee(103,"KashishA");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);

        System.out.println("Sort by Id\n");
        Collections.sort(emp,new Sortby_Id());
        for (Employee E_id:emp
             ) {
            System.out.println(E_id.emp_id + " " + E_id.emp_name );

        }
        System.out.println("Sort by Name\n");
        Collections.sort(emp,new Sortby_Name());
        for (Employee E_name:emp
        ) {
            System.out.println(E_name.emp_id + " " + E_name.emp_name );
        }
    }
}
