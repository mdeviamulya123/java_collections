package java_collections_Pe7;







import java.util.ArrayList;
public class Pe7
{
     public static void main(String [] args)
     {
          ArrayList<String> c1= new ArrayList<String>();
          c1.add("Java");
          c1.add("C");
          c1.add("C++");
          c1.add("Python");
          c1.add("JavaScript");

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("Java");
          c2.add("Angular");
          c2.add("C++");
          c2.add("JavaScript");

          //Storing the comparison output in ArrayList<String>
          ArrayList<String> c3= new ArrayList<String>();
          for (String temp : c1)
              c3.add(c2.contains(temp) ? "Yes" : "No");
          System.out.println(c3);

          //Storing the comparison output in ArrayList<Integer>
          ArrayList<Integer> c4= new ArrayList<Integer>();
          for (String temp2 : c1)
               c4.add(c2.contains(temp2) ? 1 : 0);
          System.out.println(c4);
     }
}