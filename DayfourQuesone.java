/*Mr. Watson likes palindrome numbers very much. So, you should help Mr.watson to find the palindrome numbers between the given limits. You are given a two limits i.e upper limit 'u' and lower limit 'l'. You should find the palindrome numbers between the given limits.

Input format
First and only line of input consists of two integers u and l

Output format
Print all the Palindrome numbers between the given limits.

Code constraints
1< u,l < 1000

Sample testcases
Input 1
10 80
Output 1
11 22 33 44 55 66 77  */

import java.util.Scanner;
public class DayfourQuesone{
        
            
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        sc.close();
        
        for(int i=min+1;i<max;i++){
            int rem,sum=0,val;
              val=i;
            while(val!=0){
                rem=val%10;
                sum=(sum*10)+rem;
                val=val/10;
                 
            }
            if(sum==i){
                System.out.println(i);
          }
    }
}
}