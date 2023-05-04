import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class String_Length_Comparator
{
     static Comparator <String > str = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() > o2.length())
            {
                return 1;
            }
            else{
                return -1;
            }
        }
    };
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("abcde");
        name.add("abc");
        name.add("abcdefg");
        name.add("abcs");
        Collections.sort(name,str);
        System.out.println(name);

    }
}
