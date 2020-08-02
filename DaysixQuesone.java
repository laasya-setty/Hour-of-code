/*Steven is a Mathematics professor. One day, he given you a stream of N integers. Your task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.

Input format
First line of input contains an integer N denoting the number of elements in the stream.

Next N lines contains integer x denoting the number to be inserted into the stream.

Output format
For each element added to the stream print the floor of the new median in a new line.

Code constraints
1 <= N <= 100

1 <= x <= 100

Sample testcases
Input 1
4
5 15 1 3
Output 1
5
10
5
4 */ 
/* Approach: for median ,first we have to sort the series in ascending order and then check the series 
if odd: print middle num
if even : take average of two middle values */

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class DaysixQuesone{
    Scanner sc=new Scanner(System.in);

    
 void median(){
     System.out.println("enter a number");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.printf("Enter %d numbers",n);
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       
    }
    //below comment is the inefficient method I tried
    /*int[] temp=new int[n];
    
    for(int i=0;i<arr.length;i++){
        val=arr[i];
        temp[i]=val;
        
        if(temp.length%2==0){
            int a=temp[i/2];
            int b=temp[(i/2)+1];
            int avg=(temp[a]+temp[b])/2;
            System.out.println(avg);
        }
        else if(temp.length%2!=0){
            System.out.println(temp[(i/2)+1]);
        }
    }
    System.out.println(Arrays.toString(temp));*/
    int val;
    ArrayList<Integer> temp=new ArrayList<Integer>();
    System.out.println("The medians are");
    for(int i=0;i<arr.length;i++){
           val=arr[i];
           temp.add(val);
           Collections.sort(temp);
          if(temp.size()%2==0){
            int a=temp.get(temp.size()/2);
            int b=temp.get((temp.size()/2)-1);
            int avg=(a+b)/2;
            System.out.println(avg);
        }
        else if(temp.size()%2!=0){
            System.out.println(temp.get(temp.size()/2));
        }

    }
    
    sc.close();
}

    public static void main(String args[]){
   
    DaysixQuesone obj= new DaysixQuesone();
    obj.median();
    
           
    }
}