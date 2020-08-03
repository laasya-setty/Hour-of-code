import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DaysevenQuesone {
    Scanner sc=new Scanner(System.in);
    void coin(){
        System.out.println("enter a number");
        int num=sc.nextInt();
        while(num%2!=0){
            System.out.println("Only even numbers allowed");
            num=sc.nextInt();
        }
      ArrayList<Integer> arr=new ArrayList<Integer>();
      System.out.printf("enter %d numbers",num);
      for(int i=0;i<num;i++){
          arr.add(sc.nextInt());
      }
      Collections.sort(arr,Collections.reverseOrder()); //desc
      System.out.println("sorted array is "+arr);
      /*if player one(me) goes first I'll take first element->odd
       player 2 takes even elemnt then again me odd
       So we need sum of amount player one collects so,
       concentrate on odds(or just think like taking every alternate element) */
        int sum=0;
        for(int i=0;i<num;i++){
            if(i%2==0){
                sum=sum+arr.get(i);
            }
        }
        System.out.println(sum);


    }
    
    public static void main(String args[]){
       DaysevenQuesone obj=new DaysevenQuesone();
         obj.coin();
    }
}