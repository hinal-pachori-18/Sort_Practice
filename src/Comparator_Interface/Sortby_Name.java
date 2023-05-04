package Comparator_Interface;

import java.util.Comparator;

public class Sortby_Name implements Comparator<Employee> {

    @Override
    //sorting in ascending order
    public int compare(Employee e1, Employee e2) {
        return  e1.emp_name.compareTo(e2.emp_name);
    }
}

