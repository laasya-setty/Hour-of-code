/*Professor Rakesh is very much interested in Mathematical algorithms. Professor Rakesh Given you two positive integers 'a' and 'b'. You are required to calculate the sum of the numbers divisible by 3 and 5, between 'a' and 'b' both inclusive and return same.

Input format
The first and only line of input consists of two integers a and b

Output format
Output the sum of numbers that are divisible by 3 and 5

Code constraints
1 < a,b <1000

Sample testcases
Input 1
12 50
Output 1
90 */

import java.util.Scanner;
public class DayfourQuestwo {
    static void check(int min,int max){
        int sum=0;
     for(int i=min;i<max;i++){
         if(i%3==0 && i%5==0){
            sum=sum+i;
         }

     }
     System.out.println(sum);
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 2 numbers");
     int min=sc.nextInt();
     int max=sc.nextInt();
     check(min,max);
     sc.close();
    }
    
}