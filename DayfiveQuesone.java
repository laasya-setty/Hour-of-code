import java.util.*;
public class DayfiveQuesone {
    
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     sc.close();
     


     String[] words=str.split(" ");
     String finalstr="";
     
     
        for(int i=0;i<words.length;i++){ 
        String each=words[i];
        String reversed="";
      
        for(int j=each.length()-1;j>=0;j--){
            reversed=reversed+each.charAt(j);

        }
        finalstr=finalstr+reversed;
     } 
     System.out.println(finalstr);
     

      
    }
}