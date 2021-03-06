package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingOfMonths{
 public static void main(String[] args) {

     List<String> list = Arrays.asList("janaury","march","december","april","june");
     
      Collections.sort(list,  new Comparator<String>() {
         public int compare(String o1, String o2) {
             try {
                 SimpleDateFormat sdf = new SimpleDateFormat("MMM");
                 return sdf.parse(o1).compareTo(sdf.parse(o2));  
             } catch (ParseException ex) {
                 return o1.compareTo(o2);
             }
         }
     });
     
     System.out.println(list);

 }
 
}

