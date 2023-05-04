package Comparator_Interface;

import java.util.Comparator;

public class Sortby_Id implements Comparator <Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.emp_id > e2.emp_id){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
