/*Given you two positive integers 'a' and 'b'. You are required to calculate the sum of the numbers divisible
 by 3 and 5, between 'a' and 'b' both inclusive and return same. */

 import java.util.*;;
 public class DayoneQuestwo {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
         int c=sc.nextInt();
         int d=sc.nextInt();
         sc.close();
            int sum=0;
         for(int i=c;i<=d;i++){
            if((i%3==0) && (i%5==0)){                 /*Suppose we givr range of 14 and 31
                                                          we have 2 nums 15 and 30 divisible by both 3 and 5
                                                    so output is sum of 15+30=45 */
                sum=sum+i;
            }
            
    }
    System.out.println(sum);
}
 }