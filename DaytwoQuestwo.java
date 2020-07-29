import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DaytwoQuestwo {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of flowers");
      int num=sc.nextInt();
      System.out.println("enter cutting value");
      int k=sc.nextInt();
      ArrayList<Integer> arr=new ArrayList<Integer>();
      System.out.printf("Enter %d numbers",num);
      for(int i=0;i<num;i++){
         arr.add(sc.nextInt());
      }
      sc.close();
      Collections.sort(arr);    //ascending
      //storing arr in temp variable
      ArrayList<Integer> temp=new ArrayList<Integer>();
           for(int i=0;i<k;i++){  
            temp.add(arr.get(i));    
           }
         
           for(int i=arr.size()-1;i>=k;i--){
               temp.add(arr.get(i));

           }
           System.out.println(temp);
      
        }
      
    }
