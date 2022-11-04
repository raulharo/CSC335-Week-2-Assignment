import java.util.*;
public class StringSort
{
   public static void main(String[] args)
   {
      String[] values =  {"mouse", "dog", "cat", "horse", "cow",
         "moose", "tiger", "lion", "elephant", "bird", "hamster",
         "guinea pig", "leopard", "aardvark", "hummingbird"};

      System.out.println("List of strings before sorting: ");
      for(String val: values){
          System.out.println(val);
      }

      Arrays.sort(values);

      System.out.println("\nList of strings after sorting: ");
      for(String val: values){
          System.out.println(val);
      }
   }
}
