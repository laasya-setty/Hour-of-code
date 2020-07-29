/*Write a program to display the multiples of a number 'n' upto the given limit 'L'
 and print the sum of all the multiples in it.*/
import java.util.*;
 public class DaytwoQuesone {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int start=sc.nextInt();
     System.out.println("Enter the limit");
     int limit=sc.nextInt();
     sc.close();
     int multiple=start;
     int next=0,sum=0;
     System.out.printf("the multiples of %d are",start);
     //main code
     while(limit!=0){
         next=next+multiple;
         sum=sum+next;
         System.out.println(next);
         limit--;
     }
     System.out.println("The total sum of multiples is");
     System.out.println(sum);
    }
    
}