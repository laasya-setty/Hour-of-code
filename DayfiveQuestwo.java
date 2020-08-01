/*Akash is very much interested in sorting the arrays. One day, he tries to sort the array. But , there is a condition that he should sort the array according to the product of the digits. Help him to sort the array.

Input format
First line of input contains the integer N denotes size of the array arr.

Next line contains N space separated integers.

Output format
Output the sorted array

Code constraints
2 <= N <= 100

Sample testcases
Input 1
5
12 10 102 31 15
Output 1
10 102 12 31 15 
 */
import java.util.Arrays;
import java.util.Scanner;
public class DayfiveQuestwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        int value,rem,prod;
        System.out.printf("enter %d values",num);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
              }
              int[] pro=new int[num];

             for(int j=0;j<num;j++){
                value=arr[j];
                prod=1;
                while(value>0){
                   
                    rem=value%10;
                    prod=prod*rem;
                    value=value/10;
                    pro[j]=prod;
                  }
                

                 }
                
                System.out.println("product array");
                 for(int i=0;i<num;i++){
                     System.out.println(pro[i]);
                 }
                 
                 int temp;
                 for(int j=0;j<num-1;j++){
                     for(int i=j+1;i<num;i++){
                     if(pro[j]>pro[i]){
                      temp=pro[j];
                      pro[j]=pro[i];
                      pro[i]=temp;
                      temp=arr[j];
                      arr[j]=arr[i];
                      arr[i]=temp;  
                      
                     }
                     
                    }

                 }
                 System.out.println("the sorted array is");
                 System.out.println(Arrays.toString(arr));
                 
sc.close();
    }
}