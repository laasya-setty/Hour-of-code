/*getting palindromes in a given range*/ 
class Palindrome{
    
     static int check(int n){
        int sum=0,rem;
         if(n!=0){
             rem=n%10;
           sum=(sum*10)+rem;
           n=n/10;
           check(n);
           
         }
         return (sum==n)?1:0;  //ternary opertaion
    }
    static void range(int min,int max){
        for(int i=min;i<max;i++){
            if(check(i)==1){
                System.out.println(i);
            }
        }
    }

    





    public static void main(String args[]){
        range(10,100);
        
        
       
        


    }
}