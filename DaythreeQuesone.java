/*In the city of Queensland, there are N houses. Tom is looking for a piece of land in the 
city to build his house. He wants to buy the land where he can build the largest possible house. 
All the houses in the city lie in a straight line and all of them are given a house number and position 
of the house from the entry point in the city. Tom wants to find the house numbers between which
 he can build the largest house. 
 
 Output format
Print the house numbers between which Tom can build the largest house.

Code constraints
2 < N < 100 

No two houses will have the same position.

Sample testcases
Input 1
5
3 7
1 9
2 0
5 15
4 30
Output 1
4 5  */


import java.util.Scanner;
import java.util.HashMap;

public class DaythreeQuesone{
    
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
//code inside static block will only be executed once
    static {
        System.out.println("Enter the number of houses");
        
    }
    int num=sc.nextInt();
    //initialization block: executed whenever class is initialised
    {
        System.out.println("Enter house number and postions ");    
    }
   //method
     void enter(){
        
        for(int i=0;i<num;i++){
            int h=sc.nextInt(); //house num
            int p=sc.nextInt();  //position
           
            if(hash.containsKey(h) || hash.containsValue(p)){
                System.out.println("duplication occured enter again");
                h=sc.nextInt(); p=sc.nextInt();
                while(hash.containsKey(h) || hash.containsValue(p)){
                    System.out.println("duplication occured enter again");
                    h=sc.nextInt(); p=sc.nextInt();
                }
                hash.put(h,p); 
            }
            else{
            hash.put(h,p);
            }
        }
        }
        //to sort positions there is no direct method,we have to use Comparator which is a huge process
        //so for now while giving input use ascending order
             public static void main(String args[]){
        
        DaythreeQuesone obj=new DaythreeQuesone();
       obj.enter();
        

       
    
    }
}