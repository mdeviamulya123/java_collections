package java_collections_Pe6;



import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;

public class Pe6 {
   public static void main(String args[]) {

       HashSet<String> names = new HashSet<String>();
           
       names.add("Harry");
       names.add("Olive");
       names.add("Alice");
       names.add("Bluto");
       names.add("Eugene");
           
       System.out.println("HashSet elements before sorting: "+names);
           
           
       // Method 1: Sorting HashSet using List interface
       List<String> nameList = new ArrayList<String>(names);
       Collections.sort(nameList);
           
       // Displaying list
       System.out.println("HashSet elements after sorting: "+nameList);
           
       
   }

}