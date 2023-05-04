package Collection_Sort_example1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ex1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hinal");
        al.add("jsad");
        al.add("aaaaa");
        al.add("jdusa");

        //SOrting an list in ascending order.
//      Collections.sort(al);

        //Sorting an list in descending order.
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Sorting :" +al);
    }

}
