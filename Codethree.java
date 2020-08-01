/*General Forge and Foundry pays its salespeople by commission. If a salesperson sells less than Rs.10,000 in a week the commission is 4% of the sales. Otherwise, if the salesperson sells at least Rs.10,000 in a week, the commission is 5%. Write a program that will accept the amount of sales in a week from ‘N’ salespersons, then outputs the amount of commission earned by each salesperson and the total commission 

Input format
Number of Sales person(N) in first line

N person's sales amount in separate lines

Output format
Each salesperson's commission in a separate line and the total commission

Sample testcases
Input 1
5
10000
1000
5000
4000
150000
Output 1
Person 1 : 500.00
Person 2 : 40.00
Person 3 : 200.00
Person 4 : 160.00
Person 5 : 7500.00
Total Commission :8400.00 */


import java.util.*;
public class Codethree {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of sales person");
    int num=sc.nextInt();
    long[] amt=new long[num];
    System.out.println("Enter their sales amounts");
    for(int i=0;i<amt.length;i++){
        amt[i]=sc.nextLong();
    }
    sc.close();
     long commission;
    for(int i=0;i<amt.length;i++){
        if(amt[i]<10000){
            commission=(4*amt[i])/100;
           System.out.printf("Person %d : %d\n",i+1,commission);
        }
        else if(amt[i]>=10000){
            commission=(5*amt[i]/100);
            System.out.printf("Person %d : %d\n",i+1,commission);
        }
    }
}
    
}